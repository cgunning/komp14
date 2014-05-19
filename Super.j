
.class Super
.super java/lang/Object
.field super1 I
.field super2 I
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method super1(I)I
	.limit locals 3
	.limit stack 2
	ldc_w 123
	istore 2
	iload 2
	ireturn
.end method

