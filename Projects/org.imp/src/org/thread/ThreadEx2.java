package org.thread;

public class ThreadEx2 extends Thread {

	public static void main(String[] args) {
		System.out.println(" program starts");
		ThreadEx1 obj =new ThreadEx1();
		obj.start();
		for(int i=0;i<5;i++) {
			System.out.println("value of i ="+ i);
		}
		System.out.println(" program end");
		

	}
	public void run() {
		System.out.println("run program starts");
		for(int j=0;j<3;j++) {
			System.out.println("value of j ="+ j);
			System.out.println(j);
		}
		System.out.println("run program end");
	}

	}


