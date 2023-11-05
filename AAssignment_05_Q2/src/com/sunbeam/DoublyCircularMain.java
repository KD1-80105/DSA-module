package com.sunbeam;

public class DoublyCircularMain {

	public static void main(String[] args) {
		List list = new List();
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.addPosition(55, 4);

//		list.deleteFirst();
//		list.deleteLast();
		list.deletePosition(3);

		list.fDisplay();
//		list.rDisplay();
	}

}
