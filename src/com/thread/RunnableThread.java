package com.thread;

// second way to create thread

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Value of i in RunnableThread is " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableThread th = new RunnableThread();
		// until here you have prepare blue print of thread class
		// so need to use Thread Class, you have to create new thread class
		Thread t2 = new Thread(th);
		t2.start();
		MyThread t1 = new MyThread();
		t1.start();
	}

}
