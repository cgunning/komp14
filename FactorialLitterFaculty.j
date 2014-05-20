
.class FactorialLitterFaculty
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method run(I)I
	.limit locals 5
	.limit stack 12
	ldc_w 1
	istore 2
	label1:
	iload 1
	ldc_w 0
	if_icmpeq label3
	ldc_w 1
	goto label4
	label3:
	ldc_w 0
	label4:
	ifeq label2
	ldc_w 1
	istore 4
	iload 1
	iload 2
	imul
	istore 3
	iload 1
	iload 4
	isub
	istore 1
	iload 3
	istore 2
	goto label1
	label2:
	iload 2
	ireturn
.end method

