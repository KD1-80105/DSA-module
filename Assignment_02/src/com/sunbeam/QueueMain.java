package com.sunbeam;

import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
		Queue queue = new Queue(3);
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
				}
				break;
			case 2:
				if (queue.isEmpty()) {
					System.out.println("Queue is Empty!!!!");
				} else {
					queue.pop();
					System.out.println("Element popped..");
				}
				break;
			case 3:
				if (queue.isEmpty()) {
					System.out.println("Queue is Empty.....");
				} else {
					System.out.println("Queue is Full and the total elements inside the queue are: "+queue.peek());
				}
				break;

			}
		} while (choice != 0);
		sc.close();
	}

}
