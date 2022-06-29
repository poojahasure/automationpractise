package org.tryCatch;

public class TryCatchEx2 {
	public static void main(String [] args) {
		int ans=0;
		//try-catch 1
		try {
			ans=10/0;;
		}catch(ArithmeticException e) {
		e.printStackTrace();
//			System.out.println(e.getMessage());

	     }
		//try-catch 2
		try {
			 String s="Pune";
			 System.out.println(s.charAt(4));
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();

	    }
	
		//try-catch 3
	    try {
		int [] a= {12,1,3};
		 System.out.println(a[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
					e.printStackTrace();

			    }
}
}