package com.sunbeam;

class LinkedList1 {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;

	// Function to insert a new node at the end of the linked list
	public void insert(int newData) {
		Node newNode = new Node(newData);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	// Function to find the maximum value in the linked list
	public int findMax() {
		if (head == null) {
			System.out.println("List is empty.");
			return Integer.MIN_VALUE;
		}

		int max = head.data;
		Node current = head;
		while (current != null) {
			if (current.data > max) {
				max = current.data;
			}
			current = current.next;
		}
		return max;
	}

	// Function to find the minimum value in the linked list
	public int findMin() {
		if (head == null) {
			System.out.println("List is empty.");
			return Integer.MAX_VALUE;
		}

		int min = head.data;
		Node current = head;
		while (current != null) {
			if (current.data < min) {
				min = current.data;
			}
			current = current.next;
		}
		return min;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(3);
		list.insert(1);
		list.insert(4);
		list.insert(2);
		list.insert(5);

		int max = list.findMax();
		int min = list.findMin();

		System.out.println("Maximum value in the linked list: " + max);
		System.out.println("Minimum value in the linked list: " + min);
	}
}
