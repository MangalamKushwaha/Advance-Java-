package com.pattern;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();

		double length = String.valueOf(number).length();
		System.out.println("length of number is :" + length);
		int sum = 0;
		int mod = 0;
		for (int i = 0; i < length; i++) {
			System.out.println("length inide loop is " + length);
			mod = number % 10;
			System.out.println("mod is " + mod);

			number = number / 10;
			System.out.println("num is:" + number);

			sum += mod;
		}
		System.out.println("sum is " + sum);

	}
}
