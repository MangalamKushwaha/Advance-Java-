package com.logic;

// Finding 2nd Highest sum of sub-array
import java.util.Iterator;

public class SecondHighestSubarraySum {
	static int secondHighestSubarraySum(int arr[], int size) {
		int secondHighestSum = 0;
		int sum = 0;
		int smallestNumber = Integer.MAX_VALUE;
		for (int i = 0; i < size; i++) {
			sum += arr[i];
			if (smallestNumber > arr[i]) {
				smallestNumber = arr[i];
			}
		}
		secondHighestSum = sum - smallestNumber;
		return secondHighestSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 100, 200, 300, 400, 500 };
		int size = arr.length;
		System.out.println("Second Highest sum of subArray is : " + secondHighestSubarraySum(arr, size));

	}

}
