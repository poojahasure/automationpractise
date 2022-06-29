package org.imp;

public class SwapNum {
	public static void main(String args[]) {
		SwapNum.test();
		
		
	}
	public static void test() {
		
		int a=5;
		int b=10;
		int temp;
		
		System.out.println("before swap "+ a +" "+ b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swap "  +  a +" "+ b);
	}
	
	
	

}
