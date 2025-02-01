package com.pattern;

public class Pattern2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
//				for (int k = 1; k <= 3; k++) {
//					if (k >= i || k < j) {
//						System.out.print(" ");
//					}
//					else {
//						System.out.print("*");
//					}
//				}
//				System.out.print("*");
				if (j ==0 || i == 0 || i == 4 || j==4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
//				if (i <= j) {
//					System.out.print(" ");
//				}
//				if (i > j) {
//					System.out.print(" ");
//				}
//				if (i == j) {
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("*");
//				}
//				else {
				

//				}

			}
			System.out.println(" ");
		}

	}

}
