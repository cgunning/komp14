
.class _1g64r976g34f4397gf7g94fg3gy3Main
.super java/lang/Object
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 9
	.limit stack 12
	new _1g64r976g34f4397gf7g94fg3gy3Main
	dup
	invokespecial _1g64r976g34f4397gf7g94fg3gy3Main/<init>()V
	astore 7
	new MainChild
	dup
	invokespecial MainChild/<init>()V
	astore 8
	aload 8
	invokevirtual MainChild/initialize()Z
	istore 6
	aload 8
	new MainGrandChild
	dup
	invokespecial MainGrandChild/<init>()V
	invokevirtual MainChild/dostuff(LMainGrandChild;)J
	lstore 3
	new MainGrandChild
	dup
	invokespecial MainGrandChild/<init>()V
	astore 8
	aload 8
	invokevirtual MainChild/initialize()Z
	istore 6
	aload 8
	new MainGrandChild
	dup
	invokespecial MainGrandChild/<init>()V
	invokevirtual MainChild/dostuff(LMainGrandChild;)J
	lstore 3
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 8
	ldc_w 37
	invokevirtual MainChild/fibonacci(I)J
	invokevirtual java/io/PrintStream/println(J)V
	return
.end method

