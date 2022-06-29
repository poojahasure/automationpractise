package org.stringhomework;

public class CountE {
	
	public static void main(String args[]) {
         String s="let us fly the kite";
    	 
    	 int count =0;
    	 for(int i=0;i<s.length();i++) {
    		 
   		 char c=s.charAt(i);
    	 if(c=='e') {
    		 count=count +1;
    		
    	 }
    	
    	}
    	 System.out.println(count);
    	
     }
	}


