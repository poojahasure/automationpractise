package org.practise;

class SingleT{
	private int a=10;
	private static SingleT obj= new SingleT();
	
	public static SingleT getObj() {
		return obj;
	}
	
	private SingleT() {}
	public int getA() {
		return a;
	}
	 public void display() {
		 System.out.println("Child");
	 }
}
class Dusra{

	
	 public void display() {
		 System.out.println("Child");
	 }
}

public class SingleTon {
    public static void main(String[]args) {
   
    	SingleT obj=SingleT.getObj();
    	obj.display();
 
    }
}
