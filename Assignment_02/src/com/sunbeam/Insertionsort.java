package com.sunbeam;

import java.util.Arrays;

public class Insertionsort {
	public static int insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					j--;
				}
			}
		}

		return 0;

	}

	public static void main(String[] args) {
		int[] arr = { 45, 5, 94, 65, 4, 94, 61 };

		System.out.println("before sorting..." + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("after sorting..." + Arrays.toString(arr));

	}

}
