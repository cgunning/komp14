
.class DefenseOfTheAncients
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method compareThingseses(LSpectreLNaturesProphet)Z
	.limit locals 6
	.limit stack 6
	aload 1
	invokevirtual Spectre/getSomeStrangeNumber()I
	aload 1
	invokevirtual Spectre/getXAndY()I
	imul
	aload 1
	invokevirtual Spectre/getXAndY()I
	aload 1
	invokevirtual Spectre/setXandY()I
	imul
	isub
	istore 5
	aload 2
	invokevirtual NaturesProphet/getXAndY()I
	aload 2
	invokevirtual NaturesProphet/getX()I
	imul
	aload 2
	invokevirtual NaturesProphet/getX()I
	imul
	aload 2
	invokevirtual NaturesProphet/getXAndY()I
	imul
	istore 4
	aload 1
	aload 2
	if_acmpne label3
	ldc_w 1
	goto label4
	label3:
	ldc_w 0
	label4:
	iload 5
	iload 4
	if_icmpne label5
	ldc_w 1
	goto label6
	label5:
	ldc_w 0
	label6:
	ifeq label7
	ifeq label8
	ldc_w 1
	goto label9
	label7:
	pop
	label8:
	ldc_w 0
	goto label9
	label9:
	iload 5
	iload 5
	if_icmpeq label10
	ldc_w 1
	goto label11
	label10:
	ldc_w 0
	label11:
	ifeq label12
	ifeq label13
	ldc_w 1
	goto label14
	label12:
	pop
	label13:
	ldc_w 0
	goto label14
	label14:
	iload 4
	iload 5
	if_icmplt label15
	ldc_w 1
	goto label16
	label15:
	ldc_w 0
	label16:
	ifeq label17
	ifeq label18
	ldc_w 1
	goto label19
	label17:
	pop
	label18:
	ldc_w 0
	goto label19
	label19:
	iload 5
	iload 4
	if_icmpgt label20
	ldc_w 1
	goto label21
	label20:
	ldc_w 0
	label21:
	ifeq label22
	ifeq label23
	ldc_w 1
	goto label24
	label22:
	pop
	label23:
	ldc_w 0
	goto label24
	label24:
	ifeq label26
	ldc_w 1
	istore 3
	goto label25
	label26:
	ldc_w 0
	istore 3
	label25:
	iload 3
	ireturn
.end method

