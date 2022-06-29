package org.practise;

public class Throws {
	
	public static void main(String [] args) {
		Throws  obj=new Throws();
		obj.printStudentdetails("Pri", 12);
	}

	public void printStudentdetails(String name,int age) throws ArithmeticException {
		
		if(age<18) {
		throw new ArithmeticException("invalid age");
//			System.out.println("invalid");
		}else {
			System.out.println(name);
			System.out.println(age);
		}
		System.out.println("program ends");
	}
}
