package com.logic;

import java.util.ArrayList;
import java.util.Arrays;

 /* Remove duplicate element from array
Array must be sorted then this logic works */
public class RemoveDuplicateElementFromArray {

	private static String removeDuplicateElementFromArray(int[] arr) {
		ArrayList<Integer> newArr = new ArrayList<>(arr.length);
//		Array must be sorted then this logic works
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				newArr.add(arr[i]);
			}
		}
		newArr.add(arr[arr.length - 1]);

		return newArr.toString();
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 5, 7, 9, 7, 9, 3 };
//		System.out.println("Before removing duplicate element from array is : " + arr.toString());
		System.out.println("After remove duplicate element from array is : " + removeDuplicateElementFromArray(arr));
	}
}
