package com.sunbeam;

import java.util.Scanner;

public class Prac_binary2 {

	public static int binary_search(int arr[], int size, int key) {

		int left = 0, right = size - 1, mid;

		while (right >= left) {
			mid = (left + right) / 2;

			if (key == arr[mid])
				return mid;
			else if (key < arr[mid])
				left = mid +1;
			else
				right = mid - 1;
		}

		return -1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 66, 55, 44, 33, 22, 11 };

		System.out.println("Enter the key to find: ");
		int key = sc.nextInt();

		int index = binary_search(arr, arr.length, key);

		if (index != -1)
			System.out.println("Key found at the index " + index);
		else
			System.out.println("Key not Found!!");

	sc.close();
	}
}