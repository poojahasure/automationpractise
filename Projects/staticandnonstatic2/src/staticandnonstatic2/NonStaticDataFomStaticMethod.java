package staticandnonstatic2;

// non static data  1. variable  2 . method

public class NonStaticDataFomStaticMethod {
	
	int b=23; // non Static global var
	
	public static void main (String args[]) {
		
		NonStaticDataFomStaticMethod obj = new NonStaticDataFomStaticMethod();
		
		System.out.println(obj.b);// calling non static var
		
		obj.test2(); // obj.methodname= method call
		
		}
	  //nonstatic method ---------access specifier returntype methodname(){}
	public void test2() {
		
		System.out.println("method call");
	}

}
