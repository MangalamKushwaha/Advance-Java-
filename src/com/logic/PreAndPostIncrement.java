package com.logic;

public class PreAndPostIncrement {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		x++;
		System.out.println("x is :"+x);
		y=x++;
		System.out.println("y is :"+y);
		System.out.println("x is :"+x);
		
		
		int m=87;
		int n=20;
		n=--m;
		System.out.println("m is :"+m);
		System.out.println("n is :"+n);
	}

}
