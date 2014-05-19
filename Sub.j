
.class Sub
.super Super
.field sub2 I
.field sub1 I
.method public <init>()V
	aload_0
	invokenonvirtual Super/<init>()V
	return
.end method

.method sub1()I
	.limit locals 2
	.limit stack 4
	aload 0
	ldc_w 1
	putfield Sub/super1 I
	aload 0
	ldc_w 2
	putfield Sub/sub1 I
	aload 0
	aload 0
	getfield Sub/super1 I
	aload 0
	getfield Sub/sub1 I
	iadd
	putfield Sub/super2 I
	aload 0
	aload 0
	getfield Sub/super2 I
	invokevirtual Sub/super1(I)I
	istore 1
	iload 1
	ireturn
.end method

