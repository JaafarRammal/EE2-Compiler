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

########## MIPS BINARY CREATION ##############

#makes parser that takes assembly text file as arg 1, moves into bin
parser:
	#mkdir -p bin
	cd mips_bingen && $(MAKE)
	cp ./mips_bingen/bin/parser ./bin
