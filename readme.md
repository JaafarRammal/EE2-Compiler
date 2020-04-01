# PINEAPPLE C COMPILER

For our second year Language Processors module, we were tasked to build a C-compiler, as well as a C to Python translator. More details about the specifications can be found in the course repo [here](https://github.com/LangProc/langproc-2019-cw)

We decided to use Java and ANTLR to build our compiler. The translator uses a Listener and traverses the parse-tree once. The compiler uses a visitor, and completes the whole compilation in one pass. Yet, for some nodes, we visit the children twice as the contexts are dependent on each another (such as the types within a two-operands operation)

## Using the Compiler

### Compiler build
```
make bin/c_compiler
```

### Compiling C to MIPS
To run compiler as per spec (only creating MIPS assembly)
```
make bin/c_compiler
bin/c_compiler -S [source-file.c] -o [dest-file.s]
```

### Translating C to Python
To run translator as per spec (only creating Python output)
```
make bin/c_compiler
bin/c_compiler -translate [source-file.c] -o [dest-file.y]
```

### Testbenches

There are three testbenches: one for the translator and two for the compiler (one as a driver and one as a main). To run the testbench on a specific compiler:
```
[TESTBENCH NAME] [COMPILER DIRECTORY] [TESTS DIRECTORY] > [RESULTS OUTPUT DIRECTORY]
```

### Test with custom simulator
To run compiler in debug mode (creating test binary, running on custom MIPS simulator)
```
make bin/c_compiler
make simulator
make parser
bin/c_compiler -TEST [source-file.c] -o [dest-file.s]
```
### Test with QEMU
On a linux machine
```
mips-linux-gnu-gcc -mfp32 -o test_program.o -c a.s
mips-linux-gnu-gcc -mfp32 -static -o test_program test_program.o driver.c
qemu-mips test_program
```

## Using our Java code

You will need to setup some paths correctly first and setup the ANTLR package. You can add the export and aliases to your ~/.bash_profile for consistency.

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

## Project managmement

The project milestones and efforts can be viewed in details in the issues of the project. [Issue 15](https://github.com/JaafarRammal/EE2-Compiler/issues/15) refers to more details about the different efforts and startegies. Overall, we have completed ~90% of the goals setup. Many of the expecations were altered by the sudden Coronavirus outbreak (hopefully gone by the time you are reading this)

### Authors

Jaafar Rammal ([github](https://github.com/JaafarRammal))
Raphael Bijaoui ([github](https://github.com/RaphaelBijaoui))
