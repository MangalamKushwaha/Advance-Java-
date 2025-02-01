package com.exception;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the string: ");
		String str = "";
		try {
			if (str.isBlank() || str == null || str.isEmpty()) {
			System.out.println("This is custom exception.");
			throw new CustomException("Input cannot be empty or null");
			
			}
		}
		finally {
			System.out.println("Custom Exception learned successfully....");
		}
		

	}

}
