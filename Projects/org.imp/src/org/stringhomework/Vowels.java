package org.stringhomework;

public class Vowels {
     public static void main(String [] args) {
    	 String s="Welcome to acceleration";
    	 
    	 int count =0;
    	 for(int i=0;i<s.length();i++) {
    		 
   		 char c=s.charAt(i);
    	 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
    		 count=count +1;
    		
    	 }
    	
    	}
    	 System.out.println("no of vowels = "+count);
     }
}
