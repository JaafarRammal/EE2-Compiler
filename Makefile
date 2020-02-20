#!bin/bash

#place translator bytecode & compiler bash script in same folder
bin/c_compiler:
	make java
	rm -rf ./bin
	mkdir bin
	cp ./c_compiler.sh ./bin
	mv ./bin/c_compiler.sh ./bin/c_compiler
	chmod u+x ./bin/c_compiler

java:
	make clean
	javac ./compiler/antlr/*.java
	javac ./compiler/*.java

clean:
	rm -rf ./bin
	rm -rf ./compiler/antlr/*.class
	rm -rf ./compiler/*.class

