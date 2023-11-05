package com.sunbeam;

public class QueueLinkedLIst {

	List list;

	public QueueLinkedLIst() {
		list = new List();
	}

	public void push(int value) {
		list.addLast(value);
	}

	public void pop() {
		list.deleteFirst();
	}

	public void peek() {
		list.displayLatest();

	}

	public static void main(String[] args) {
		QueueLinkedLIst ist = new QueueLinkedLIst();

		ist.push(96);
		ist.push(97);
		ist.push(98);
		ist.peek();
	}

}
