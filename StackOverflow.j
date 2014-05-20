
.class StackOverflow
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 4
	.limit stack 4
	new Cookie
	dup
	invokespecial Cookie/<init>()V
	astore 3
	new Torbjoern
	dup
	invokespecial Torbjoern/<init>()V
	astore 1
	aload 1
	aload 3
	invokevirtual Torbjoern/torbjoern(LCookie;)I
	istore 2
	return
.end method

