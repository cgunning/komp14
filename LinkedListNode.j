
.class LinkedListNode
.super java/lang/Object
.field next LLinkedListNode;
.field value I
.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method

.method setNext(LLinkedListNode;)I
	.limit locals 2
	.limit stack 2
	aload 0
	aload 1
	putfield LinkedListNode/next LLinkedListNode;
	ldc_w 1
	ireturn
.end method

.method setValue(I)I
	.limit locals 2
	.limit stack 2
	aload 0
	iload 1
	putfield LinkedListNode/value I
	ldc_w 1
	ireturn
.end method

.method getValue()I
	.limit locals 1
	.limit stack 2
	aload 0
	getfield LinkedListNode/value I
	ireturn
.end method

.method getNext()LLinkedListNode;
	.limit locals 1
	.limit stack 2
	aload 0
	getfield LinkedListNode/next LLinkedListNode;
	areturn
.end method

