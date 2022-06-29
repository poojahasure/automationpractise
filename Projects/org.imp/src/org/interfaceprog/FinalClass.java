package org.interfaceprog;

interface InterEx1{
	public static final int b=1;// cannot be reassigned 
}
 class Child {
	public final void method() {//cannot be overriden
		System.out.println("final class");
	}
}
final  class Child1 { //cannot inheritate
		public  void method() {
			System.out.println("final class");
		}
	}
public class FinalClass extends Child1{
	public final void method() {
		System.out.println("final class");
	}
	public static void main(String args[]) {
		FinalClass obj= new FinalClass();
//		InterEx1.b=12;
		
	}

}
