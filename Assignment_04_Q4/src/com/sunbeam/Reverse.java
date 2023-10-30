package com.sunbeam;

public class Reverse {

	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}

	}

	Node head;

	public Reverse() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addData(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void reverse() {
		if (isEmpty()) {
			System.out.println("List Empty");
		}

		Node t1 = head;
		Node t2 = head.next;

		head.next = null;
		while (head != null) {
			head = t2.next;
			t2.next = t1;
			t1 = t2;
			t2 = head;
		}
		head = t1;
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

	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		reverse.addData(10);
		reverse.addData(20);
		reverse.addData(30);
		reverse.addData(40);
		reverse.addData(50);
//		reverse.reverse();
		reverse.displayAll();
	}
}
