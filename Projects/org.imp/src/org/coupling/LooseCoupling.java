package org.coupling;


interface InterParent{
	public void display();
}

class Child1 implements InterParent{
	public Child1(int a) {
		
	}
	public void display() {
		System.out.println("Display method is implemented in child1");
	}
}
class Child2 implements InterParent{
	public void display() {
		System.out.println("Display method is implemented in child2");
	}
	
}

public class LooseCoupling {
	public static void main(String args[]) {
		Child2  obj2= new Child2();
		obj2.display();
	}

}
