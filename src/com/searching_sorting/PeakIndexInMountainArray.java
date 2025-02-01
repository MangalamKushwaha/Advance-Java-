package com.searching_sorting;
/*
 * arr.length>=3;
	peak mountain arr   e.g.[0,1,0],[0,10,5,2,]

	find peak index from array
*/

public class PeakIndexInMountainArray {
	
	private static int peakIndexInArray(int arr[]) {
		int start=0;
		int end=arr.length-1;
		int mid=start+(end-start)/2;
		
		while (start<end) {
			if(arr[mid]< arr[mid+1]) {
				start=mid+1;
			}else {
				end=mid;
			}
			mid=start+(end-start)/2;
		}
		
		return mid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,10,5,2,1};
		
		
		System.out.println("Peak index in montain array is : "+peakIndexInArray(arr));
	}

	

}
