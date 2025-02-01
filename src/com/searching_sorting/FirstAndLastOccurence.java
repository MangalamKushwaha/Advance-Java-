package com.searching_sorting;

//arr[11]= {1,2,3,3,3,3,3,3,3,3,5}  //
//arr must be sorted this is rule of binary search
//find first and last occurence of key= 3

public class FirstAndLastOccurence {

	private static int firstOccurence(int[] arr, int arrLength, int key) {
		int s=0;
		int e=arrLength-1;
		int mid=s+(e-s)/2;
		int ans=-1;
		
		while(s<=e) {
			if(key==arr[mid]) {
				e=mid-1;
				ans=mid;
			}else if(key>arr[mid]) {
				s=mid+1;
			}else { // key<arr[mid]
				e=mid-1;
			}
			mid=s+(e-s)/2;
		}
		return ans;
	}
	
	private static int lastOccurence(int[] arr, int arrLength, int key) {
		int s=0;
		int e=arrLength-1;
		int mid=s+(e-s)/2;
		int ans=-1;
		
		while(s<=e) {
			if(key==arr[mid]) {
				s=mid+1;
				ans=mid;
			}else if(key>arr[mid]) {
				s=mid+1;
			}else { // key<arr[mid]
				e=mid-1;
			}
			mid=s+(e-s)/2;
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,3,3,3,3,3,3,3,5};
		int arrLength=arr.length;
		int key=3;
		System.out.println("First occurence at index : "+firstOccurence(arr,arrLength,key));
		System.out.println("Last occurence at index : "+lastOccurence(arr,arrLength,key));

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	

}
