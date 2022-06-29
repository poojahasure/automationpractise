package org.inheritance;


class ParentEx{
	public ParentEx() {
		System.out.println("Parent Constructor");
	}

	public void test() {
		System.out.println("test");
	}
}

class Child extends ParentEx{
	//Child obj=new Child();
	public  Child() {
		System.out.println("child1 Constructor");
	}
}

public class HirarchyChild extends ParentEx{
	public  HirarchyChild() {
		System.out.println("HirarchyChild Constructor");
	}
	public static void main(String args[]) {
		HirarchyChild obj =new HirarchyChild();
		Child obj1=new Child();
		
	}	

}
	
