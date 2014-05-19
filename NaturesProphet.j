
.class NaturesProphet
.super Slardar
.method public <init>()V
	aload_0
	invokenonvirtual Slardar/<init>()V
	return
.end method

.method getXAndY()I
	.limit locals 1
	.limit stack 4
	aload 0
	invokevirtual NaturesProphet/getX()I
	aload 0
	invokevirtual NaturesProphet/getY()I
	iadd
	ireturn
.end method

