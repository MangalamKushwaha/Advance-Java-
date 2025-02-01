package com.oops.concept.polymorphism;

// method overloading have same name of method  
//having different data type of parameter
public class MethodOverLoading {
	public void sum() {
		System.out.println("This is method overloading class");
	}

	public int sum(int a, int b) {
		return a + b;
	}

	public double sum(double a, double b) {
		return a + b;
	}
}
