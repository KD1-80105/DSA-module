package com.sunbeam;

import java.util.Stack;

public class QueueUsingStack<T> {
	private Stack<T> stack1 = new Stack<>();
	private Stack<T> stack2 = new Stack<>();

	public void push(T item) {
		stack1.push(item);
	}

	public T pop() {
		if (isEmpty()) {
			throw new IllegalAccessError("Queue Empty");
		}
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}

	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}

	public int size() {
		return stack1.size() + stack2.size();
	}

	public static void main(String[] args) {
		QueueUsingStack<Integer> queue = new QueueUsingStack<>();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);

		System.out.println("Before size: " + queue.size());
		System.out.println("Popped Element: " + queue.pop());
		System.out.println("Before size: " + queue.size());
	}
}
