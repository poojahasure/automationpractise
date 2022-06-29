package org.thread;

public class ThreadEx3 implements Runnable{
	public static void main(String[] args) throws InterruptedException {
		System.out.println(" program starts");
		ThreadEx1 obj =new ThreadEx1();
		obj.start();
		Thread.sleep(2000);
		for(int i=0;i<5;i++) {
			System.out.println("value of i ="+ i);
		}
		System.out.println(" program end");
		

	}
	public void run() {
		System.out.println("run program starts");
		for(int k=0;k<3;k++) {
			System.out.println("value of k ="+ k);
			
		}
		System.out.println("run program end");
	}

}
