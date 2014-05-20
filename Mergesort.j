
.class Mergesort
.super java/lang/Object
.field a [I
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method mergesort([I)[I
	.limit locals 3
	.limit stack 6
	aload 0
	aload 1
	putfield Mergesort/a [I
	aload 0
	ldc_w 0
	aload 0
	getfield Mergesort/a [I
	arraylength
	invokevirtual Mergesort/sort(II)I
	istore 2
	aload 0
	aload 0
	getfield Mergesort/a [I
	invokevirtual Mergesort/print([I)I
	istore 2
	aload 0
	getfield Mergesort/a [I
	areturn
.end method

.method sort(II)I
	.limit locals 6
	.limit stack 28
	iload 2
	iload 1
	isub
	istore 3
	iload 3
	ldc_w 2
	if_icmpge label1
	ldc_w 1
	goto label2
	label1:
	ldc_w 0
	label2:
	ifeq label4
	iload 3
	istore 3
	goto label3
	label4:
	aload 0
	iload 1
	iload 2
	invokevirtual Mergesort/avg(II)I
	istore 4
	aload 0
	iload 1
	iload 4
	invokevirtual Mergesort/sort(II)I
	istore 5
	aload 0
	iload 4
	iload 2
	invokevirtual Mergesort/sort(II)I
	istore 5
	aload 0
	iload 1
	iload 4
	iload 2
	invokevirtual Mergesort/merge(III)I
	istore 5
	label3:
	ldc_w 0
	ireturn
.end method

.method merge(III)I
	.limit locals 9
	.limit stack 28
	iload 3
	iload 1
	isub
	newarray int
	astore 8
	ldc_w 0
	istore 7
	iload 1
	istore 5
	iload 2
	istore 6
	label5:
	iload 5
	iload 2
	if_icmpge label7
	ldc_w 1
	goto label8
	label7:
	ldc_w 0
	label8:
	iload 6
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
	ifeq label6
	aload 0
	getfield Mergesort/a [I
	iload 5
	iaload
	aload 0
	getfield Mergesort/a [I
	iload 6
	iaload
	if_icmpge label14
	ldc_w 1
	goto label15
	label14:
	ldc_w 0
	label15:
	ifeq label17
	aload 8
	iload 7
	aload 0
	getfield Mergesort/a [I
	iload 5
	iaload
	iastore
	iload 5
	ldc_w 1
	iadd
	istore 5
	iload 7
	ldc_w 1
	iadd
	istore 7
	goto label16
	label17:
	aload 8
	iload 7
	aload 0
	getfield Mergesort/a [I
	iload 6
	iaload
	iastore
	iload 6
	ldc_w 1
	iadd
	istore 6
	iload 7
	ldc_w 1
	iadd
	istore 7
	label16:
	goto label5
	label6:
	iload 5
	iload 2
	if_icmpge label18
	ldc_w 1
	goto label19
	label18:
	ldc_w 0
	label19:
	ifeq label21
	label22:
	iload 7
	iload 3
	iload 1
	isub
	if_icmpge label24
	ldc_w 1
	goto label25
	label24:
	ldc_w 0
	label25:
	ifeq label23
	aload 8
	iload 7
	aload 0
	getfield Mergesort/a [I
	iload 5
	iaload
	iastore
	iload 5
	ldc_w 1
	iadd
	istore 5
	iload 7
	ldc_w 1
	iadd
	istore 7
	goto label22
	label23:
	goto label20
	label21:
	label26:
	iload 7
	iload 3
	iload 1
	isub
	if_icmpge label28
	ldc_w 1
	goto label29
	label28:
	ldc_w 0
	label29:
	ifeq label27
	aload 8
	iload 7
	aload 0
	getfield Mergesort/a [I
	iload 6
	iaload
	iastore
	iload 6
	ldc_w 1
	iadd
	istore 6
	iload 7
	ldc_w 1
	iadd
	istore 7
	goto label26
	label27:
	label20:
	ldc_w 0
	istore 7
	label30:
	iload 7
	iload 3
	iload 1
	isub
	if_icmpge label32
	ldc_w 1
	goto label33
	label32:
	ldc_w 0
	label33:
	ifeq label31
	aload 0
	getfield Mergesort/a [I
	iload 1
	iload 7
	iadd
	aload 8
	iload 7
	iaload
	iastore
	iload 7
	ldc_w 1
	iadd
	istore 7
	goto label30
	label31:
	ldc_w 0
	ireturn
.end method

.method avg(II)I
	.limit locals 3
	.limit stack 8
	label34:
	iload 1
	ldc_w 1
	iadd
	iload 2
	if_icmpge label36
	ldc_w 1
	goto label37
	label36:
	ldc_w 0
	label37:
	ifeq label35
	iload 1
	ldc_w 1
	iadd
	istore 1
	iload 2
	ldc_w 1
	isub
	istore 2
	goto label34
	label35:
	iload 2
	ireturn
.end method

.method print([I)I
	.limit locals 3
	.limit stack 10
	ldc_w 0
	istore 2
	label38:
	iload 2
	aload 1
	arraylength
	if_icmpge label40
	ldc_w 1
	goto label41
	label40:
	ldc_w 0
	label41:
	ifeq label39
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 1
	iload 2
	iaload
	invokevirtual java/io/PrintStream/println(I)V
	iload 2
	ldc_w 1
	iadd
	istore 2
	goto label38
	label39:
	ldc_w 0
	ireturn
.end method

