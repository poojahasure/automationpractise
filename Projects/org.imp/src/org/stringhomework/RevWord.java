package org.stringhomework;

public class RevWord {
	public static void main(String args []) {
		
		String s="Helloi";//"1234"
		
		for(int i=1;i<=s.length();i++) {
			
			System.out.print(s.charAt(s.length()-i));//5-1=4 5-2 =3
		}
	}

}
// s.charAt(0)