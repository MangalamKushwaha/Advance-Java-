package com.functional_interface;

public class Main implements DefaultMethod, DefaultMethod2 {
// Getting error until you override the sayHello() method (ambiguity arises here)
//	Error ::::: SDuplicate default methods named sayHello with the parameters () and () are inherited from 
//	the types DefaultMethod2 and DefaultMethod

	// Override the default method
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		DefaultMethod.super.sayHello();
		DefaultMethod2.super.sayHello();

		// if you want to execute your own data then add here and run
		System.out.println("After Overriding sayHello() method you will able to execute");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.sayHello();
	}

}
