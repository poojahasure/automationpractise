package staticandnonstatic;

// static data =1. static variable ----------static method
// 				2.static method

public class StaticDataFromStaticMethod {

	static int a=156;// static variable;
	
	public static void main(String args []) {
		
		StaticDataFromStaticMethod obj =new StaticDataFromStaticMethod();
		
		// calling static variable by  3 ways
		
		System.out.println(obj.a);// through obj
		System.out.println(a);
		System.out.println(StaticDataFromStaticMethod.a);
		
		//calling static method by3 ways
		
	     obj.test() ;//1
	     test();//2
	     StaticDataFromStaticMethod.test();//3
	     
		
		
		
		
	}
	
	// static method
	public static void test() {
		
		System.out.println(10);
		
	}
}
