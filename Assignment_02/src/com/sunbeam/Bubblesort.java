package com.sunbeam;

import java.util.Arrays;

public class Bubblesort {

	public static void bubbleSort(int[] arr) {
		int count = 0;
		int flag;
		for (int i = 1; i < arr.length; i++) {
			flag = 0;
			for (int j = 0; j < arr.length - 1; j++) {
				count++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
//				System.out.println("Array already sorted...");
				break;
			}
		}

		System.out.println("no of comparisons...." + count);
	}

	public static void main(String[] args) {
//		int[] arr = { 45, 5, 94, 65, 4, 94, 61 };
		int[] arr= {10,20,30,40,50,60,70,80};
		System.out.println("before bubble sort  " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("after bubble sort  " + Arrays.toString(arr));
	}

}
