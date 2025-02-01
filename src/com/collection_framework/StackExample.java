package com.collection_framework;

import java.util.Stack;

//Stack follow LIFO
//Stack class extends Vector class and uses vector method
//Stack uses to solve mostly paranthesis question
public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(4);
		st.push(7);
		st.push(49);
		st.push(6);
		st.push(1);
//		st.add(2, 30); // here using vector class method to add in stack

		System.out.println("Original stack is : "+st);
		

		
		
		System.out.println("Size of stack is : "+st.size());
		System.out.println("Access stack is : "+st.get(3));
		System.out.println("Peek element is : "+st.peek());
		System.out.println("Search element using index value in stack is : "+st.search(4));
		
		
		// This will pop all element from stack and print the element which are pop
//		while(!st.isEmpty()) {
//			System.out.println("pop element is : "+st.pop());
//		}
		
		
		st.pop(); // pop method can remove only top element
//		st.remove(2); // remove 2nd index of stack which is in b/w the stack
//		System.out.println("Removing element from stack is : "+st.remove(2));
		System.out.println("pop element is : "+st.pop()); // return the element which is pop from stack
		System.out.println("Modified stack is : "+st);
		
		
	}

}
