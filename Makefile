#!bin/bash

#place translator bytecode & compiler bash script in same folder
bin/c_compiler:
	make java
	rm -rf ./bin
	mkdir bin
	make parser
	cp ./c_compiler.sh ./bin
	mv ./bin/c_compiler.sh ./bin/c_compiler
	chmod u+x ./bin/c_compiler

java:
	make clean
	javac ./translator/antlr/*.java
	javac ./translator/*.java
	# javac ./compiler/antlr/*.java
	# javac ./compiler/*.java

clean:
	rm -rf ./bin
	rm -rf ./compiler/antlr/*.class
	rm -rf ./compiler/*.class
	rm -rf ./translator/antlr/*.class
	rm -rf ./translator/*.class

########## MIPS BINARY ##############

#makes parser that takes assembly text file as arg 1, moves into bin
parser:
	#mkdir -p bin
	cd mips_bingen && $(MAKE)
	cp ./mips_bingen/bin/parser ./bin

########## MIPS SIMULATOR ############

# For simulator
CC = g++
CPPFLAGS = -W -std=c++11 #Wall means Write All
SRC_FILES = simulator/src/simulator.cpp simulator/src/functions.cpp simulator/src/r_type_instructions.cpp simulator/src/i_type_instructions.cpp  simulator/src/j_type_instructions.cpp
DEBUG_SETTING = 1

bin/mips_simulator: $(SRC_FILES)
	mkdir -p bin
	$(CC) $(CPPFLAGS) $(SRC_FILES) -o bin/mips_simulator

# Dummy for build simulator to conform to spec
simulator: bin/mips_simulator
