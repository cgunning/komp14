
.class FizzBuzz
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method test(II)Z
	.limit locals 4
	.limit stack 6
	aload 0
	iload 1
	iload 2
	invokevirtual FizzBuzz/modulo(II)I
	istore 3
	iload 3
	ldc_w 1
	if_icmpge label7
	ldc_w 1
	goto label8
	label7:
	ldc_w 0
	label8:
	ldc_w 0
	ldc_w 1
	isub
	iload 3
	if_icmpge label9
	ldc_w 1
	goto label10
	label9:
	ldc_w 0
	label10:
	ifeq label11
	ifeq label12
	ldc_w 1
	goto label13
	label11:
	pop
	label12:
	ldc_w 0
	goto label13
	label13:
	areturn
.end method

.method modulo(II)I
	.limit locals 3
	.limit stack 6
	label14:
	iload 2
	iload 1
	ldc_w 1
	iadd
	if_icmpge label15
	ldc_w 1
	goto label16
	label15:
	ldc_w 0
	label16:
	ifeq label17
	iload 1
	iload 2
	isub
	istore 1
	goto label14
	label17:
	iload 1
	ireturn
.end method

