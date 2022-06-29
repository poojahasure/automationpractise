package org.imp;
//0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
public class FibonacciSeries {
	
	public static void main(String args[]) {
		FibonacciSeries.test();
		
	}
	public static void test() {

		int a=0,b=1;
		int f;
		int i=0;
		while(i<=12) {
			
			System.out.println(a);
			f=a+b;
			a=b;
			b=f;
			i++;
		}
	}

}
