package org.imp;

public class PrimeNo {
	public static void main(String args[]) {
		int num=13;
		int temp=0;
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				temp=temp+1;
			}
			
		}
		if(temp==0) {
			System.out.println(num+" is a prime no");
		}else {
			System.out.println(num+" is not a prime no");
		}
	}

}
