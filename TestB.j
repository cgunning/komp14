
.class TestB
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 10
	.limit stack 62
	ldc_w 2
	newarray int
	astore 1
	ldc_w 2
	newarray long
	astore 2
	new Sum
	dup
	invokespecial Sum/<init>()V
	astore 9
	aload 1
	ldc_w 0
	iaload
	istore 3
	iload 3
	aload 1
	ldc_w 1
	iaload
	iadd
	istore 4
	aload 2
	ldc_w 0
	laload
	lstore 5
	aload 9
	iload 3
	aload 1
	ldc_w 1
	iaload
	invokevirtual Sum/sum(II)J
	lstore 7
	ldc_w 1
	ldc_w 0
	ifeq label1
	ifeq label2
	ldc_w 1
	goto label3
	label1:
	pop
	label2:
	ldc_w 0
	goto label3
	label3:
	ldc_w 1
	ifeq label4
	pop
	ldc_w 1
	goto label6
	label4:
	ifeq label5
	ldc_w 1
	goto label6
	label5:
	ldc_w 0
	label6:
	ifeq label8
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 1
	invokevirtual java/io/PrintStream/println(I)V
	goto label7
	label8:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 0
	invokevirtual java/io/PrintStream/println(I)V
	label7:
	ldc_w 1
	ldc_w 0
	ldc_w 1
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
	ifeq label12
	pop
	ldc_w 1
	goto label14
	label12:
	ifeq label13
	ldc_w 1
	goto label14
	label13:
	ldc_w 0
	label14:
	ldc_w 0
	ifeq label15
	pop
	ldc_w 1
	goto label17
	label15:
	ifeq label16
	ldc_w 1
	goto label17
	label16:
	ldc_w 0
	label17:
	ifeq label19
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 1
	invokevirtual java/io/PrintStream/println(I)V
	goto label18
	label19:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 0
	invokevirtual java/io/PrintStream/println(I)V
	label18:
	iload 3
	lload 5
	if_icmpne label20
	ldc_w 1
	goto label21
	label20:
	ldc_w 0
	label21:
	iload 4
	lload 7
	if_icmpne label22
	ldc_w 1
	goto label23
	label22:
	ldc_w 0
	label23:
	ifeq label24
	ifeq label25
	ldc_w 1
	goto label26
	label24:
	pop
	label25:
	ldc_w 0
	goto label26
	label26:
	ifeq label28
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 1
	invokevirtual java/io/PrintStream/println(I)V
	goto label27
	label28:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 0
	invokevirtual java/io/PrintStream/println(I)V
	label27:
	ldc_w 0
	ldc_w 1
	if_icmpeq label29
	ldc_w 1
	goto label30
	label29:
	ldc_w 0
	label30:
	ifeq label32
	ldc_w 0
	ldc_w 0
	ldc_w 1
	if_icmpeq label33
	ldc_w 1
	goto label34
	label33:
	ldc_w 0
	label34:
	ifeq label35
	ifeq label36
	ldc_w 1
	goto label37
	label35:
	pop
	label36:
	ldc_w 0
	goto label37
	label37:
	ifeq label39
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 0
	invokevirtual java/io/PrintStream/println(I)V
	goto label38
	label39:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 1
	invokevirtual java/io/PrintStream/println(I)V
	label38:
	goto label31
	label32:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 0
	invokevirtual java/io/PrintStream/println(I)V
	label31:
	iload 3
	lload 5
	if_icmpne label40
	ldc_w 1
	goto label41
	label40:
	ldc_w 0
	label41:
	iload 3
	lload 5
	lcmp
	ifgt label42
	ldc_w 1
	goto label43
	label42:
	ldc_w 0
	label43:
	ifeq label44
	ifeq label45
	ldc_w 1
	goto label46
	label44:
	pop
	label45:
	ldc_w 0
	goto label46
	label46:
	iload 3
	lload 5
	lcmp
	iflt label47
	ldc_w 1
	goto label48
	label47:
	ldc_w 0
	label48:
	ifeq label49
	ifeq label50
	ldc_w 1
	goto label51
	label49:
	pop
	label50:
	ldc_w 0
	goto label51
	label51:
	ifeq label53
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 1
	invokevirtual java/io/PrintStream/println(I)V
	goto label52
	label53:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 0
	invokevirtual java/io/PrintStream/println(I)V
	label52:
	ldc_w 5
	ldc_w 3
	if_icmple label54
	ldc_w 1
	goto label55
	label54:
	ldc_w 0
	label55:
	ifeq label57
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 1
	invokevirtual java/io/PrintStream/println(I)V
	goto label56
	label57:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 0
	invokevirtual java/io/PrintStream/println(I)V
	label56:
	ldc_w 2147483647
	istore 3
	iload 3
	ldc_w 1
	iadd
	istore 4
	iload 4
	ldc_w 0
	ldc_w 2147483647
	isub
	ldc_w 1
	isub
	if_icmpne label58
	ldc_w 1
	goto label59
	label58:
	ldc_w 0
	label59:
	ifeq label61
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 1
	invokevirtual java/io/PrintStream/println(I)V
	goto label60
	label61:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 0
	invokevirtual java/io/PrintStream/println(I)V
	label60:
	iload 3
	lstore 5
	lload 5
	ldc_w 1
	iadd
	lstore 7
	lload 7
	ldc2_w 2147483648
	lcmp
	ifne label62
	ldc_w 1
	goto label63
	label62:
	ldc_w 0
	label63:
	ifeq label65
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 1
	invokevirtual java/io/PrintStream/println(I)V
	goto label64
	label65:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 0
	invokevirtual java/io/PrintStream/println(I)V
	label64:
	return
.end method

