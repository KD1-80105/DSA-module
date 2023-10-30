package com.sunbeam;

public class SinglyLinearLinkedListMain {

	public static void main(String[] args) {
		List li = new List();
		li.addFirst(10);
		li.addFirst(20);
		li.addFirst(30);
		li.addFirst(40);
		li.addFirst(50);
		li.addLast(90);
		li.deleteFirst();
		li.deleteLast();
		li.displayAll();
	}
}
