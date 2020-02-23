# PINEAPPLE C COMPILER

## Compiler build
```
make bin/c_compiler
```

## Compiler execution

### Testing mode
To run compiler in debug mode (creating test binary, running on simulator)
```
make clean
make bin/c_compiler
bin/c_compiler -TEST [source-file.c] -o [dest-file.s]

```

### Submission mode
To run compiler as per spec (only creating MIPS assembly)
```
make clean
make bin/c_compiler
bin/c_compiler -S [source-file.c] -o [dest-file.s]

```
