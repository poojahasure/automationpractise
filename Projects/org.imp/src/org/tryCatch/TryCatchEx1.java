package org.tryCatch;

public class TryCatchEx1 {
	
	public void div(int a,int b) {
		
		int ans=0;
		try {
			ans=10/0;
		}catch(ArithmeticException e) {
		e.printStackTrace();
//			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String [] args) {
		TryCatchEx1 obj =new TryCatchEx1();
		obj.div(10,0);
		System.out.println("Program ends");
	}

}
