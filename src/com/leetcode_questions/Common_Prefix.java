package com.leetcode_questions;

public class Common_Prefix {
	public static String longestCommonPrefix(String[] strs) {
		// first element of array defined as prefix so that we can compare it
		String str = strs[0];

		// loop to work on single string
		for (int i = 1; i < strs.length; i++) { // comparing start with 2nd string of array
			String s = strs[i];
			System.out.println(s.length());
			System.out.println(str.length());
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < Math.min(s.length(), str.length()); j++) {

				if (s.charAt(j) == str.charAt(j))
					sb.append(s.charAt(j));
				else
					break;
			}
			str = sb.toString();
		}
		return str;
	}

	public static void main(String[] args) {
		String[] str = { "flower", "flow", "flight" };
		System.out.println("Longest prefix is: " + longestCommonPrefix(str));

	}

}
