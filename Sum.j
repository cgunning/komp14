
.class Sum
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method sum(II)J
	.limit locals 5
	.limit stack 4
	iload 1
	iload 2
	iadd
	lstore 3
	lload 3
	lreturn
.end method

