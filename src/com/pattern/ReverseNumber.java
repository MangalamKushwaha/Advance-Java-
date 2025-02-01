package com.pattern;

import java.util.Scanner;

public class ReverseNumber {

	static int reverseNumber(int num) {
		int length = String.valueOf(num).length();
		int res = 0;
		for (int i = 0; i < length; i++) {
			int mod = num % 10;
			num = num / 10;
			res = (res * 10) + mod;

		}
		return res;
	}

	static int reverseNumberUsingString(int num) {
//		int reverse = 0;
		String rev = "";
		int length = String.valueOf(num).length();
		System.out.println("length of number is :" + length);

		for (int i = 0; i < length; i++) {

			int mod = num % 10;
			num = num / 10;
			rev = rev + mod;

		}
		int reverse = Integer.parseInt(rev);
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();

		System.out.println(reverseNumber(number));

//		System.out.println(reverseNumberUsingString(number));

	}

}
