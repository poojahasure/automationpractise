package org.interfaceprog;

interface Interf1{
	public void test(int a,int b);
	public void test1();
		
	
}
public class multipleinheritance implements Interf1 {
	public void test() {
		System.out.println("test");
	}
	public void test1() {
		System.out.println("test1");
	}
	
	public static void main(String args[]) {
		multipleinheritance obj =new multipleinheritance();
		obj.test();
		obj.test1();
	}
	@Override
	public void test(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	
	

}
