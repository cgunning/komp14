
.class MainChild
.super _1g64r976g34f4397gf7g94fg3gy3Main
.field l J
.field i I
.method public <init>()V
	aload_0
	invokenonvirtual _1g64r976g34f4397gf7g94fg3gy3Main/<init>()V
	return
.end method

.method initialize()Z
	.limit locals 1
	.limit stack 4
	aload 0
	ldc_w 1337
	putfield MainChild/i I
	aload 0
	ldc2_w 133
	putfield MainChild/l J
	ldc_w 1
	ireturn
.end method

.method dostuff(LMainGrandChild;)J
	.limit locals 6
	.limit stack 40
	ldc_w 1
	istore 2
	aload 0
	aload 0
	getfield MainChild/i I
	aload 0
	getfield MainChild/i I
	aload 0
	getfield MainChild/i I
	iadd
	imul
	aload 0
	getfield MainChild/i I
	isub
	putfield MainChild/i I
	aload 0
	getfield MainChild/i I
	ldc2_w 5
	lcmp
	ifge label1
	ldc_w 1
	goto label2
	label1:
	ldc_w 0
	label2:
	aload 0
	getfield MainChild/i I
	ldc2_w 4
	lcmp
	ifgt label3
	ldc_w 1
	goto label4
	label3:
	ldc_w 0
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
	aload 0
	getfield MainChild/i I
	ldc2_w 7
	lcmp
	ifle label8
	ldc_w 1
	goto label9
	label8:
	ldc_w 0
	label9:
	aload 0
	getfield MainChild/i I
	ldc2_w 8
	lcmp
	iflt label10
	ldc_w 1
	goto label11
	label10:
	ldc_w 0
	label11:
	ifeq label12
	ifeq label13
	ldc_w 1
	goto label14
	label12:
	pop
	label13:
	ldc_w 0
	goto label14
	label14:
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
	aload 0
	getfield MainChild/i I
	ldc2_w 5
	if_icmpne label18
	ldc_w 1
	goto label19
	label18:
	ldc_w 0
	label19:
	aload 0
	getfield MainChild/i I
	ldc2_w 140737488355328
	if_icmpeq label20
	ldc_w 1
	goto label21
	label20:
	ldc_w 0
	label21:
	ifeq label22
	ifeq label23
	ldc_w 1
	goto label24
	label22:
	pop
	label23:
	ldc_w 0
	goto label24
	label24:
	iload 2
	ifeq label25
	ifeq label26
	ldc_w 1
	goto label27
	label25:
	pop
	label26:
	ldc_w 0
	goto label27
	label27:
	ifeq label28
	pop
	ldc_w 1
	goto label30
	label28:
	ifeq label29
	ldc_w 1
	goto label30
	label29:
	ldc_w 0
	label30:
	ldc_w 0
	ifeq label31
	pop
	ldc_w 1
	goto label33
	label31:
	ifeq label32
	ldc_w 1
	goto label33
	label32:
	ldc_w 0
	label33:
	ifeq label34
	ldc_w 1
	ifeq label37
	ldc_w 1
	ifeq label38
	ldc_w 0
	goto label39
	label38:
	ldc_w 1
	label39:
	istore 2
	goto label36
	label37:
	ldc_w 0
	ifeq label40
	ldc_w 1
	ifeq label43
	iload 2
	istore 2
	goto label42
	label43:
	iload 2
	ifeq label44
	ldc_w 0
	goto label45
	label44:
	ldc_w 1
	label45:
	istore 2
	label42:
	label40:
	label36:
	label34:
	ldc_w 0
	lstore 3
	ldc_w 0
	istore 5
	aload 0
	invokevirtual MainChild/getl()J
	lstore 3
	aload 0
	invokevirtual MainChild/geti()I
	istore 5
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 0
	invokevirtual MainChild/geti()I
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 0
	invokevirtual MainChild/getl()J
	invokevirtual java/io/PrintStream/println(J)V
	ldc_w 1
	lstore 3
	ldc_w 1
	istore 5
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 0
	invokevirtual MainChild/geti()I
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 0
	invokevirtual MainChild/getl()J
	invokevirtual java/io/PrintStream/println(J)V
	ldc_w 2
	lstore 3
	aload 0
	ldc_w 2
	putfield MainChild/l J
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 0
	invokevirtual MainChild/geti()I
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 0
	invokevirtual MainChild/getl()J
	invokevirtual java/io/PrintStream/println(J)V
	aload 0
	ldc_w 3
	putfield MainChild/i I
	aload 0
	ldc_w 3
	putfield MainChild/l J
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 0
	invokevirtual MainChild/geti()I
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 0
	invokevirtual MainChild/getl()J
	invokevirtual java/io/PrintStream/println(J)V
	aload 0
	getfield MainChild/i I
	ireturn
.end method

.method geti()I
	.limit locals 1
	.limit stack 2
	aload 0
	getfield MainChild/i I
	ireturn
.end method

.method getl()J
	.limit locals 1
	.limit stack 2
	aload 0
	getfield MainChild/l J
	lreturn
.end method

.method seti(I)I
	.limit locals 2
	.limit stack 2
	aload 0
	iload 1
	putfield MainChild/i I
	aload 0
	getfield MainChild/i I
	ireturn
.end method

.method setl(I)J
	.limit locals 2
	.limit stack 2
	aload 0
	iload 1
	putfield MainChild/l J
	aload 0
	getfield MainChild/l J
	lreturn
.end method

.method fibonacci(I)J
	.limit locals 2
	.limit stack 2
	iload 1
	ireturn
.end method

