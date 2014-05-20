
.class LongTest
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 9
	.limit stack 33
	ldc2_w 1099511627776
	lstore 1
	ldc2_w 1099511627834
	lstore 3
	lload 3
	lload 1
	lsub
	lstore 5
	getstatic java/lang/System/out Ljava/io/PrintStream;
	lload 1
	invokevirtual java/io/PrintStream/println(J)V
	lload 5
	ldc2_w 58
	lcmp
	ifne label1
	ldc_w 1
	goto label2
	label1:
	ldc_w 0
	label2:
	ifeq label4
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 0
	invokevirtual java/io/PrintStream/println(I)V
	goto label3
	label4:
	lload 5
	ldc_w 58
	if_icmpge label5
	ldc_w 1
	goto label6
	label5:
	ldc_w 0
	label6:
	ifeq label8
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 0
	ldc_w 1
	isub
	invokevirtual java/io/PrintStream/println(I)V
	goto label7
	label8:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 1
	invokevirtual java/io/PrintStream/println(I)V
	label7:
	label3:
	ldc_w 5
	ldc2_w 6
	lcmp
	ifge label9
	ldc_w 1
	goto label10
	label9:
	ldc_w 0
	label10:
	ifeq label12
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 1
	invokevirtual java/io/PrintStream/println(I)V
	goto label11
	label12:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 0
	invokevirtual java/io/PrintStream/println(I)V
	label11:
	ldc_w 10
	istore 7
	iload 7
	lstore 1
	getstatic java/lang/System/out Ljava/io/PrintStream;
	lload 3
	lload 1
	lsub
	invokevirtual java/io/PrintStream/println(J)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc2_w 10
	ldc_w 2
	isub
	invokevirtual java/io/PrintStream/println(J)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc2_w 10
	ldc_w 2
	iadd
	invokevirtual java/io/PrintStream/println(J)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc2_w 10
	ldc_w 2
	imul
	invokevirtual java/io/PrintStream/println(J)V
	return
.end method

