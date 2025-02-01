package com.Output_Based_Question;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 System.out.print(12/0);
			 }catch(Exception ex) {
			 System.out.print("Exception");
			 System.exit(0);
			 }
			 finally {
			 System.out.print("Finally");
			 }

	}

}
