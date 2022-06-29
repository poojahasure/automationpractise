package org.tryCatch;

public class TryCatchEx3 {
	public static void main(String [] args) {
		int ans=0;
		
		try {
			ans=10/0;
			 String s="Pune";
			 System.out.println(s.charAt(4));
			 int [] a= {12,1,3};
			 System.out.println(a[4]);
		}catch(ArithmeticException e) {
		    e.printStackTrace();
        }
        catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();

	    }
		catch(ArrayIndexOutOfBoundsException e) {
					e.printStackTrace();

		}
		System.out.println("Program ends");
      }

}
