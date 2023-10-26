package com.sunbeam;

import java.util.Scanner;

public class Noccurence {
	static Scanner sc = new Scanner(System.in);

	public static int Occur(int arr[]) {
		System.out.println("Enter the number to check the occurence: ");
		int key = sc.nextInt();
		System.out.println("Enter the no. of occurence you wish to check: ");
		int pin = sc.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				count++;
				if (count == pin) {
					return i;
				}
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 55, 66, 33, 55, 56 };

		int i = Occur(arr);
		System.out.println("The index of number is  and the occurence of that number is " + i);

	}

}
