package org.practise;

public class Fibonacci {
	public static void main(String [] args) {
		int a=0,b=1,f,n=0;
				while(n<7) {
					System.out.println(a);
					f=a+b;//1 2 3 5 8 13
					a=b;//1  1  2 3 5
					b=f;//1 2 3   5 8
					n++;
					
				}
		
	}

}
