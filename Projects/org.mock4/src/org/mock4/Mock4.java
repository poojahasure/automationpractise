package org.mock4;

public class Mock4 {
	
	public static void main(String args[]) {
		int n=2022;
		
		if(n%100==0) {
			if(n%400==0) {
				System.out.println(n +"=leap year");
			}else {
				System.out.println(n +"=not a leap year");
			}
		}else if(n%4==0) {
			System.out.println(n +"=leap year");
		}else {
			System.out.println(n +"=not a leap year");
		}
	}
	

}
