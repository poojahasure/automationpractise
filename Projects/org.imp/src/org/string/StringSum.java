package org.string;

public class StringSum {
	
		public static void main(String Args[]){
		String s="kjskjdu324sjkjf45";
		int sum=0;
		for(int i=0;i<s.length();i++){

		char c=s.charAt(i);
		if(Character.isDigit(c)){
		sum=sum+Integer.parseInt(String.valueOf(c));

		}
		}
		System.out.println("sum="+sum);


		}
		}	


