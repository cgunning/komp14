
.class Main1
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 3
	.limit stack 8
	new FizzBuzz
	dup
	invokespecial FizzBuzz/<init>()V
	astore 1
	ldc_w 1
	istore 2
	label1:
	iload 2
	ldc_w 100
	if_icmpge label2
	ldc_w 1
	goto label3
	label2:
	ldc_w 0
	label3:
	ifeq label4
	aload 1
	iload 2
	ldc_w 15
	invokevirtual FizzBuzz/test(II)Z
	ifeq label5
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 51228022
	invokevirtual java/io/PrintStream/println(I)V
	goto label6
	label5:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 2
	invokevirtual java/io/PrintStream/println(I)V
	label6:
	iload 2
	ldc_w 1
	iadd
	istore 2
	goto label1
	label6:
	return
.end method

