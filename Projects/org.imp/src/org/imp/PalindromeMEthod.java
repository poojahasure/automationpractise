package org.imp;

public class PalindromeMEthod {
	public static void main(String args[]) {
		
		int n=121,rem,rev=0;
		int temp=n;
		
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(n==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
