#!/bin/bash
blk=$'\x1b[90m' # Sets text to black
red=$'\x1b[31m' # Sets text to red
grn=$'\x1b[92m' # Sets text to green
ylw=$'\x1b[93m' # Sets text to yellow
blu=$'\x1b[94m' # Sets text to blue
pur=$'\x1b[95m' # Sets text to purple
cyn=$'\x1b[96m' # Sets text to cyan
wht=$'\x1b[97m' # Sets text to white

if [[ -z "$1" ]]; then 
    COMPILER=bin/c_compiler
else
    COMPILER=$1
fi

if [[ -z "$2" ]]; then 
    workingin=test/mips_test/testin
else
    workingin=$2
fi

workingout="test/mips_test/output"

mkdir -p $workingout

n_fail=0
n_succ=0
n_tot=0

for DRIVER in $workingin/*_driver.c ; do
    NAME=$(basename $DRIVER _driver.c)
    TESTCODE=$workingin/$NAME.c
    >&2 echo $NAME
        
    # Generate assembly for driver
    mips-linux-gnu-gcc -S -w -march=mips1 -mfp32 -O0 $DRIVER -o $workingout/${NAME}_driver.s
    if [[ $? -ne 0 ]]; then
        >&2 echo "ERROR : Couldn't compile driver program using GCC."
        continue
    fi
    
    # Generate assembly for slave
    $COMPILER -S $workingin/${NAME}.c -o $workingout/${NAME}.s
    if [[ $? -ne 0 ]]; then
        >&2 echo "ERROR : Compiler returned error message."
        continue
    fi
    
    # Generate GOT_EXIT_CODE
    mips-linux-gnu-gcc -w -static $workingout/${NAME}_driver.s $workingout/${NAME}.s -o $workingout/${NAME}_result
    qemu-mips $workingout/${NAME}_result
    GOT_EXIT_CODE=$?
    
    # Generate EXP_EXIT_CODE
    mips-linux-gnu-gcc -w -static -march=mips1 -mfp32 -O0 $workingin/${NAME}.c $workingin/${NAME}_driver.c -o $workingout/${NAME}_gcc_result
    qemu-mips $workingout/${NAME}_gcc_result
    EXP_EXIT_CODE=$?
    
    if [[ $GOT_EXIT_CODE -ne $EXP_EXIT_CODE ]]; then
        echo -e ${red}$NAME.c "[FAIL]" ${pur}"Expected" $EXP_EXIT_CODE ", got" $GOT_EXIT_CODE ${wht}
        let "n_fail++"
    else
   	    echo -e ${grn}$NAME.c "[PASS]"${wht}
        let "n_succ++"
    fi

    let "n_tot++"
    
done

echo ""
echo ${ylw}"Passed" ${n_succ} "out of "${n_tot}
echo ${ylw}"Failed" ${n_fail} "out of "${n_tot}

echo -e "\033[33;38m" "***gcc will always output an error if the C file does not compile***"
echo -e "\033[33;38m" "***Syntax Errors are a fault of the c_compiler, not gcc***"

