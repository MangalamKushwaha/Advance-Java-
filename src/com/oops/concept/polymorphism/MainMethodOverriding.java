package com.oops.concept.polymorphism;

public class MainMethodOverriding extends MethodOverriding {
	
	@Override
	public void show() {
		System.out.println("Hello, This is show method inside the Main MethodOverriding class.");
	}
	
	public static void main(String[] args) {
		MainMethodOverriding m=new MainMethodOverriding();
		m.show();
		
		MethodOverriding n=new MethodOverriding();
		n.show();
	}
}
