package org.thiskeyword;
//1. In this we have done constructor overloading
//2. Use of this()
//3. use of this.

public class ThisKey{
	int a=10 ;
	
	public void test() {
		System.out.println(this.a);
		System.out.println("test method");
	}
	
	public ThisKey() {
		
		System.out.println("Parent5 default constructor");
	}
	public ThisKey(int a,char b) {
		this();
		
		System.out.println("int char constructor");
	}
	public ThisKey(float a,char b) {
		this(2,'d');
		System.out.println("float char constructor");
	}
	public ThisKey(boolean d) {
		this(20f,'s');
		System.out.println("boolean constructor");
	}
	
	public static void main(String [] args) {
		ThisKey obj =new ThisKey(true);
	//	this.test();
		obj.test();
    		
    	}


}