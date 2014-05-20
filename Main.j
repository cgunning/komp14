
.class Main
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 7
	.limit stack 13
	ldc_w 1
	istore 1
	ldc_w 2
	istore 2
	ldc_w 0
	ldc_w 1
	isub
	istore 3
	ldc_w 1
	istore 4
	ldc_w 0
	istore 5
	new Sub
	dup
	invokespecial Sub/<init>()V
	astore 6
	iload 4
	iload 5
	ifeq label1
	ldc_w 0
	goto label2
	label1:
	ldc_w 1
	label2:
	ifeq label3
	ifeq label4
	ldc_w 1
	goto label5
	label3:
	pop
	label4:
	ldc_w 0
	goto label5
	label5:
	iload 5
	ifeq label6
	ldc_w 0
	goto label7
	label6:
	ldc_w 1
	label7:
	iload 4
	ifeq label8
	ifeq label9
	ldc_w 1
	goto label10
	label8:
	pop
	label9:
	ldc_w 0
	goto label10
	label10:
	ifeq label11
	pop
	ldc_w 1
	goto label13
	label11:
	ifeq label12
	ldc_w 1
	goto label13
	label12:
	ldc_w 0
	label13:
	iload 2
	iload 1
	if_icmplt label14
	ldc_w 1
	goto label15
	label14:
	ldc_w 0
	label15:
	ifeq label16
	ifeq label17
	ldc_w 1
	goto label18
	label16:
	pop
	label17:
	ldc_w 0
	goto label18
	label18:
	iload 2
	iload 1
	if_icmple label19
	ldc_w 1
	goto label20
	label19:
	ldc_w 0
	label20:
	ifeq label21
	ifeq label22
	ldc_w 1
	goto label23
	label21:
	pop
	label22:
	ldc_w 0
	goto label23
	label23:
	iload 1
	iload 2
	if_icmpgt label24
	ldc_w 1
	goto label25
	label24:
	ldc_w 0
	label25:
	iload 1
	ldc_w 2
	if_icmpeq label26
	ldc_w 1
	goto label27
	label26:
	ldc_w 0
	label27:
	ifeq label28
	ifeq label29
	ldc_w 1
	goto label30
	label28:
	pop
	label29:
	ldc_w 0
	goto label30
	label30:
	iload 1
	ldc_w 1
	if_icmpne label31
	ldc_w 1
	goto label32
	label31:
	ldc_w 0
	label32:
	ifeq label33
	ifeq label34
	ldc_w 1
	goto label35
	label33:
	pop
	label34:
	ldc_w 0
	goto label35
	label35:
	ifeq label36
	pop
	ldc_w 1
	goto label38
	label36:
	ifeq label37
	ldc_w 1
	goto label38
	label37:
	ldc_w 0
	label38:
	ifeq label39
	iload 1
	iload 2
	if_icmpgt label41
	ldc_w 1
	goto label42
	label41:
	ldc_w 0
	label42:
	ifeq label43
	iload 2
	iload 1
	if_icmpeq label45
	ldc_w 1
	goto label46
	label45:
	ldc_w 0
	label46:
	ifeq label47
	iload 1
	iload 1
	if_icmpne label49
	ldc_w 1
	goto label50
	label49:
	ldc_w 0
	label50:
	ifeq label51
	iload 2
	ldc_w 1
	if_icmplt label53
	ldc_w 1
	goto label54
	label53:
	ldc_w 0
	label54:
	ifeq label55
	iload 4
	iload 5
	ifeq label57
	ldc_w 0
	goto label58
	label57:
	ldc_w 1
	label58:
	ifeq label59
	ldc_w 0
	goto label60
	label59:
	ldc_w 1
	label60:
	ifeq label61
	ldc_w 0
	goto label62
	label61:
	ldc_w 1
	label62:
	ifeq label63
	ifeq label64
	ldc_w 1
	goto label65
	label63:
	pop
	label64:
	ldc_w 0
	goto label65
	label65:
	ifeq label66
	aload 6
	invokevirtual Sub/sub1()I
	istore 3
	label66:
	label55:
	label51:
	label47:
	label43:
	label39:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 3
	invokevirtual java/io/PrintStream/println(I)V
	return
.end method

