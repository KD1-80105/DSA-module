package com.sunbeam;

import java.util.Scanner;

public class CircularQueue {

	private int arr[];
	private int front;
	private int rear;
	private final int SIZE;
	public static int count;

	public CircularQueue(int size) {
		this.SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
	}

	public int push(int data) {
		rear = (rear + 1) % SIZE;
		
		count++;
		return arr[rear] = data;
	}

	public void pop() {
		front = (front + 1) % SIZE;
		if (front == rear) {
			front = rear = -1;
		}
//		return count--;
	}

	public int peek() {
		return arr[front + 1 % SIZE];
	}

	public boolean isFull() {
		return front == -1 && rear == SIZE - 1 || front == rear && rear != -1;
	}

	public boolean isEmpty() {
		return front == rear && rear == -1;
	}

	public static void main(String[] args) {

		CircularQueue queue = new CircularQueue(3);
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("0.Exit");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("Enter your Choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:

				if (queue.isFull()) {
					System.out.println("Queue is Full!!!");
				} else {
					System.out.println("Enter the data to store: ");
					int data = sc.nextInt();
					queue.push(data);
					System.out.println("Elements inside: " + count);
				}
				break;
			case 2:
				if (queue.isEmpty()) {
					System.out.println("Queue is Empty!!!!");
				} else {
					queue.pop();
					System.out.println("Element popped..");
					System.out.println("Elements inside: " + count);
				}
				break;
			case 3:
				if (queue.isEmpty()) {
					System.out.println("Queue is Empty.....");
				} else {
					System.out.println("Queue is Full and the elements inside the queue is: " + queue.peek()
							+ " ans total elements are " + count);
				}
				break;

			}
		} while (choice != 0);
		sc.close();
	}

}
