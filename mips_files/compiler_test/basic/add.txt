addiu $sp, $sp, -12
sw $fp, 4($sp)
or $fp, $sp, $sp

or $sp, $fp, $fp
lw $fp, 4($sp)
addiu $sp, $sp, 12
jr $31
nop
