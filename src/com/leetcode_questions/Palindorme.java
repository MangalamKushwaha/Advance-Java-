package com.leetcode_questions;

public class Palindorme {
	public static boolean isPalindrome(int x) {
		int x1=x;
		boolean flag = false;
		int res = 0;
		int mod = 0;
		while (x1 > 0) {
			mod = x1 % 10;
			x1 = x1 / 10;
			res = res * 10 + mod;

		}
		System.out.println("res= " + res);
		if (x==res)
			flag = true;
		else
			return false;
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isPalindrome(121));
//		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(10));

	}

}
