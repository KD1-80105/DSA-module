package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<T> {
	private Queue<T> queue = new LinkedList<>();

	public void push(T item) {
		int size = queue.size();

		queue.offer(item);

		// Rotate the queue to move the new item to the front
		for (int i = 0; i < size; i++) {
			queue.offer(queue.poll());
		}
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public int size() {
		return queue.size();
	}

	public T pop() {
		if (isEmpty()) {
			throw new IllegalAccessError("Stack is empty");
		}
		return queue.poll();
	}

	public static void main(String[] args) {
		StackUsingQueue<Integer> stack = new StackUsingQueue<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		System.out.println("Stack Size: " + stack.size());
		System.out.println("Popped item: " + stack.pop());
		System.out.println("Stack Size after pop: " + stack.size());

	}
}
