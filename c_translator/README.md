# Building with ANTLR

Instructions on how to build with ANTLR

### Build the package

From the /EE2-Compiler/c_translator directory:

```
antlr4 C.g4 -package c_translator.antlr -o antlr
javac ./antlr/*.java
```

### Visualize the tree

From the /EE2-Compiler directory:

```
javac ./c_translator/*.java
grun c_translator.antlr.C translation_unit -gui
```

Then enter your C code and press CTRL+D

### Use the listener

From the /EE2-Compiler directory:

```
javac ./c_translator/*.java
java c_translator.CTranslator
```

Then enter your C code and press CTRL+D
