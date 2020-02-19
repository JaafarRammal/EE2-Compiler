bin/c_compiler:
	rm -rf ./bin
	mkdir bin
	cp ./c_compiler.sh ./bin
	mv ./bin/c_compiler.sh ./bin/c_compiler
	chmod u+x ./bin/c_compiler

clean:
	rm -rf ./bin