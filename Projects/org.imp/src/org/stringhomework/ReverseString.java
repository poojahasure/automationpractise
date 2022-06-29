package org.stringhomework;

public class ReverseString {
	public static void main(String args[]) {
		String s="good morning have a nice day";
		
		String []s1=s.split(" ");
		
		
		for(int i=1;i<=s1.length;i++) {
			
			System.out.print(s1[s1.length-i]+" ");
		}
	}

}
