# PINEAPPLE C COMPILER

## Compiler build
```
make bin/c_compiler
```

## Compiler execution

### Testing mode
To run compiler in debug mode (creating test binary, running on simulator)
```
make bin/c_compiler
bin/c_compiler -TEST [source-file.c] -o [dest-file.s]

```

### Test with driver

On a linux machine

```
mips-linux-gnu-gcc -mfp32 -o test_program.o -c a.s
mips-linux-gnu-gcc -mfp32 -static -o test_program test_program.o driver.c
qemu-mips test_program
```

### Submission mode
To run compiler as per spec (only creating MIPS assembly)
```
make bin/c_compiler
bin/c_compiler -S [source-file.c] -o [dest-file.s]

```
### Configuring ANTLR
To build java files properly
```
sudo cp ./antlr-4.8-complete.jar /usr/local/lib
export CLASSPATH=".:/usr/local/lib/antlr-4.8-complete.jar:$CLASSPATH"
alias antlr4='java -jar /usr/local/lib/antlr-4.8-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig' 
```

### Using ANTLR trees

Some example trees are [here](sample_trees). You can generate a tree by running either of these commands depending on the grammar you would like to study
```
make tree/compiler
make tree/translator
```

### Testbenches

There are three testbenches: one for the translator and two for the compiler (one as a driver and one as a main). To run the testbench on a specific compiler:
```
[TESTBENCH NAME] [COMPILER DIRECTORY] [TESTS DIRECTORY] > [RESULTS OUTPUT DIRECTORY]
```

### Project managmement

THe project milestones and efforts can be viewed in details in the issues of the project. Issue [15](https://github.com/JaafarRammal/EE2-Compiler/issues/15) refers to more details about the different efforts and startegies. Overall, we have completed ~90% of the goals setup. Many of the expecations were altered by the sudden Coronavirus outbreak (hopefully gone by the time you are reading this)

### Authors

Jaafar Rammal ([github](https://github.com/JaafarRammal))
Raphael Bijaoui ([github](https://github.com/RaphaelBijaoui))