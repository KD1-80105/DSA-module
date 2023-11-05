package com.sunbeam;

import com.sunbeam.LinkedList.Node;

public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		Node secondNode = new Node(2);
		Node thirdNode = new Node(3);

		list.head.next = secondNode;
		secondNode.next = thirdNode;

		System.out.println("Original List:");
		list.displayList();

		// Insert after a given node
		list.insertAfter(secondNode, 4);
		System.out.println("List after inserting 4 after the second node:");
		list.displayList();

		// Insert before a given node
		list.insertBefore(secondNode, 5);
		System.out.println("List after inserting 5 before the second node:");
		list.displayList();
	}
}
