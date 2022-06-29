package callclasstoclass;

public class Class1 {
static Class1 obj1= new Class1(); 
static Class2 obj2=new Class2();
	public static void main(String args[]) {
	//	Class1 obj= new Class1();
//	Class1.obj1.add();
	Class1.obj2.method2();
	System.out.println("Program ends here");
	//	obj.mul();
	//	obj.sub();
		
	}
	
	public void add() {
		int a=20,b=10;
		int add1=a+b;
		System.out.println(add1);
	//	Class1 obj= new Class1();
		obj1.mul();
		
	}
	
    public void mul() {
    	int a=20,b=10;
    	int mul1=a*b;
		System.out.println(mul1);
	//	Class1 obj= new Class1();
		obj1.sub();
    	
    }
    
    public void sub() {
    	int a=20,b=10;
    	int sub1=a-b;
		System.out.println(sub1);
    	
    }
    
}
