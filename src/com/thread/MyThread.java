package com.thread;

// first way to create thread using Thread class
public class MyThread extends Thread {
	
//	@Override
	public void run() {
		for(int i=10;i>=1;i--) {
			System.out.println("Value of i in MyThread is "+i);
		}
		try {
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		t1.start();
	}

}
