
.class IAmNotABogusClass
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 4
	.limit stack 13
	ldc_w 4711
	istore 1
	ldc_w 2
	istore 2
	ldc_w 1
	iload 2
	iadd
	istore 3
	iload 3
	ldc_w 1010
	if_icmpge label1
	ldc_w 1
	goto label2
	label1:
	ldc_w 0
	label2:
	ifeq label4
	iload 2
	ldc_w 1000
	iadd
	istore 2
	goto label3
	label4:
	iload 1
	iload 3
	iadd
	iload 2
	ldc_w 1000
	isub
	iadd
	istore 2
	ldc_w 10
	istore 3
	label3:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 2
	iload 3
	iadd
	invokevirtual java/io/PrintStream/println(I)V
	return
.end method

