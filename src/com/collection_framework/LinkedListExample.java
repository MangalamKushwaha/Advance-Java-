package com.collection_framework;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		// Creating object of the class linked list
		LinkedList<String> ll = new LinkedList<String>();

		// Adding elements to the linked list
		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");
		ll.add(5,"F");

		System.out.println("Orginal Linked list will be : "+ll);
		System.out.println("Accessing Linked List through index will be : "+ll.get(4));
		
		System.out.println("After pop up Linked list will be : "+ll.pop());
//		ll.remove("B");
//		ll.remove(2);
//		ll.removeFirst();
//		ll.removeLast();
		ll.removeIf(x->x=="B");

		System.out.println("After removing : "+ll);
		
		

	}
}
