
.class many_arguments
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 1
	.limit stack 10
	getstatic java/lang/System/out Ljava/io/PrintStream;
	new Thing
	dup
	invokespecial Thing/<init>()V
	ldc_w 1
	ldc_w 2
	ldc_w 3
	ldc_w 4
	ldc_w 5
	ldc_w 6
	ldc_w 7
	ldc_w 8
	invokevirtual Thing/run2(IIIIIIII)I
	invokevirtual java/io/PrintStream/println(I)V
	return
.end method

