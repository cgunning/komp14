
.class internalMatrix
.super java/lang/Object
.field data [I
.field column I
.field row I
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method Init(II)Z
	.limit locals 3
	.limit stack 4
	aload 0
	iload 1
	putfield internalMatrix/row I
	aload 0
	iload 2
	putfield internalMatrix/column I
	aload 0
	iload 1
	iload 2
	imul
	newarray int
	putfield internalMatrix/data [I
	ldc_w 1
	ireturn
.end method

.method getRowLength()I
	.limit locals 1
	.limit stack 2
	aload 0
	getfield internalMatrix/row I
	ireturn
.end method

.method getColumnLength()I
	.limit locals 1
	.limit stack 2
	aload 0
	getfield internalMatrix/column I
	ireturn
.end method

.method getMatrixSize()I
	.limit locals 1
	.limit stack 2
	aload 0
	getfield internalMatrix/data [I
	arraylength
	ireturn
.end method

.method setData(III)Z
	.limit locals 5
	.limit stack 10
	aload 0
	invokevirtual internalMatrix/getMatrixSize()I
	aload 0
	invokevirtual internalMatrix/getRowLength()I
	iload 1
	imul
	iload 2
	iadd
	if_icmple label29
	ldc_w 1
	goto label30
	label29:
	ldc_w 0
	label30:
	ifeq label32
	ldc_w 1
	istore 4
	goto label31
	label32:
	ldc_w 0
	istore 4
	label31:
	iload 4
	ireturn
.end method

.method getData(II)I
	.limit locals 4
	.limit stack 6
	ldc_w 0
	istore 3
	aload 0
	invokevirtual internalMatrix/getRowLength()I
	iload 1
	imul
	iload 2
	iadd
	aload 0
	invokevirtual internalMatrix/getMatrixSize()I
	if_icmpge label33
	ldc_w 1
	goto label34
	label33:
	ldc_w 0
	label34:
	ifeq label35
	aload 0
	getfield internalMatrix/data [I
	aload 0
	invokevirtual internalMatrix/getRowLength()I
	iload 1
	imul
	iload 2
	iadd
	iaload
	istore 3
	label35:
	iload 3
	ireturn
.end method

.method matrixmultiplication(LinternalMatrixLinternalMatrix)LmatrixWithPrint
	.limit locals 11
	.limit stack 72
	aload 1
	invokevirtual internalMatrix/getRowLength()I
	istore 3
	aload 1
	invokevirtual internalMatrix/getColumnLength()I
	istore 4
	aload 2
	invokevirtual internalMatrix/getRowLength()I
	istore 5
	aload 2
	invokevirtual internalMatrix/getColumnLength()I
	istore 6
	iload 4
	iload 5
	if_icmpeq label37
	ldc_w 1
	goto label38
	label37:
	ldc_w 0
	label38:
	ifeq label40
	new matrixWithPrint
	dup
	invokespecial matrixWithPrint/<init>()V
	astore 9
	aload 9
	ldc_w 0
	ldc_w 0
	invokevirtual matrixWithPrint/Init(II)Z
	ifeq label41
	label41:
	goto label39
	label40:
	new matrixWithPrint
	dup
	invokespecial matrixWithPrint/<init>()V
	astore 9
	aload 9
	iload 3
	iload 6
	invokevirtual matrixWithPrint/Init(II)Z
	ifeq label43
	label43:
	ldc_w 0
	istore 7
	label45:
	iload 7
	iload 3
	if_icmpge label47
	ldc_w 1
	goto label48
	label47:
	ldc_w 0
	label48:
	ifeq label46
	ldc_w 0
	istore 8
	label49:
	iload 8
	iload 6
	if_icmpge label51
	ldc_w 1
	goto label52
	label51:
	ldc_w 0
	label52:
	ifeq label50
	aload 9
	iload 7
	iload 8
	ldc_w 0
	invokevirtual matrixWithPrint/setData(III)Z
	ifeq label53
	label53:
	iload 8
	ldc_w 1
	iadd
	istore 8
	goto label49
	label50:
	iload 7
	ldc_w 1
	iadd
	istore 7
	goto label45
	label46:
	ldc_w 0
	istore 7
	ldc_w 0
	istore 8
	label55:
	iload 7
	iload 3
	if_icmpge label57
	ldc_w 1
	goto label58
	label57:
	ldc_w 0
	label58:
	ifeq label56
	ldc_w 0
	istore 8
	label59:
	iload 8
	iload 6
	if_icmpge label61
	ldc_w 1
	goto label62
	label61:
	ldc_w 0
	label62:
	ifeq label60
	ldc_w 0
	istore 10
	label63:
	iload 10
	iload 4
	if_icmpge label65
	ldc_w 1
	goto label66
	label65:
	ldc_w 0
	label66:
	ifeq label64
	aload 9
	iload 7
	iload 8
	aload 9
	iload 7
	iload 8
	invokevirtual matrixWithPrint/getData(II)I
	aload 1
	iload 7
	iload 10
	invokevirtual internalMatrix/getData(II)I
	aload 2
	iload 10
	iload 8
	invokevirtual internalMatrix/getData(II)I
	imul
	iadd
	invokevirtual matrixWithPrint/setData(III)Z
	ifeq label67
	label67:
	iload 10
	ldc_w 1
	iadd
	istore 10
	goto label63
	label64:
	iload 8
	ldc_w 1
	iadd
	istore 8
	goto label59
	label60:
	iload 7
	ldc_w 1
	iadd
	istore 7
	goto label55
	label56:
	label39:
	aload 9
	areturn
.end method

