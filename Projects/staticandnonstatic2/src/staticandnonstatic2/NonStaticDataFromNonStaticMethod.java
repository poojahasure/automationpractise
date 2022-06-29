package staticandnonstatic2;

public class NonStaticDataFromNonStaticMethod {
	int b= 12;// nonstatic global var
	
	public static void main (String args[]) {
		NonStaticDataFromNonStaticMethod obj1 = new NonStaticDataFromNonStaticMethod();
		obj1.test();
		obj1.method();
	}
	
	// non static method
	public void test() {
			NonStaticDataFomStaticMethod obj1 =new  NonStaticDataFomStaticMethod();
		// calling non static var
		System.out.println(obj1.b);
		System.out.println(b);
	    System.out.println(this.b);
		
	    // calling nonstatic method
	    obj1.test3();
	//	method();// way 2
		//this.method();
		}
	
	public void test3() {
		System.out.println("calling nonstatic method");
		
	}
	

}
