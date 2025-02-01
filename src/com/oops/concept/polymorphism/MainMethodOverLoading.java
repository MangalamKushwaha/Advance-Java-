package com.oops.concept.polymorphism;

public class MainMethodOverLoading {
	public static void main(String[] args) {
		MethodOverLoading m = new MethodOverLoading();
		
		m.sum();
		System.out.println(m.sum(5, 6));
		System.out.println(m.sum(5.6, 9.5));
	}
}
