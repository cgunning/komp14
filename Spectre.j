
.class Spectre
.super NaturesProphet
.method public <init>()V
	aload_0
	invokenonvirtual NaturesProphet/<init>()V
	return
.end method

.method getSomeStrangeNumber()I
	.limit locals 1
	.limit stack 6
	aload 0
	invokevirtual Spectre/getX()I
	aload 0
	invokevirtual Spectre/getY()I
	imul
	aload 0
	invokevirtual Spectre/getXAndY()I
	aload 0
	invokevirtual Spectre/getXAndY()I
	imul
	iadd
	aload 0
	invokevirtual Spectre/getX()I
	aload 0
	invokevirtual Spectre/getY()I
	imul
	iadd
	ireturn
.end method

