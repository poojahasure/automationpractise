package org.imp;

public class ReverseNum {
	
	public static void main(String args[]) {
		
     
     int n=1234;
     System.out.println(ReverseNum.method(n));	
     System.out.println(ReverseNum.method(1002));	
	}
	
	public static int method(int n) {
		int rev=0;
		int rem;
		
		while(n>=0) {
			rem=n%10;// to get remainder value 1234%10=4  123%10=3   12%10=2   1%10=1
			rev=(rev*10)+rem;// 0+4=4     4*10 +3 =43    43*10+2=432    432*10 +1= 4321
			n=n/10;  // to get quotient value  1234/10=123.4=123  123/10=12.3=12  12/10=1   1/10=0
			
		}
		
		return rev;
	}

}
