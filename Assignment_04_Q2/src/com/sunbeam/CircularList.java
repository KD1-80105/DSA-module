package com.sunbeam;

public class CircularList {

	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}

	}

	private Node tail;

	public CircularList() {
		tail = null;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			tail = newnode;
			newnode.next = newnode;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;

		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			tail = newnode;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;

		}
	}

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty!!!");
		} else {
			tail.next = tail.next.next;
		}
	}

	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("List is Empty!!!!!");
		} else {

			Node trav = tail;
			while (trav.next != tail) {
				trav = trav.next;
			}
			trav.next = tail.next;
			tail = trav;
		}
	}

	public void display() {
		Node trav = tail;
		do {
			System.out.println(trav.data);
			trav = trav.next;
		} while (trav != tail);
		System.out.println("");
	}

}
