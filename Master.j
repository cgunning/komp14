
.class Master
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 4
	.limit stack 48
	new SearchSort
	dup
	invokespecial SearchSort/<init>()V
	invokevirtual SearchSort/startSort()Z
	istore 1
	ldc_w 5
	newarray int
	astore 2
	iload 1
	ldc_w 1
	if_icmpeq label1
	ldc_w 1
	goto label2
	label1:
	ldc_w 0
	label2:
	ifeq label4
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 0
	invokevirtual java/io/PrintStream/println(I)V
	goto label3
	label4:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 1
	invokevirtual java/io/PrintStream/println(I)V
	label3:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 999999
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	new SearchSort
	dup
	invokespecial SearchSort/<init>()V
	invokevirtual SearchSort/startSearch()I
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 999999
	invokevirtual java/io/PrintStream/println(I)V
	new SearchSort
	dup
	invokespecial SearchSort/<init>()V
	aload 2
	invokevirtual SearchSort/insertionSort([I)[I
	astore 2
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 999999
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	new Fibonacci
	dup
	invokespecial Fibonacci/<init>()V
	ldc_w 10
	invokevirtual Fibonacci/start(I)I
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 999999
	invokevirtual java/io/PrintStream/println(I)V
	new ExpandableArray
	dup
	invokespecial ExpandableArray/<init>()V
	astore 3
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 3
	ldc_w 5
	ldc_w 10
	invokevirtual ExpandableArray/insertAt(II)I
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 3
	ldc_w 8
	ldc_w 20
	invokevirtual ExpandableArray/insertAt(II)I
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 3
	ldc_w 5
	invokevirtual ExpandableArray/get(I)I
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 999999
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 3
	ldc_w 8
	invokevirtual ExpandableArray/get(I)I
	invokevirtual java/io/PrintStream/println(I)V
	return
.end method

