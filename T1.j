
.class T1
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 1
	.limit stack 2
	getstatic java/lang/System/out Ljava/io/PrintStream;
	new Caller
	dup
	invokespecial Caller/<init>()V
	invokevirtual Caller/call()I
	invokevirtual java/io/PrintStream/println(I)V
	return
.end method

