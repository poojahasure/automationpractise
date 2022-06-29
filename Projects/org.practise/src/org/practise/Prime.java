package org.practise;

public class Prime {
	public static void main(String [] args) {
		int num=31;
		for(int i=2;i<num/2;i++) {
			if(num%i!=0) {
				System.out.println(num+" is prime no");
				break;
			}
		}
		
	}

}
