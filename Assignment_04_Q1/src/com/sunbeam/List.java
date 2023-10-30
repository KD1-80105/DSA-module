package com.sunbeam;

public class List {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;
	private Node tail;

	public List() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);

		if (isEmpty()) {
			head = newnode;
			tail = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
			tail = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;
		}
	}

//	public void addPosition(int value, int pos) {
//		Node newnode = new Node(value);
//		if (isEmpty()) {
//			head = newnode;
//		} else if (pos <= 1) {
//			addFirst(value);
//		} else {
//			Node trav = head;
//			for (int i = 1; i < pos - 1 && trav.next != null; i++) {
//				trav = trav.next;
//				newnode.next = trav.next;
//				trav.next = newnode;
//			}
//		}
//	}

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty!!!");
		} else {
			head = head.next;
		}
	}

	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("List is Empty!!!");

		} else {
			Node trav = head;
			while (trav.next.next != null) {
				trav = trav.next;
			}
			trav.next=null;
		}
	}

	public void displayAll() {
		Node trav = head;
		System.out.println("List: ");
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}

}
