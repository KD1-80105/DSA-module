package com.sunbeam;

public class Norepeat {
	public static void noRepeat(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					break;

				}
			}
			if (count == 0) {
				System.out.println("non repeating ..." + arr[i]);
				break;
			}
		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		noRepeat(arr);

	}

}
