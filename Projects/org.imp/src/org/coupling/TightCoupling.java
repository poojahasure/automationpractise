package org.coupling;


class Parent23{
	
	public Parent23(int a) {
		
	}
	public void display() {
		
		System.out.println("Parent Display Method");
	}
}



public class TightCoupling extends Parent23 {
		public void display() {
		
		System.out.println("Parent Display Method");
	   }
     	
		public static void main(String args[]) {
     		TightCoupling obj=new TightCoupling();
     		obj.display();
     	}
}
