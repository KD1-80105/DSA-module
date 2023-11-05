package com.sunbeam;

public class StackLinkedList {

	List list;

	public StackLinkedList() {
		list = new List();
	}

	public boolean isEmpty() {
		return list.isEmpty();

	}

	public void push(int value) {
		list.addFirst(value);
	}

	public void pop() {
		list.deleteFirst();
	}

	public void peek() {
		list.displayLatest();
	}

	public static void main(String[] args) {
		StackLinkedList linkedList = new StackLinkedList();

		linkedList.push(11);
		linkedList.push(12);
//		linkedList.pop();
		linkedList.peek();
	}
}
