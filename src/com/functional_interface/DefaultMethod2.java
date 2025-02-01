package com.functional_interface;

public interface DefaultMethod2{
	default void sayHello() {
		System.out.println("This is default method 2 interface");
	}
}
