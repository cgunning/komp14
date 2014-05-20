
.class Torbjoern
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method torbjoern(LCookie;)I
	.limit locals 3
	.limit stack 4
	aload 1
	ldc_w 1
	invokevirtual Cookie/putDown(Z)Z
	istore 2
	ldc_w 0
	ireturn
.end method

