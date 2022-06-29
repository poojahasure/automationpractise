package org.string;
//1.==
//2..equals 
public class StringEx1 {
   public static void main(String args[]) {
	   String str1="Pune";// string literal
	   String str2="Mumbai";//
	   String str3=new String("Pune");//by new keyword
	   String str4=new String("Pune");
	   String str5="Mumbai";
	   
	   
	   System.out.println(str1==str2);//memory check
	   System.out.println(str1.equals(str2));//values check
	   
	   System.out.println(str3==str4);
	   System.out.println(str3.equals(str4));
	   
	   System.out.println(str1==str2);
	   System.out.println(str1.equals(str2));
   }
}
