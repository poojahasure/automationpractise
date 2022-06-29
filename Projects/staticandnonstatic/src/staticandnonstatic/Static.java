package staticandnonstatic;

public class Static {
	int ns=10; // non static global variable
	 static int s=12; // static global variable

  	public static void main(String args[]){

	Static obj1= new Static();
	Static obj2= new Static();
	
	obj1.ns =100;
	obj1.s=200;

	System.out.println(obj1.ns);
	System.out.println(obj2.ns);
	
        System.out.println(obj1.s);
	System.out.println(obj2.s);
	System.out.println(Static.s);  	}
}
