#!/bin/bash

#$compiler --translate $i -o ${working}/$base-got.py

#pass argument $2, C code, here
#command D
#catch python code after line "Equivalent python is: "
#store text into argument $4 (check print)


if [ $1 == "--translate" ]
then
  # running C program into our Java C translator
  C_CODE=$( cat $2 )
  output=$(printf "$C_CODE" | java translator.CTranslator)
  #----- reading line by line, including indentation -----
  IFS=''
  while read data; do
      echo "$data" >> "$4" #inputting code into file, line by line
  done <<< $output
fi

#SUBMISSION MODE
#bin/c_compiler -S [source-file.c] -o [dest-file.s]

if [ $1 == "-S" ]
then
  #File path declarations
  C_SOURCEFILE=$( cat $2 )
  S_DESTFILE=$4
  SIMULATOR_PATH="./bin/mips_simulator"
  base_path=${S_DESTFILE%.*}
  base=${S_DESTFILE##*/}	#no preceding path
  base_name=${base%.*}
  echo "${base_name}"
  TXT_FILE="${base_path}.txt"
  BINARY_PATH="${base_path%.*}.bin"

  # Running C program into our Java C compiler
  output=$(printf '%s\n' "$C_SOURCEFILE" | java compiler.CCompiler)

  # Reading output from Compiler ompiler line by line, including indentation 
  IFS=''
  while read data; do
      echo "$data" >> "$S_DESTFILE" #inputting code into MIPS assembly file
      echo "$data" >> "$TXT_FILE" #inputting code into txt file, line by line
  done <<< $output
fi

#TESTING MODE
#bin/c_compiler -TEST [source-file.c] -o [dest-file.s]

if [ $1 == "-TEST" ]
then

  #File path declarations
  C_SOURCEFILE=$( cat $2 )
  S_DESTFILE=$4
  SIMULATOR_PATH="./bin/mips_simulator"
  base_path=${S_DESTFILE%.*}
  base=${S_DESTFILE##*/}	#no preceding path
  base_name=${base%.*}
  echo "${base_name}"
  TXT_FILE="${base_path}.txt"
  BINARY_PATH="${base_path%.*}.bin"

  # Running C program into our Java C compiler
  output=$(printf "$C_SOURCEFILE" | java compiler.CCompiler)

  # Reading output from Compiler ompiler line by line, including indentation 
  IFS=''
  while read data; do
      echo "$data" >> "$S_DESTFILE" #inputting code into MIPS assembly file
      echo "$data" >> "$TXT_FILE" #inputting code into txt file, line by line
  done <<< $output

  # Turning MIPS Assembly code (saved in a text file) into binary
  ./bin/parser "${TXT_FILE}"
  mv "${base_name}.bin" "${base_path}.bin"

  # Running MIPS binary on simulator
  output_s=$($SIMULATOR_PATH $BINARY_PATH)
  RETCODE=$?
  echo "The return code is: '${RETCODE}'"

fi