lw $v0, 0
sw $v0, 0($sp)
lw $v0, 0
sw $v0, 4($sp)
lw $t1, 4($sp)
lw $t0, 0($sp)
add $v0, $t0, $t1

# END OF PROGRAM
jr $zero
