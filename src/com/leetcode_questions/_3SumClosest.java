package com.leetcode_questions;

import java.util.Arrays;

public class _3SumClosest {
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int closetSum = Integer.MAX_VALUE / 2;
		int sum = 0;

		for (int i = 0; i < nums.length - 2; i++) {
			int right = nums.length - 1;
			int left = i + 1;
			while (left < right) {
				int currentSum = nums[i] + nums[left] + nums[right];
				if (Math.abs(target - currentSum) < Math.abs(target - closetSum)) {
					closetSum = currentSum;
				} else if (currentSum < target) {
					left++;
				} else if (currentSum > target) {
					right--;
				}
			}
		}
		return closetSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -1,2,1,-4};
		int target = 1;
		System.out.println("Closest sum of three integer is :" + threeSumClosest(nums, target));

	}

}
