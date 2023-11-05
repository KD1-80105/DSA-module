package com.sunbeam;

public class DequeMain {

	public static void main(String[] args) {
		Deque deque=new Deque();
		deque.insertFront(20);
		deque.insertFront(30);
		deque.deleteFront();
		deque.displayLatest();
	}

}
