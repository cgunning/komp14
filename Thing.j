
.class Thing
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method run(IIIIIII)I
	.limit locals 8
	.limit stack 4
	iload 1
	iload 2
	iadd
	iload 3
	iadd
	iload 4
	iadd
	iload 5
	iadd
	iload 6
	iadd
	iload 7
	iadd
	ireturn
.end method

.method run2(IIIIIIII)I
	.limit locals 18
	.limit stack 16
	ldc_w 1
	istore 9
	ldc_w 2
	istore 10
	ldc_w 3
	istore 11
	ldc_w 4
	istore 12
	ldc_w 6
	istore 13
	ldc_w 7
	istore 14
	ldc_w 8
	istore 15
	ldc_w 9
	istore 16
	aload 0
	iload 9
	iload 10
	iload 11
	iload 12
	iload 5
	iload 13
	iload 14
	invokevirtual Thing/run(IIIIIII)I
	istore 17
	iload 7
	iload 9
	iadd
	iload 10
	iadd
	iload 11
	iadd
	iload 12
	iadd
	iload 13
	iadd
	iload 16
	iadd
	iload 17
	iadd
	ireturn
.end method

