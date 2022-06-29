package org.superkeyword;



class Parent12{
	public Parent12() {
		System.out.println("Parent12 default constructor");
	}
}

class Child12  extends Parent12{
	
	public Child12() {
		System.out.println("Child12 default constructor");
	}
}



public class Super extends  Child12{
	public Super() {
		super();
		System.out.println("super constructor ");
	}
	
	public static void main(String args[]) {
		Super obj = new Super();
		
	}

}
