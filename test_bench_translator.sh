#!/bin/bash

#rm tmp/formative/*

if which dos2unix ; then
    DOS2UNIX="dos2unix"
elif which fromdos ; then
    DOS2UNIX="fromdos"
else
    # This works on a GNU version of sed. I think this
    # will work in OSX as well, but don't have a machine
    # on which to test that. From reading the OSX docs,
    # it looks compatible.
    # The code \x0D is the ASCII code of carriage-return,
    # so it the regex should delete any CRs at the end of
    # a line (or anywhere in a line)
    DOS2UNIX="sed -e s/\x0D//g -"
    # Tested for combinations of:
    # - Ubuntu
    # - Cygwin
    # and inputs formats:
    # - LF
    # - CRLF
fi

blk=$'\x1b[90m' # Sets text to black
red=$'\x1b[31m' # Sets text to red
grn=$'\x1b[92m' # Sets text to green
ylw=$'\x1b[93m' # Sets text to yellow
blu=$'\x1b[94m' # Sets text to blue
pur=$'\x1b[95m' # Sets text to purple
cyn=$'\x1b[96m' # Sets text to cyan
wht=$'\x1b[97m' # Sets text to white
rst=$'\x1b[0m'  # resets to default terminal color

n_fail=0
n_succ=0
n_tot=0

if [[ "$1" != "" ]] ; then
    compiler="$1"
else
    compiler="bin/c_compiler"
fi

have_compiler=0
if [[ ! -f bin/c_compiler ]] ; then
    make all -B
fi

input_dir="c_translator/formative"

working="tmp/formative"
mkdir -p ${working}


for i in ${input_dir}/*.c ; do
    base=$(echo $i | sed -E -e "s|${input_dir}/([^.]+)[.]c|\1|g");
    >&2 echo $base
    # Compile the reference C version
    gcc $i -std=c89 -ansi -o $working/$base
    
    # Run the reference C version
    $working/$base
    REF_C_OUT=$?
    
    
    if [[ ${have_compiler} -eq 0 ]] ; then
        
        # Create the DUT python version by invoking the compiler with translation flags
        $compiler --translate $i -o ${working}/$base-got.py
        
        # Run the DUT python version
        python ${working}/$base-got.py
        GOT_P_OUT=$?
    fi
    
    if [[ ${have_compiler} -ne 0 ]] ; then
        echo "$base, Fail, No C translator found"
        let "n_fail++"
    elif [[ $REF_C_OUT -ne $GOT_P_OUT ]] ; then
        echo -e "${red}$base.c [FAIL] ${pur}Expected ${REF_C_OUT} got ${GOT_P_OUT}${wht}"
        echo -e "\033[33;36m" "Navigate to -> c_translator/formative/$base.c"
        echo -e "\033[33;36m" "	     -> tmp/formative/$base-got.py"
        rm tmp/formative/$base
        let "n_fail++"
    else
        echo -e "${wht}$base.c ${grn}[PASS]""${wht}"
	    #rm tmp/formative/$base-got.py
	    rm tmp/formative/$base
        let "n_succ++"
    fi
    let "n_tot++"
done

echo ""
echo ${ylw}"Passed" ${n_succ} "out of "${n_tot}
echo ${ylw}"Failed" ${n_fail} "out of "${n_tot}
 
echo -e "\033[33;38m" "***gcc will always output an error if the C file does not compile***"
echo -e "\033[33;38m" "***Syntax Errors are a fault of the c_compiler, not gcc***"
