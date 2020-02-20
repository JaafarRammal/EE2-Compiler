# Building with ANTLR

Instructions on how to build with ANTLR

### Build the package

From the /EE2-Compiler/src directory:

```
antlr4 C.g4 -visitor -package src.antlr -o antlr
javac ./antlr/*.java
```

### Visualize the tree

From the /EE2-Compiler directory:

```
javac ./src/*.java
grun src.antlr.C translation_unit -gui
```

Then enter your C code and press CTRL+D

### Use the listener

From the /EE2-Compiler directory:

```
javac ./src/*.java
java src.CTranslator
```

Then enter your C code and press CTRL+D

### Use the visitor

From the /EE2-Compiler directory:

```
javac ./src/*.java
java src.CCompiler
```