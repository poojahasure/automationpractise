package org.inheritance;

class Parent {
	
	int a=10,b=20;
	public  Parent() {
		System.out.println("you are in parent-constructor");
	}
	
	public void test2() {
		System.out.println(" parent-test2");
	}
}
class Child1 extends Parent  {
	public  Child1() {
		System.out.println("you are in child1-constructor");
	}
	
	public void test() {
		System.out.println("you are in childmethod-constructor");
	}
	
}
public class Child2Parent1 extends Child1 {
	public  Child2Parent1() {
		System.out.println("you are in Child2Parent1-constructor");
	}
public static void main(String args[]) {
		Child2Parent1 obj = new Child2Parent1();
	//	obj.test2();
	}

}
