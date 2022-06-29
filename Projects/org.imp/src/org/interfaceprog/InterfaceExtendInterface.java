package org.interfaceprog;

interface InterParent3 {
	public static final int a=1;
	public int add(int a,int b);
//	public int sub(int c,int d);
	public static void test4 () {
		System.out.println("Static method");
	}
	default  void test1() {
		System.out.println("Default");
	}
}
public interface InterfaceExtendInterface extends InterParent3{
	

}
