package com.sunbeam;

public class LinkedList {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;

	public void insertAfter(Node prevNode, int newData) {
		if (prevNode == null) {
			System.out.println("Previous node cannot be null.");
			return;
		}

		Node newNode = new Node(newData);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}

	public void insertBefore(Node nextNode, int newData) {
		if (nextNode == null || head == null) {
			System.out.println("Next node or list cannot be null.");
			return;
		}

		Node newNode = new Node(newData);
		if (head == nextNode) {
			newNode.next = head;
			head = newNode;
			return;
		}

		Node temp = head;
		while (temp != null && temp.next != nextNode) {
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Next node not found in the list.");
		} else {
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

	public void displayList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}
