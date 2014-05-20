
.class Caller
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method call()I
	.limit locals 3
	.limit stack 8
	ldc_w 20
	newarray int
	astore 2
	new Mergesort
	dup
	invokespecial Mergesort/<init>()V
	astore 1
	aload 2
	ldc_w 0
	ldc_w 11
	iastore
	aload 2
	ldc_w 1
	ldc_w 52
	iastore
	aload 2
	ldc_w 2
	ldc_w 39
	iastore
	aload 2
	ldc_w 3
	ldc_w 11
	iastore
	aload 2
	ldc_w 4
	ldc_w 66
	iastore
	aload 2
	ldc_w 5
	ldc_w 64
	iastore
	aload 2
	ldc_w 6
	ldc_w 60
	iastore
	aload 2
	ldc_w 7
	ldc_w 5
	iastore
	aload 2
	ldc_w 8
	ldc_w 53
	iastore
	aload 2
	ldc_w 9
	ldc_w 53
	iastore
	aload 2
	ldc_w 10
	ldc_w 17
	iastore
	aload 2
	ldc_w 11
	ldc_w 93
	iastore
	aload 2
	ldc_w 12
	ldc_w 59
	iastore
	aload 2
	ldc_w 13
	ldc_w 51
	iastore
	aload 2
	ldc_w 14
	ldc_w 62
	iastore
	aload 2
	ldc_w 15
	ldc_w 12
	iastore
	aload 2
	ldc_w 16
	ldc_w 64
	iastore
	aload 2
	ldc_w 17
	ldc_w 11
	iastore
	aload 2
	ldc_w 18
	ldc_w 67
	iastore
	aload 2
	ldc_w 19
	ldc_w 63
	iastore
	aload 1
	aload 2
	invokevirtual Mergesort/mergesort([I)[I
	astore 2
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 1
	ldc_w 1
	ldc_w 2
	invokevirtual Mergesort/avg(II)I
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 1
	ldc_w 1
	ldc_w 3
	invokevirtual Mergesort/avg(II)I
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 1
	ldc_w 1
	ldc_w 4
	invokevirtual Mergesort/avg(II)I
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 0
	invokevirtual java/io/PrintStream/println(I)V
	ldc_w 0
	ireturn
.end method

