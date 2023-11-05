package com.sunbeam;

public class Deque {

	public class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}

	private Node head;
	private Node tail;

	public Deque() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null;

	}

	public void insertFront(int value) {

//		a. Create a new node
		Node nn = new Node(value);
//		b. Check if this node is NULL or not.
//		If it is not NULL, then check if ‘head’ is NULL or not.
		if (isEmpty()) {
			tail = head = nn;
//		If it is NULL, it means that memory is full and no further nodes can be created.
//		If ‘head’ is NULL, that means this is the first node in the list so, assign the address of this newly created node to ‘head’ and ‘tail’
//		If ‘head’ is not NULL, then
		} else {
//		Assign the next pointer of the new node to head.
			nn.next = head;
//		Assign the previous pointer of the head to the new node.
			head.prev = nn;
//		Update the ‘head’ to the new node’s address
			head = nn;

		}

	}

	public void deleteFront() {
//		a. Check if the list is empty or not
		if (isEmpty()) {
//		If the list is empty, return from the function.
			return;
		} else {
//		Else, store the address of ‘head’ in a ‘temp’ variable and advance ‘head’ by one node using head = head→next.
			Node temp = head;
			head = head.next;
//		If ‘head’ becomes NULL, that means only one node existed in the list, so, make the ‘tail’ NULL as well.
			if (head == null) {
				tail = null;
//		Else, make previous of head as NULL.
			} else {
				head.prev = null;
			}
//		Free the memory from the ‘temp’ node.
			temp = null;
		}
//		Decrement the ‘size’ variable by one.

	}

	public void addLast(int value) {
		// 1. create node
		Node nn = new Node(value);
		// 2. if list is empty
		if (isEmpty()) {
			// a. add newnode into head
			head = nn;
			// b. make list circular
			head.next = nn;
			head.prev = nn;
		}
		// 3. if list is not empty
		else {
			// a. add first node into next of newnode
			nn.next = head;
			// b. add last node into prev of newnode
			nn.prev = head.prev;
			// c. add newnode into next of last node
			head.prev.next = nn;
			// d. add newnode into prev of first node
			head.prev = nn;
		}
	}

	public void addPosition(int value, int pos) {
		Node nn = new Node(value);

		if (isEmpty()) {
			head = nn;

			head.next = nn;
			head.prev = nn;
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++)
				trav = trav.next;

			nn.next = trav.next;

			nn.prev = trav.prev;

			trav.next = nn;
			nn.next.prev = nn;
		}
	}

	public void deletePosition(int pos) {

//			Node nn = new Node(pos);

		if (isEmpty()) {
			return;
		} else {
			Node trav = head;
			for (int i = 1; i < pos; i++) {
				trav = trav.next;

			}
			trav.next.prev = trav.prev;
			trav.prev.next = trav.next;
		}

	}

	public void deleteFirst() {
		// 1. if list is empty
		if (isEmpty())
			return;
		// 2. if has single node
		else if (head.next == head)
			head = null;
		// 3. if list has multiple nodes
		else {
			// a. add second node into next of last node
			head.prev.next = head.next;
			// b. add last node into prev of second node
			head.next.prev = head.prev;
			// c. move head on second node
			head = head.next;
		}
	}

	public void deleteLast() {
		// 1. if list is empty
		if (isEmpty())
			return;
		// 2. if list has single node
		else if (head.next == head)
			head = null;
		// 3. if list has multiple nodes
		else {
			// a. add first node into next of second last node
			head.prev.prev.next = head;
			// b. add second last node into prev of first node
			head.prev = head.prev.prev;
		}
	}

	public void fDisplay() {
		if (isEmpty())
			return;
		// 1. create trav and start at head
		Node trav = head;
		System.out.print("Forward List : ");
		do {
			// 2. visit current node
			System.out.print(" " + trav.data);
			// 3. go on next node
			trav = trav.next;
		} while (trav != head); // 4. repeat step 2 and 3 till last node
		System.out.println("");
	}

	public void rDisplay() {
		if (isEmpty())
			return;
		// 1. create trav and start at last node
		Node trav = head.prev;
		System.out.print("Reverse List : ");
		do {
			// 2. visit current node
			System.out.print(" " + trav.data);
			// 3. go on prev node
			trav = trav.prev;
		} while (trav != head.prev); // 4. repeat step 2 and 3 till last node
		System.out.println("");
	}

	public void displayLatest() {
		System.out.println("The latest element is: " + head.data);
	}
}
