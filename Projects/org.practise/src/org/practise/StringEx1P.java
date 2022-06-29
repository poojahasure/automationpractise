package org.practise;

public class StringEx1P {

	public static void main(String[] args) {
		 
		   
		     String s="sjdh21kdjj2mdnn1";
		     int sum=0,num=0;
		     
		     for(int i=0;i<s.length();i++) {
		    	 
		    	 char c=s.charAt(i);
		    	 
		    	 if(Character.isDigit(c)) { //2
		    		 
		    		 int digit=Integer.parseInt(String.valueOf(c));
		    		 num=num*10+digit;//21  2  1
		    		 
		    		   if(i==s.length()-1) {
		    			   sum=sum+num; //23+1 24 
		    		   }
		    		 
		    	 }
		    	 else {
		    		 sum=sum+num;//21 23
		    		 num=0;
		    	 }
		     }
		     System.out.println(sum);
			
		
		

	}



}
