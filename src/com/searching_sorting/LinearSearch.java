package com.searching_sorting;

public class LinearSearch {

	static int linearSearch(int[] arr,int x) {
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				index=i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,5,6,8,9,0};
		int x=8;
		System.out.println(linearSearch(arr,x));
		
		
	}

}
