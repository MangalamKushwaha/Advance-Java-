package com.leetcode_questions;

public class IndexOfFirstOccurenceInString {

	public static int strStr(String haystack, String needle) {
		int index = -1;
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			if (haystack.substring(i, i + needle.length()).equals(needle)) {
				System.out.println("element is : " + haystack.substring(i, i + needle.length())+"   "+i);
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		String haystack = "sadbutsad";
		String needle = "sad";

		System.out.println("Index of first occurence is :" + strStr(haystack, needle));
	}

}
