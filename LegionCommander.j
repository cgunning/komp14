
.class LegionCommander
.super java/lang/Object
.field y I
.field x I
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method setXandY()I
	.limit locals 1
	.limit stack 2
	aload 0
	ldc_w 17
	putfield LegionCommander/x I
	aload 0
	ldc_w 41
	putfield LegionCommander/y I
	ldc_w 31
	ireturn
.end method

