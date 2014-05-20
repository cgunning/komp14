
.class Cookie
.super java/lang/Object
.field down Z
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method putDown(Z)Z
	.limit locals 3
	.limit stack 4
	iload 1
	ifeq label2
	aload 0
	ldc_w 1
	putfield Cookie/down Z
	goto label1
	label2:
	aload 0
	ldc_w 0
	putfield Cookie/down Z
	label1:
	aload 0
	iload 1
	ifeq label3
	ldc_w 0
	goto label4
	label3:
	ldc_w 1
	label4:
	invokevirtual Cookie/putDown(Z)Z
	istore 2
	aload 0
	getfield Cookie/down Z
	ireturn
.end method

