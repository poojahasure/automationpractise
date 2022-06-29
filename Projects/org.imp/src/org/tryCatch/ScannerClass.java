package org.tryCatch;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Program Starts");
		try {
			
			String s=scn.nextLine();
			System.out.println("Provided string value is="+s);
		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		finally{
			scn.close();
			System.out.println("Finally block executed");
		}
		System.out.println("Program ends");
	}

}
