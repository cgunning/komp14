
.class MainGrandChild
.super MainChild
.field l I
.method public <init>()V
	aload_0
	invokenonvirtual MainChild/<init>()V
	return
.end method

.method dostuff(LMainGrandChild;)J
	.limit locals 2
	.limit stack 2
	aload 0
	astore 1
	aload 0
	ldc_w 6
	putfield MainGrandChild/i I
	aload 0
	aload 0
	getfield MainGrandChild/i I
	putfield MainGrandChild/l I
	aload 0
	getfield MainGrandChild/l I
	ireturn
.end method

.method fibonacci(I)J
	.limit locals 4
	.limit stack 12
	iload 1
	ldc_w 1
	if_icmpgt label46
	ldc_w 1
	goto label47
	label46:
	ldc_w 0
	label47:
	ifeq label49
	new MainChild
	dup
	invokespecial MainChild/<init>()V
	iload 1
	invokevirtual MainChild/fibonacci(I)J
	lstore 2
	goto label48
	label49:
	aload 0
	iload 1
	ldc_w 2
	isub
	invokevirtual MainGrandChild/fibonacci(I)J
	new MainGrandChild
	dup
	invokespecial MainGrandChild/<init>()V
	iload 1
	ldc_w 1
	isub
	invokevirtual MainGrandChild/fibonacci(I)J
	ladd
	lstore 2
	label48:
	lload 2
	lreturn
.end method

