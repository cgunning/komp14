
.class BrainfuckInterpreter
.super java/lang/Object
.field prog [I
.field jump [I
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method setProgram([I)I
	.limit locals 6
	.limit stack 22
	aload 0
	aload 1
	putfield BrainfuckInterpreter/prog [I
	aload 0
	aload 0
	getfield BrainfuckInterpreter/prog [I
	arraylength
	newarray int
	putfield BrainfuckInterpreter/jump [I
	new LinkedListStack
	dup
	invokespecial LinkedListStack/<init>()V
	astore 2
	ldc_w 0
	istore 3
	label1:
	iload 3
	aload 0
	getfield BrainfuckInterpreter/prog [I
	arraylength
	if_icmpge label3
	ldc_w 1
	goto label4
	label3:
	ldc_w 0
	label4:
	ifeq label2
	aload 0
	getfield BrainfuckInterpreter/prog [I
	iload 3
	iaload
	istore 4
	iload 4
	ldc_w 91
	if_icmpne label5
	ldc_w 1
	goto label6
	label5:
	ldc_w 0
	label6:
	ifeq label8
	aload 2
	iload 3
	invokevirtual LinkedListStack/push(I)I
	istore 5
	goto label7
	label8:
	iload 4
	ldc_w 93
	if_icmpne label9
	ldc_w 1
	goto label10
	label9:
	ldc_w 0
	label10:
	ifeq label12
	aload 0
	getfield BrainfuckInterpreter/jump [I
	iload 3
	aload 2
	invokevirtual LinkedListStack/pop()I
	iastore
	aload 0
	getfield BrainfuckInterpreter/jump [I
	aload 0
	getfield BrainfuckInterpreter/jump [I
	iload 3
	iaload
	iload 3
	iastore
	goto label11
	label12:
	label11:
	label7:
	iload 3
	ldc_w 1
	iadd
	istore 3
	goto label1
	label2:
	ldc_w 1
	ireturn
.end method

.method run()I
	.limit locals 5
	.limit stack 42
	ldc_w 30000
	newarray int
	astore 1
	ldc_w 0
	istore 2
	ldc_w 0
	istore 3
	label13:
	iload 2
	aload 0
	getfield BrainfuckInterpreter/prog [I
	arraylength
	if_icmpge label15
	ldc_w 1
	goto label16
	label15:
	ldc_w 0
	label16:
	ifeq label14
	aload 0
	getfield BrainfuckInterpreter/prog [I
	iload 2
	iaload
	istore 4
	iload 4
	ldc_w 43
	if_icmpne label17
	ldc_w 1
	goto label18
	label17:
	ldc_w 0
	label18:
	ifeq label20
	aload 1
	iload 3
	aload 1
	iload 3
	iaload
	ldc_w 1
	iadd
	iastore
	goto label19
	label20:
	iload 4
	ldc_w 45
	if_icmpne label21
	ldc_w 1
	goto label22
	label21:
	ldc_w 0
	label22:
	ifeq label24
	aload 1
	iload 3
	aload 1
	iload 3
	iaload
	ldc_w 1
	isub
	iastore
	goto label23
	label24:
	iload 4
	ldc_w 60
	if_icmpne label25
	ldc_w 1
	goto label26
	label25:
	ldc_w 0
	label26:
	ifeq label28
	iload 3
	ldc_w 1
	isub
	istore 3
	goto label27
	label28:
	iload 4
	ldc_w 62
	if_icmpne label29
	ldc_w 1
	goto label30
	label29:
	ldc_w 0
	label30:
	ifeq label32
	iload 3
	ldc_w 1
	iadd
	istore 3
	goto label31
	label32:
	iload 4
	ldc_w 91
	if_icmpne label33
	ldc_w 1
	goto label34
	label33:
	ldc_w 0
	label34:
	aload 1
	iload 3
	iaload
	ldc_w 0
	if_icmpne label35
	ldc_w 1
	goto label36
	label35:
	ldc_w 0
	label36:
	ldc_w 1
	if_icmpne label37
	ldc_w 1
	goto label38
	label37:
	ldc_w 0
	label38:
	ifeq label39
	ifeq label40
	ldc_w 1
	goto label41
	label39:
	pop
	label40:
	ldc_w 0
	goto label41
	label41:
	ifeq label43
	aload 0
	getfield BrainfuckInterpreter/jump [I
	iload 2
	iaload
	istore 2
	goto label42
	label43:
	iload 4
	ldc_w 93
	if_icmpne label44
	ldc_w 1
	goto label45
	label44:
	ldc_w 0
	label45:
	aload 1
	iload 3
	iaload
	ldc_w 0
	if_icmpne label46
	ldc_w 1
	goto label47
	label46:
	ldc_w 0
	label47:
	ldc_w 0
	if_icmpne label48
	ldc_w 1
	goto label49
	label48:
	ldc_w 0
	label49:
	ifeq label50
	ifeq label51
	ldc_w 1
	goto label52
	label50:
	pop
	label51:
	ldc_w 0
	goto label52
	label52:
	ifeq label54
	aload 0
	getfield BrainfuckInterpreter/jump [I
	iload 2
	iaload
	istore 2
	goto label53
	label54:
	iload 4
	ldc_w 46
	if_icmpne label55
	ldc_w 1
	goto label56
	label55:
	ldc_w 0
	label56:
	ifeq label58
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 1
	iload 3
	iaload
	invokevirtual java/io/PrintStream/println(I)V
	goto label57
	label58:
	label57:
	label53:
	label42:
	label31:
	label27:
	label23:
	label19:
	iload 2
	ldc_w 1
	iadd
	istore 2
	goto label13
	label14:
	ldc_w 1
	ireturn
.end method

