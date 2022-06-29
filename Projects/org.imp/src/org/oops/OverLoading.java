package org.oops;

public class OverLoading {
	
	public static void main(String [] args) {
		OverLoading obj  =new OverLoading();
//		obj.test(false); // 1.different types of datatypes
//		obj.test(3);
//		obj.test('c');
//		obj.test('c');
		obj.test(10,30L);
	//	obj.test('s',90);
	}
	
	public void test(int a) { // way 1 -datatype change
		System.out.println(a);
	}
	public void test(char a) {
		System.out.println(a);
	}
	public void test(float a) {
		System.out.println(a);
	}
	public void test(boolean a) {
		System.out.println(a);
	}
	
	
//	public void test(int a) {
//		System.out.println(a);
//	}
	public void test(int a,long b) { //way 2- no of parameter
		System.out.println(a+" "+b);
	}
	public void test(long b,int a) { //way 3- order of parameter
		System.out.println(b+" "+a);
	}

	
}
