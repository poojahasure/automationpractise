package org.oops;

class Test{
	
	private  int a=90;

	public int getA() {
		return a;
	}

	public void setA(int a) {// update
	     this.a=a;
	}

}


public class EncapEx1 {
	public static void main (String []args) {
		
		Test obj= new Test();
		
		System.out.println(obj.getA());// 90
		obj.setA(1000);
     	System.out.println(obj.getA());//50


		
	}

}
