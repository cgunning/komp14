
.class IAmTheBogusClass
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method NotMe(ZZ)Z
	.limit locals 3
	.limit stack 8
	iload 1
	iload 2
	ifeq label18
	ifeq label19
	ldc_w 1
	goto label20
	label18:
	pop
	label19:
	ldc_w 0
	goto label20
	label20:
	ifeq label22
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 1
	invokevirtual java/io/PrintStream/println(I)V
	goto label21
	label22:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 2
	invokevirtual java/io/PrintStream/println(I)V
	label21:
	ldc_w 1
	ireturn
.end method

.method ItWasMeAllAlong(I)I
	.limit locals 3
	.limit stack 4
	iload 1
	ldc_w 0
	if_icmpge label23
	ldc_w 1
	goto label24
	label23:
	ldc_w 0
	label24:
	ifeq label26
	ldc_w 10000000
	istore 2
	goto label25
	label26:
	ldc_w 1000
	istore 2
	label25:
	iload 2
	ireturn
.end method

