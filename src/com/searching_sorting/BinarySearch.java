package com.searching_sorting;

import java.util.Arrays;

public class BinarySearch {
	static int binarySearch(int arr[], int size, int target) {
//		arr=Arrays.sort(arr);
		int start = 0;
		int end = size - 1;
		int mid = start + (end - start) / 2;

		while (start <= end) {
			if (target == arr[mid]) {
				return mid;
			}
			// go to right part
			if (target > arr[mid]) {
				start = mid + 1;
			} else { // go to left
				// if(target<arr[mid]
				end = mid + 1;
			}
			mid = start + (end - start) / 2;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated th
		int[] arr = { 5, 6, 8, 9, 12 };
		int arrLength = arr.length;

		int[] arr1 = { 5, 6, 8, 9, 12, 20 };
		int arrLength1 = arr.length;

		System.out.println("target 9 is present at :" + binarySearch(arr, arrLength, 9) + " index");
		System.out.println("target 12 is present at :" + binarySearch(arr1, arrLength1, 12) + " index");
	}

}
