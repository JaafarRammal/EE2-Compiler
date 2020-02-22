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


if [ $1 == "-S" ]
then
  # running C program into our Java C compiler
  C_SOURCEFILE=$( cat $2 )
  S_DESTFILE=$4

  #Compiler still has errors, so piping to translator
  output=$(printf "$C_SOURCEFILE" | java translator.CTranslator)
  #----- reading line by line, including indentation -----
  IFS=''
  while read data; do
      echo "$data" >> "$S_DESTFILE" #inputting code into file, line by line
  done <<< $output
fi

##Test for C program to MIPS code to execution
if [ $1 == "-TEST" ]
then

  # running C program into our Java C compiler
  C_SOURCEFILE=$( cat $2 )
  S_DESTFILE=$4
  SIMULATOR_PATH="./bin/mips_simulator"

  #getting base_name for .txt conversion
  base_name=${S_DESTFILE##*/}
  TXT_FILE="${base_name%.*}.txt"
  echo "${TXT_FILE}"
  BINARY_PATH="${base_name%.*}.bin"

  #Compiler still has errors, so piping to translator for now
  output=$(printf "$C_SOURCEFILE" | java translator.CTranslator)
  #----- reading line by line, including indentation -----
  IFS=''
  while read data; do
      echo "$data" >> "$TXT_FILE" #inputting code into txt file, line by line
  done <<< $output

  ./bin/parser $TXT_FILE

  ##Then can run on our own simulator
  output_s=$($SIMULATOR_PATH $BINARY_PATH)
  RETCODE=$?
  echo "The return code is: '${RETCODE}'"

fi

##Test ONLY assembly -> binary (while compiler in dev)
if [ $1 == "-TESTBIN" ]
then

  # running C program into our Java C compiler
  C_SOURCEFILE=$( cat $2 )
  S_DESTFILE=$4
  SIMULATOR_PATH="./bin/mips_simulator"

  #getting base_name for .txt conversion
  base_name=${S_DESTFILE##*/}
  TXT_FILE="${base_name%.*}.txt"
  echo "${TXT_FILE}"
  BINARY_PATH="${base_name%.*}.bin"

  #----- reading line by line, including indentation -----
  IFS=''
  while read data; do
      echo "$data" >> "$TXT_FILE" #inputting code into txt file, line by line
  done < $S_DESTFILE

  ./bin/parser $TXT_FILE

  ##Then can run on our own simulator
  output_s=$($SIMULATOR_PATH $BINARY_PATH)
  RETCODE=$?
  echo "The return code is: '${RETCODE}'"

fi