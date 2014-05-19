
.class Fibonacci
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method start(I)I
	.limit locals 6
	.limit stack 16
	ldc_w 0
	istore 2
	ldc_w 1
	istore 3
	ldc_w 0
	istore 4
	ldc_w 2
	istore 5
	label44:
	iload 5
	iload 1
	if_icmpge label46
	ldc_w 1
	goto label47
	label46:
	ldc_w 0
	label47:
	ifeq label45
	iload 2
	iload 3
	iadd
	istore 4
	iload 3
	istore 2
	iload 4
	istore 3
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 4
	invokevirtual java/io/PrintStream/println(I)V
	iload 5
	ldc_w 1
	iadd
	istore 5
	goto label44
	label45:
	iload 4
	ireturn
.end method

