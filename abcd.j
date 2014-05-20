
.class abcd
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 3
	.limit stack 4
	ldc_w 12
	newarray long
	ldc_w 7
	laload
	lstore 1
	getstatic java/lang/System/out Ljava/io/PrintStream;
	lload 1
	invokevirtual java/io/PrintStream/println(J)V
	return
.end method

