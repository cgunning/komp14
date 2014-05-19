
.class ExpandableArray
.super java/lang/Object
.field init Z
.field array [I
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method init(I)Z
	.limit locals 2
	.limit stack 4
	aload 0
	iload 1
	newarray int
	putfield ExpandableArray/array [I
	aload 0
	ldc_w 1
	putfield ExpandableArray/init Z
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 1
	invokevirtual java/io/PrintStream/println(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 999999
	invokevirtual java/io/PrintStream/println(I)V
	ldc_w 1
	ldc_w 0
	ifeq label48
	pop
	ldc_w 1
	goto label50
	label48:
	ifeq label49
	ldc_w 1
	goto label50
	label49:
	ldc_w 0
	label50:
	ireturn
.end method

.method insertAt(II)I
	.limit locals 5
	.limit stack 10
	aload 0
	getfield ExpandableArray/init Z
	ifeq label51
	ldc_w 0
	goto label52
	label51:
	ldc_w 1
	label52:
	ifeq label54
	aload 0
	iload 1
	ldc_w 1
	iadd
	invokevirtual ExpandableArray/init(I)Z
	istore 3
	ldc_w 1
	istore 4
	goto label53
	label54:
	ldc_w 0
	istore 4
	label53:
	iload 1
	aload 0
	getfield ExpandableArray/array [I
	arraylength
	ldc_w 1
	isub
	if_icmple label55
	ldc_w 1
	goto label56
	label55:
	ldc_w 0
	label56:
	ifeq label58
	aload 0
	iload 1
	invokevirtual ExpandableArray/expandArray(I)Z
	istore 3
	goto label57
	label58:
	label57:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 0
	aload 0
	getfield ExpandableArray/array [I
	invokevirtual ExpandableArray/printArray([I)I
	invokevirtual java/io/PrintStream/println(I)V
	iload 4
	ireturn
.end method

.method expandArray(I)Z
	.limit locals 4
	.limit stack 10
	aload 0
	getfield ExpandableArray/array [I
	arraylength
	iload 1
	aload 0
	getfield ExpandableArray/array [I
	arraylength
	isub
	iadd
	ldc_w 1
	iadd
	newarray int
	astore 2
	ldc_w 0
	istore 3
	label59:
	iload 3
	aload 0
	getfield ExpandableArray/array [I
	arraylength
	if_icmpge label61
	ldc_w 1
	goto label62
	label61:
	ldc_w 0
	label62:
	ifeq label60
	iload 3
	ldc_w 1
	iadd
	istore 3
	goto label59
	label60:
	aload 0
	aload 2
	putfield ExpandableArray/array [I
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 0
	aload 0
	getfield ExpandableArray/array [I
	invokevirtual ExpandableArray/printArray([I)I
	invokevirtual java/io/PrintStream/println(I)V
	ldc_w 1
	ireturn
.end method

.method get(I)I
	.limit locals 3
	.limit stack 4
	ldc_w 0
	istore 2
	iload 1
	aload 0
	getfield ExpandableArray/array [I
	arraylength
	if_icmpge label63
	ldc_w 1
	goto label64
	label63:
	ldc_w 0
	label64:
	ifeq label66
	aload 0
	getfield ExpandableArray/array [I
	iload 1
	iaload
	istore 2
	goto label65
	label66:
	label65:
	iload 2
	ireturn
.end method

.method printArray([I)I
	.limit locals 3
	.limit stack 10
	ldc_w 0
	istore 2
	label67:
	iload 2
	aload 1
	arraylength
	if_icmpge label69
	ldc_w 1
	goto label70
	label69:
	ldc_w 0
	label70:
	ifeq label68
	getstatic java/lang/System/out Ljava/io/PrintStream;
	aload 1
	iload 2
	iaload
	invokevirtual java/io/PrintStream/println(I)V
	iload 2
	ldc_w 1
	iadd
	istore 2
	goto label67
	label68:
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc_w 999999
	invokevirtual java/io/PrintStream/println(I)V
	ldc_w 0
	ireturn
.end method

