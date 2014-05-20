
.class NeitherAmI
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method printInteger(I)I
	.limit locals 3
	.limit stack 16
	ldc_w 0
	iload 1
	if_icmpge label5
	ldc_w 1
	goto label6
	label5:
	ldc_w 0
	label6:
	iload 1
	ldc_w 1000
	if_icmpge label7
	ldc_w 1
	goto label8
	label7:
	ldc_w 0
	label8:
	ifeq label9
	ifeq label10
	ldc_w 1
	goto label11
	label9:
	pop
	label10:
	ldc_w 0
	goto label11
	label11:
	ifeq label13
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 1
	invokevirtual java/io/PrintStream/println(I)V
	iload 1
	ldc_w 1
	iadd
	istore 2
	goto label12
	label13:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 1
	invokevirtual java/io/PrintStream/println(I)V
	iload 1
	ldc_w 1
	isub
	istore 2
	label12:
	iload 2
	ireturn
.end method

.method weirdFunction(I)I
	.limit locals 3
	.limit stack 10
	ldc_w 1
	iload 1
	if_icmpge label14
	ldc_w 1
	goto label15
	label14:
	ldc_w 0
	label15:
	ifeq label17
	aload 0
	ldc_w 0
	invokevirtual NeitherAmI/weirdFunction(I)I
	istore 2
	goto label16
	label17:
	ldc_w 47
	istore 2
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 11
	invokevirtual java/io/PrintStream/println(I)V
	label16:
	iload 2
	ireturn
.end method

