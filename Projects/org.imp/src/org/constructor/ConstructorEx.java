package org.constructor;

public class ConstructorEx {
	
	int a;
	int b;
	int interestrate;
	
	public ConstructorEx() {
		System.out.println("Default Constructor ");
	}
	
	public ConstructorEx(int value1,int value2) {
		a=value1;
		b=value2;
		System.out.println("Parameterised constructor");
		
	}
	public ConstructorEx(int value) {
		interestrate=value;
		System.out.println("Interest Constructor =" + interestrate);
	}
	public static void main(String args[]) {
		
		ConstructorEx obj =new ConstructorEx(12,23);
		System.out.println("value1 =" + obj.a);
		ConstructorEx axis =new ConstructorEx(8);
		ConstructorEx hdfc =new ConstructorEx(7);
	}

}
