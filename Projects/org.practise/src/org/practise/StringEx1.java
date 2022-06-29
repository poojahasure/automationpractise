package org.practise;

public class StringEx1 {
	
	public static void main(String [] args){
 
    String s="jsck2kjc7djsj90";
    int sum=0,num=0;
    for(int i=0;i<s.length();i++) {
    	char c=s.charAt(i);
    	if(Character.isDigit(c)) {
    		
    		int digit=Integer.parseInt(String.valueOf(c));
    		num=num*10+digit;
    		 if(i==s.length()-1) {
    			 sum=sum+num; 
    		 }
    	}else {
    		sum=sum+num;
    		num=0;
    	}
    	
    	
    }
    System.out.println(sum);
}
}