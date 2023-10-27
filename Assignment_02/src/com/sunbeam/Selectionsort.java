package com.sunbeam;

import java.util.Arrays;

public class Selectionsort {

	public static void selectionSort(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				count++;
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("No. of comparisons are..." + count);
	}

	public static void main(String[] args) {
		int[] arr= {55,12,69,84,35,84,54,8};
		
		System.out.println("before sorting..."+Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("before after..."+Arrays.toString(arr));
	}

}
