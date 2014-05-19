
.class AncientApparition
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 9
	.limit stack 28
	ldc_w 1
	istore 2
	new Spectre
	dup
	invokespecial Spectre/<init>()V
	astore 7
	aload 7
	invokevirtual LegionCommander/setXandY()I
	istore 1
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 7
	invokevirtual LegionCommander/setXandY()I
	invokevirtual java/io/PrintStream/println(I)V
	new Spectre
	dup
	invokespecial Spectre/<init>()V
	astore 3
	aload 3
	invokevirtual Spectre/setXandY()I
	istore 1
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 3
	invokevirtual Spectre/getSomeStrangeNumber()I
	invokevirtual java/io/PrintStream/println(I)V
	new NaturesProphet
	dup
	invokespecial NaturesProphet/<init>()V
	astore 5
	aload 5
	invokevirtual Slardar/setXandY()I
	istore 1
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 5
	invokevirtual Slardar/getX()I
	invokevirtual java/io/PrintStream/println(I)V
	new Spectre
	dup
	invokespecial Spectre/<init>()V
	astore 4
	aload 4
	invokevirtual NaturesProphet/setXandY()I
	istore 1
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 4
	invokevirtual NaturesProphet/getXAndY()I
	invokevirtual java/io/PrintStream/println(I)V
	new Riki
	dup
	invokespecial Riki/<init>()V
	astore 6
	aload 6
	invokevirtual Riki/setXandY()I
	istore 1
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 6
	invokevirtual Riki/setXandY()I
	aload 6
	invokevirtual Riki/getX()I
	iadd
	invokevirtual java/io/PrintStream/println(I)V
	new DefenseOfTheAncients
	dup
	invokespecial DefenseOfTheAncients/<init>()V
	astore 8
	aload 8
	aload 3
	aload 4
	invokevirtual DefenseOfTheAncients/compareThingseses(LSpectreLNaturesProphet)Z
	ifeq label2
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 2147483647
	invokevirtual java/io/PrintStream/println(I)V
	goto label1
	label2:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 2147483647
	ldc_w 1
	iadd
	invokevirtual java/io/PrintStream/println(I)V
	label1:
	return
.end method

