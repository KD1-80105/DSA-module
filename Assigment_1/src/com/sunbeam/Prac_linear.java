package com.sunbeam;

import java.util.Scanner;

public class Prac_linear {

	public static int linear_search(int arr[], int size, int key) {
		for (int i = 0; i < size; i++) {
			if (arr[i] == key) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 22, 11, 55, 33, 99, 44, 66, 77, 22 };
		System.out.println("Enter the key to find: ");
		int key=sc.nextInt();

		int index = linear_search(arr, arr.length, key);
		if (index != -1) {
			System.out.println("Key Found !! at index " + index);
		} else {
			System.out.println("key not Found");
		}
		sc.close();
	}
}