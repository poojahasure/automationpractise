package staticandnonstatic2;
// Static data  1 static variable 2. static method

public class StaticDataFromStaticMethod {
	static int a=172;//static global var
	
	public static void main(String args []) {
		StaticDataFromStaticMethod obj = new StaticDataFromStaticMethod();
		
		// calling static variable
		System.out.println(obj.a); // way 1 by obj
		System.out.println(a);     // way 2 by var
		System.out.println(StaticDataFromStaticMethod.a); // way  3 by classname
		
		// calling static method
		obj.test();
		test();
		StaticDataFromStaticMethod.test();//ideal way 
		}
//static method
	public static void test() {
		
		System.out.println(120);
		
		
	}
}
