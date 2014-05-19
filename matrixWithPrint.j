
.class matrixWithPrint
.super internalMatrix
.method public <init>()V
	aload_0
	invokenonvirtual internalMatrix/<init>()V
	return
.end method

.method printMatrix()Z
	.limit locals 3
	.limit stack 18
	ldc_w 0
	istore 1
	label69:
	iload 1
	aload 0
	invokevirtual matrixWithPrint/getRowLength()I
	if_icmpge label71
	ldc_w 1
	goto label72
	label71:
	ldc_w 0
	label72:
	ifeq label70
	ldc_w 0
	istore 2
	label73:
	iload 2
	aload 0
	invokevirtual matrixWithPrint/getColumnLength()I
	if_icmpge label75
	ldc_w 1
	goto label76
	label75:
	ldc_w 0
	label76:
	ifeq label74
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 0
	iload 1
	iload 2
	invokevirtual matrixWithPrint/getData(II)I
	invokevirtual java/io/PrintStream/println(I)V
	iload 2
	ldc_w 1
	iadd
	istore 2
	goto label73
	label74:
	iload 1
	ldc_w 1
	iadd
	istore 1
	goto label69
	label70:
	ldc_w 1
	ireturn
.end method

