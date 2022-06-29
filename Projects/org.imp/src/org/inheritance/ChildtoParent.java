package org.inheritance;


 class Parent1C1 {
	
	int a=10,b=20;
	public void test1() {
		System.out.println("you are in parent-test1");
	}
	
	public void test2() {
		System.out.println("you are in parent-test2");
	}
}
public class ChildtoParent extends Parent1C1  {
	
	public void childMethod() {
		System.out.println("you are in childmethod");
	}
	public static void main(String args[]) {
		ChildtoParent obj = new ChildtoParent();
		obj.test1();
		obj.test2();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.childMethod();
	}
}
