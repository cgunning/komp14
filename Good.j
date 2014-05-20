
.class Good
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method main()I
	.limit locals 2
	.limit stack 6
	ldc_w 0
	istore 1
	aload 0
	invokevirtual Good/testBucketSort()I
	istore 1
	ldc_w 1
	ldc_w 4
	ldc_w 4
	imul
	iadd
	ldc_w 18
	if_icmpge label1
	ldc_w 1
	goto label2
	label1:
	ldc_w 0
	label2:
	ldc_w 0
	ifeq label3
	ldc_w 0
	goto label4
	label3:
	ldc_w 1
	label4:
	ifeq label5
	ifeq label6
	ldc_w 1
	goto label7
	label5:
	pop
	label6:
	ldc_w 0
	goto label7
	label7:
	ldc_w 1
	ldc_w 2
	if_icmpge label8
	ldc_w 1
	goto label9
	label8:
	ldc_w 0
	label9:
	ifeq label10
	ifeq label11
	ldc_w 1
	goto label12
	label10:
	pop
	label11:
	ldc_w 0
	goto label12
	label12:
	ifeq label14
	iload 1
	istore 1
	goto label13
	label14:
	ldc_w 1
	istore 1
	label13:
	iload 1
	ireturn
.end method

.method testBucketSort()I
	.limit locals 5
	.limit stack 14
	ldc_w 30
	newarray int
	astore 1
	ldc_w 0
	istore 3
	aload 1
	iload 3
	ldc_w 4
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 5
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 3
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 5
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 1
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 3
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 3
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 5
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 1
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 2
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 5
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 1
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 4
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 3
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 3
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 5
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 2
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 1
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 2
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 3
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 4
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 4
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 2
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 3
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 4
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 1
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 2
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 4
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 4
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	aload 1
	iload 3
	ldc_w 3
	iastore
	aload 0
	aload 1
	invokevirtual Good/bucketSort([I)[I
	astore 2
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 4711
	invokevirtual java/io/PrintStream/println(I)V
	ldc_w 0
	istore 3
	label15:
	iload 3
	aload 2
	arraylength
	if_icmpge label17
	ldc_w 1
	goto label18
	label17:
	ldc_w 0
	label18:
	ifeq label16
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 2
	iload 3
	iaload
	invokevirtual java/io/PrintStream/println(I)V
	iload 3
	ldc_w 1
	iadd
	istore 3
	goto label15
	label16:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 4712
	invokevirtual java/io/PrintStream/println(I)V
	ldc_w 0
	istore 3
	label19:
	iload 3
	aload 2
	arraylength
	if_icmpge label21
	ldc_w 1
	goto label22
	label21:
	ldc_w 0
	label22:
	ifeq label20
	ldc_w 0
	istore 4
	label23:
	iload 4
	aload 2
	iload 3
	iaload
	if_icmpge label25
	ldc_w 1
	goto label26
	label25:
	ldc_w 0
	label26:
	ifeq label24
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 3
	invokevirtual java/io/PrintStream/println(I)V
	iload 4
	ldc_w 1
	iadd
	istore 4
	goto label23
	label24:
	iload 3
	ldc_w 1
	iadd
	istore 3
	goto label19
	label20:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 4713
	invokevirtual java/io/PrintStream/println(I)V
	ldc_w 0
	ireturn
.end method

.method bucketSort([I)[I
	.limit locals 5
	.limit stack 14
	ldc_w 0
	istore 4
	ldc_w 0
	istore 3
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
	iload 4
	aload 1
	iload 3
	iaload
	if_icmpge label31
	ldc_w 1
	goto label32
	label31:
	ldc_w 0
	label32:
	ifeq label34
	aload 1
	iload 3
	iaload
	istore 4
	goto label33
	label34:
	label33:
	iload 3
	ldc_w 1
	iadd
	istore 3
	goto label27
	label28:
	iload 4
	ldc_w 1
	iadd
	newarray int
	astore 2
	ldc_w 0
	istore 3
	label35:
	iload 3
	aload 2
	arraylength
	if_icmpge label37
	ldc_w 1
	goto label38
	label37:
	ldc_w 0
	label38:
	ifeq label36
	aload 2
	iload 3
	ldc_w 0
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	goto label35
	label36:
	ldc_w 0
	istore 3
	label39:
	iload 3
	aload 1
	arraylength
	if_icmpge label41
	ldc_w 1
	goto label42
	label41:
	ldc_w 0
	label42:
	ifeq label40
	aload 2
	aload 1
	iload 3
	iaload
	aload 2
	aload 1
	iload 3
	iaload
	iaload
	ldc_w 1
	iadd
	iastore
	iload 3
	ldc_w 1
	iadd
	istore 3
	goto label39
	label40:
	aload 2
	areturn
.end method

