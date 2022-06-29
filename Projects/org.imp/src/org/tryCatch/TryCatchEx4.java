package org.tryCatch;

public class TryCatchEx4 {
	public static void main(String [] args) {
		
		TryCatchEx4 obj= new TryCatchEx4();
	
	int ans=0;
	try {
		ans=10/5;
		System.out.println(ans);
		obj.test();
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	}
    public void test() {
    	String s="Pune";
    	System.out.println(s.charAt(5));
}
}