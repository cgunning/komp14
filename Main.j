
.class Main
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 3
	.limit stack 4
	new Test
	dup
	invokespecial Test/<init>()V
	astore 1
	aload 1
	ldc_w 1
	ldc_w 3
	invokevirtual Test/getNum(ZI)I
	istore 2
	return
.end method

