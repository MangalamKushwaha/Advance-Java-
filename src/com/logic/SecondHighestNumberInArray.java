package com.logic;
// Find second highest number from the array
public class SecondHighestNumberInArray {
	static int secondHighestNumberInArray(int arr[]) {
		int max=Integer.MIN_VALUE;
		int secondHighest=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondHighest=max;
				max=arr[i];
			}else if(secondHighest<arr[i] && arr[i]<max) {
				secondHighest=arr[i];
			}
		}
		
		return secondHighest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 100, 200, 300, 400, 500,300,600 };
		int size = arr.length;
		System.out.println("Second Highest sum of subArray is : " + secondHighestNumberInArray(arr));
	}

}
