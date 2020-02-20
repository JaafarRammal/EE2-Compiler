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
  output=$(printf "$C_CODE" | java c_translator.CTranslator)
  #----- reading line by line, including indentation -----
  IFS=''
  while read data; do
      echo "$data" >> "$4" #inputting code into file, line by line
  done <<< $output
fi