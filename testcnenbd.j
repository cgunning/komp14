
.class testcnenbd
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 1
	.limit stack 3
	getstatic java/lang/System/out Ljava/io/PrintStream;
	new FactorialLitterFaculty
	dup
	invokespecial FactorialLitterFaculty/<init>()V
	ldc_w 10
	invokevirtual FactorialLitterFaculty/run(I)I
	invokevirtual java/io/PrintStream/println(I)V
	return
.end method

