package com.functional_interface;

public interface DefaultMethod {
	default void sayHello() {
		System.out.println("This is default method interface");
	}
}


