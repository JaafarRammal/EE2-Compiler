#place translator bytecode & compiler bash script in same folder
java:
	make clean
	javac ./compiler/antlr/*.java
	javac ./compiler/*.java
bin/c_compiler:
	make java
	rm -rf ./bin
	mkdir bin
	cp ./c_compiler.sh ./bin
	mv ./bin/c_compiler.sh ./bin/c_compiler
	chmod u+x ./bin/c_compiler

#compile translator from makefile. 
# translator: 
# 	javac ./c_translator/*.java

#NOTE: antlr4 command not recognised by make, difficult workaround. Compile grammar manually.
grammar:

clean:
	rm -rf ./bin
	rm -rf ./src/*/*.class

