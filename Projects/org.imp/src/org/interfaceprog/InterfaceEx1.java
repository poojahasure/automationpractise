package org.interfaceprog;

interface InterParent {
	public static final int a=1;
	public int add(int a,int b);
	public int sub(int c,int d);
	public static void test4 () {
		System.out.println("Static method");
	}
	default  void test1() {
		System.out.println("Default");
	}
}
//class Child {
//	public static void test4 () {
//		System.out.println("Static method");
//	}
//	
//}
//interface InterParent2 implements Child{
//	public static void test5() {
//		System.out.println("Static method 2nd interface");
//	}
//}

public class InterfaceEx1  implements InterParent {
	
	public static void main(String args[]) {
		InterfaceEx1 obj=new InterfaceEx1();
		System.out.println(obj.add(1,2));
		System.out.println(obj.sub(5,2));
//		obj.a=12; 
		
	}
	
}
