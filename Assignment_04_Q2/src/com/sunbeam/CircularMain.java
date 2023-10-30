package com.sunbeam;

public class CircularMain {
	public static void main(String[] args) {
		CircularList circularList = new CircularList();
		circularList.addFirst(10);
		circularList.addFirst(20);
		circularList.addFirst(30);
		circularList.addFirst(40);
		circularList.addFirst(50);
		circularList.addLast(69);
		circularList.deleteFirst();
		circularList.deleteLast();
		circularList.display();
	}
}
