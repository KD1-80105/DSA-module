package com.sunbeam;

public class Middle {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}

	}

	Node head;

	public Middle() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addValue(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
			return;
		} else {
			newnode.next = head;
			head = newnode;
		}

	}

	public void findMiddle() {
		if (isEmpty()) {
			System.out.println("Empty list");
			return;
		}

		Node fast = head;
		Node slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		System.out.println("Middle Node: " + slow.data);
	}

}
