
.class Matrix
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 11
	.limit stack 44
	new internalMatrix
	dup
	invokespecial internalMatrix/<init>()V
	astore 1
	new internalMatrix
	dup
	invokespecial internalMatrix/<init>()V
	astore 4
	aload 1
	ldc_w 2
	ldc_w 2
	invokevirtual internalMatrix/Init(II)Z
	istore 10
	aload 4
	ldc_w 2
	ldc_w 2
	invokevirtual internalMatrix/Init(II)Z
	istore 10
	ldc_w 1
	ldc_w 0
	ifeq label1
	pop
	ldc_w 1
	goto label3
	label1:
	ifeq label2
	ldc_w 1
	goto label3
	label2:
	ldc_w 0
	label3:
	ldc_w 1
	ifeq label4
	ifeq label5
	ldc_w 1
	goto label6
	label4:
	pop
	label5:
	ldc_w 0
	goto label6
	label6:
	ifeq label7
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 1
	invokevirtual java/io/PrintStream/println(Z)V
	label7:
	ldc_w 0
	istore 2
	ldc_w 0
	istore 3
	label9:
	iload 2
	aload 1
	invokevirtual internalMatrix/getMatrixSize()I
	if_icmpgt label11
	ldc_w 1
	goto label12
	label11:
	ldc_w 0
	label12:
	ifeq label10
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 1
	iload 2
	iload 3
	invokevirtual internalMatrix/getData(II)I
	invokevirtual java/io/PrintStream/println(I)V
	iload 2
	ldc_w 1
	iadd
	istore 2
	goto label9
	label10:
	ldc_w 0
	istore 2
	label13:
	iload 2
	aload 1
	invokevirtual internalMatrix/getColumnLength()I
	if_icmpge label15
	ldc_w 1
	goto label16
	label15:
	ldc_w 0
	label16:
	ifeq label14
	ldc_w 0
	istore 3
	label17:
	iload 3
	aload 1
	invokevirtual internalMatrix/getColumnLength()I
	if_icmpge label19
	ldc_w 1
	goto label20
	label19:
	ldc_w 0
	label20:
	ifeq label18
	aload 1
	iload 2
	iload 3
	ldc_w 2
	invokevirtual internalMatrix/setData(III)Z
	istore 10
	aload 4
	iload 2
	iload 3
	ldc_w 2
	invokevirtual internalMatrix/setData(III)Z
	istore 10
	iload 3
	ldc_w 1
	iadd
	istore 3
	goto label17
	label18:
	iload 2
	ldc_w 1
	iadd
	istore 2
	goto label13
	label14:
	aload 1
	aload 1
	aload 4
	invokevirtual internalMatrix/matrixmultiplication(LinternalMatrixLinternalMatrix)LmatrixWithPrint
	astore 5
	aload 5
	invokevirtual matrixWithPrint/printMatrix()Z
	istore 10
	ldc2_w 13
	lstore 6
	ldc_w 13
	lstore 8
	ldc_w 13
	istore 2
	lload 6
	lload 8
	lcmp
	ifne label21
	ldc_w 1
	goto label22
	label21:
	ldc_w 0
	label22:
	ifeq label23
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 1
	invokevirtual java/io/PrintStream/println(Z)V
	lload 8
	iload 2
	lcmp
	ifne label25
	ldc_w 1
	goto label26
	label25:
	ldc_w 0
	label26:
	ifeq label27
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 1
	invokevirtual java/io/PrintStream/println(Z)V
	label27:
	label23:
	return
.end method

