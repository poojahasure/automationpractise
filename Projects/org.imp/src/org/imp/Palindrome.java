package org.imp;

// 121=121
public class Palindrome {
	public static void main(String args[]) {
		
		int n=353;
		int reverse=Palindrome.num(353);
		System.out.println(reverse);
	    System.out.println("reverse value is = "+ Palindrome.num(n));
		
	    if(n==reverse) {
			System.out.println("It is a Palindrome no");
		}else {
			System.out.println("not a palindrome no");
		}
	
	}
	public static int num(int a) {
		int rev=0;
		int rem;
		 while(a>0) {
			 
			 rem=a%10;
			 rev=(rev*10)+rem;
			 a=a/10;
		 }
		 return rev;
	}

}
