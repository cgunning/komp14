
.class Test1
.super java/lang/Object
.field b I
.field c I
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method test1(I)I
	.limit locals 2
	.limit stack 2
	iload 1
	ireturn
.end method

.method test2(J)J
	.limit locals 3
	.limit stack 2
	lload 1
	lreturn
.end method

