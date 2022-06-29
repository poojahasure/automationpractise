package org.interfaceprog;

public class CallingInterface implements InterfaceExtendInterface{
	 
	
	
	public static void main(String[] args) {
		CallingInterface obj =new CallingInterface();
		System.out.println(InterParent3.a);
		obj.test1();
		InterParent3.test4();// 
		obj.add(2,1);
	}
	public int add(int a,int b) {
		return a+b;
	}

	

}
