package org.stringhomework;

public class StringPalindrome {
	public static void main(String []args) {
	String s="cbc";
	String s1="";
	
	for(int i=1;i<=s.length();i++) {
//		char c=s.charAt(s.length()-i);
//		
//      s1=s1+(String.valueOf(c));
		s1=s1+s.charAt(s.length()-i);
    }
	
	if(s.equals(s1)) {
     	  System.out.println("Palindrome");
    }else {
  	  System.out.println("Not palindrome");
    }
}
	
}
