# Building with ANTLR

Instructions on how to build with ANTLR

### Build the package


Translator:

From the /EE2-Compiler/translator directory:
```
antlr4 C.g4 -visitor -package translator.antlr -o antlr
javac ./antlr/*.java
```


Compiler:

From the /EE2-Compiler/compiler directory:
```
antlr4 C.g4 -visitor -package compiler.antlr -o antlr
javac ./antlr/*.java
```

### Visualize the tree

From the /EE2-Compiler directory:

```
javac ./translator/*.java
grun translator.antlr.C translation_unit -gui

javac ./compiler/*.java
grun compiler.antlr.C compilationUnit -gui
```

Then enter your C code and press CTRL+D

### Use the listener

From the /EE2-Compiler directory:

```
javac ./translator/*.java
java translator.CTranslator
```

Then enter your C code and press CTRL+D

### Use the visitor

From the /EE2-Compiler directory:

```
javac ./compiler/*.java
java compiler.CCompiler
```

Then enter your C code and press CTRL+D