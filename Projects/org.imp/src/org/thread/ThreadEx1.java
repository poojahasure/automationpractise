package org.thread;

public class ThreadEx1 extends Thread{

	public static void main(String[] args) {
		System.out.println(" program starts");
		ThreadEx1 obj =new ThreadEx1();
		obj.start();
		System.out.println(" program end");
		

	}
	public void run() {
		System.out.println("run program starts");
		System.out.println("run program end");
	}

}
