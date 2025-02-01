package com.leetcode_questions;

public class TwoSumm {
	public int[] twoSum(int[] nums, int target) {
		int[] indices = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println("i,j:" + i + j);
					indices[0] = i;
					indices[1] = j;
				}
			}
		}
		return indices;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSumm ob = new TwoSumm();
		int[] nums = { 3, 2, 4 };
		int target = 6;

		System.out.println("Indices are :" + ob.twoSum(nums, target));

	}

}
