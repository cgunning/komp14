
.class SearchSort
.super java/lang/Object
.field sortMe [I
.field searchMe [I
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method startSort()Z
	.limit locals 1
	.limit stack 4
	aload 0
	ldc_w 10
	newarray int
	putfield SearchSort/sortMe [I
	aload 0
	aload 0
	getfield SearchSort/sortMe [I
	invokevirtual SearchSort/bubbleSort([I)Z
	ireturn
.end method

.method startSearch()I
	.limit locals 1
	.limit stack 6
	aload 0
	ldc_w 10
	newarray int
	putfield SearchSort/searchMe [I
	aload 0
	aload 0
	getfield SearchSort/searchMe [I
	ldc_w 42
	invokevirtual SearchSort/linearSearch([II)I
	ireturn
.end method

.method bubbleSort([I)Z
	.limit locals 6
	.limit stack 28
	ldc_w 1
	istore 3
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 0
	aload 1
	invokevirtual SearchSort/printArray([I)I
	invokevirtual java/io/PrintStream/println(I)V
	label5:
	iload 3
	ifeq label6
	ldc_w 0
	istore 3
	ldc_w 0
	istore 2
	label7:
	iload 2
	aload 1
	arraylength
	ldc_w 2
	isub
	if_icmpgt label9
	ldc_w 1
	goto label10
	label9:
	ldc_w 0
	label10:
	ifeq label8
	aload 1
	iload 2
	iaload
	aload 1
	iload 2
	ldc_w 1
	iadd
	iaload
	ldc_w 1
	iadd
	if_icmplt label11
	ldc_w 1
	goto label12
	label11:
	ldc_w 0
	label12:
	ifeq label14
	aload 1
	iload 2
	iaload
	istore 5
	ldc_w 1
	istore 3
	goto label13
	label14:
	label13:
	iload 2
	ldc_w 1
	iadd
	istore 2
	goto label7
	label8:
	goto label5
	label6:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 0
	aload 1
	invokevirtual SearchSort/printArray([I)I
	invokevirtual java/io/PrintStream/println(I)V
	aload 1
	aload 1
	arraylength
	ldc_w 1
	isub
	iaload
	aload 1
	ldc_w 0
	iaload
	if_icmpne label15
	ldc_w 1
	goto label16
	label15:
	ldc_w 0
	label16:
	ifeq label18
	ldc_w 0
	istore 4
	goto label17
	label18:
	ldc_w 1
	istore 4
	label17:
	iload 4
	ireturn
.end method

.method linearSearch([II)I
	.limit locals 5
	.limit stack 8
	ldc_w 123456
	istore 4
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 2
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 999999
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 0
	aload 1
	invokevirtual SearchSort/printArray([I)I
	invokevirtual java/io/PrintStream/println(I)V
	ldc_w 1
	istore 3
	label19:
	iload 3
	aload 1
	arraylength
	if_icmpge label21
	ldc_w 1
	goto label22
	label21:
	ldc_w 0
	label22:
	ifeq label20
	aload 1
	iload 3
	iaload
	iload 2
	if_icmpne label23
	ldc_w 1
	goto label24
	label23:
	ldc_w 0
	label24:
	ifeq label26
	iload 3
	istore 4
	goto label25
	label26:
	label25:
	iload 3
	ldc_w 1
	iadd
	istore 3
	goto label19
	label20:
	iload 4
	ireturn
.end method

.method insertionSort([I)[I
	.limit locals 5
	.limit stack 30
	ldc_w 1
	istore 3
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 0
	aload 1
	invokevirtual SearchSort/printArray([I)I
	invokevirtual java/io/PrintStream/println(I)V
	label27:
	iload 3
	aload 1
	arraylength
	if_icmpge label29
	ldc_w 1
	goto label30
	label29:
	ldc_w 0
	label30:
	ifeq label28
	aload 1
	iload 3
	iaload
	istore 4
	iload 3
	ldc_w 1
	isub
	istore 2
	label31:
	iload 2
	ldc_w 0
	if_icmplt label33
	ldc_w 1
	goto label34
	label33:
	ldc_w 0
	label34:
	aload 1
	iload 2
	iaload
	iload 4
	if_icmpge label35
	ldc_w 1
	goto label36
	label35:
	ldc_w 0
	label36:
	ifeq label37
	ifeq label38
	ldc_w 1
	goto label39
	label37:
	pop
	label38:
	ldc_w 0
	goto label39
	label39:
	ifeq label32
	iload 2
	ldc_w 1
	isub
	istore 2
	goto label31
	label32:
	iload 3
	ldc_w 1
	iadd
	istore 3
	goto label27
	label28:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 0
	aload 1
	invokevirtual SearchSort/printArray([I)I
	invokevirtual java/io/PrintStream/println(I)V
	aload 1
	areturn
.end method

.method printArray([I)I
	.limit locals 3
	.limit stack 10
	ldc_w 0
	istore 2
	label40:
	iload 2
	aload 1
	arraylength
	if_icmpge label42
	ldc_w 1
	goto label43
	label42:
	ldc_w 0
	label43:
	ifeq label41
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 1
	iload 2
	iaload
	invokevirtual java/io/PrintStream/println(I)V
	iload 2
	ldc_w 1
	iadd
	istore 2
	goto label40
	label41:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 999999
	invokevirtual java/io/PrintStream/println(I)V
	ldc_w 0
	ireturn
.end method

