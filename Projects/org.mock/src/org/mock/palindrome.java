package org.mock;


public class palindrome {
	
	public static void main(String args[]) {
		int n=1231;
		int reverse=palindrome.method(n);	
		if(n==reverse) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
		
		
	}
	public static int method(int n){
		
	
	int rev=0,rem;
	
	while(n>0) {
		rem=n%10;
		rev=(rev*10)+rem;
		n=n/10;
	}
	return rev;
	}
	
	
	

}
