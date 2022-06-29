package org.string;

public class SubString {
	public static void main (String args[]) {
   	 String s="there is a garDEN";
   	 String [] s1=s.split(" ");
   	 String ans1="";

   	 for(int i=0;i<s1.length;i++) {
   		 String firstletter=s1[i].substring(0,1).toUpperCase();
   		 
   		 
   		 String remainingpart=s1[i].substring(1,s1[i].length()).toLowerCase();
   		  String ans= firstletter+ remainingpart;
   		 ans1=ans1+" "+ans;
   	 }
   	 System.out.println(ans1);

}
}