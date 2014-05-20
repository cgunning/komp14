
.class LinkedListStack
.super java/lang/Object
.field top LLinkedListNode;
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method push(I)I
	.limit locals 4
	.limit stack 4
	new LinkedListNode
	dup
	invokespecial LinkedListNode/<init>()V
	astore 2
	aload 2
	aload 0
	getfield LinkedListStack/top LLinkedListNode;
	invokevirtual LinkedListNode/setNext(LLinkedListNode;)I
	istore 3
	aload 2
	iload 1
	invokevirtual LinkedListNode/setValue(I)I
	istore 3
	aload 0
	aload 2
	putfield LinkedListStack/top LLinkedListNode;
	iload 1
	ireturn
.end method

.method pop()I
	.limit locals 2
	.limit stack 2
	aload 0
	getfield LinkedListStack/top LLinkedListNode;
	invokevirtual LinkedListNode/getValue()I
	istore 1
	aload 0
	aload 0
	getfield LinkedListStack/top LLinkedListNode;
	invokevirtual LinkedListNode/getNext()LLinkedListNode;
	putfield LinkedListStack/top LLinkedListNode;
	iload 1
	ireturn
.end method

