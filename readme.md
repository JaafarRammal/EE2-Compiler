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
make clean
make bin/c_compiler
bin/c_compiler -S [source-file.c] -o [dest-file.s]

```
