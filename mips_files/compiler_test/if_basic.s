ori $v0, $v0, 1
sw $v0, 0($sp)		# "a" was stored in 0x00000000 on stack
ori $v0, $v0, 0
sw $v0, 4($sp)		# "b" was stored in 0x00000004 on stack
lw $v0, 0($sp)
sw $v0, 8($sp)
ori $v0, $v0, 1
sw $v0, 12($sp)
lw $t1, 12($sp)
lw $t0, 8($sp)
xor $v0, $t0, $t1
sltiu $v0, $v0, 1
beq $v0, $zero, _if_stat_false_0
nop
lw $v0, 1($sp)
sw $v0, 8($sp)
ori $v0, $v0, 1
sw $v0, 12($sp)
lw $t1, 12($sp)
lw $t0, 8($sp)
add $v0, $t0, $t1
sw $v0, 8($sp)
lw $v0, 1($sp)
addu $t2, $v0, $zero
lw $v0, 8($sp)
sw $v0, 1($sp)
j _if_stat_end_1
nop
_if_stat_false_0:
nop
_if_stat_end_1:

# END OF PROGRAM
jr $zero
