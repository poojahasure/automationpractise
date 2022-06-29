package globalvariable;

public class GlobalVar {
	byte b=2;
	short s=4;
	int i=12;
	long l=243;
	float f =243.0f;
	double d=234;
	char c='n';
	boolean bo;
	
	public static void main(String args[]) {
		GlobalVar obj = new GlobalVar();
		
		float sum =obj.i +obj.f;// sum using global variable
		double mul = obj.s *obj.d;//mul using global variable
		int sub = obj.i - obj.s;//subtraction using global variable
		float div= obj.f/obj.l;// division using global variable
		System.out.println(sum);
		System.out.println(mul);
		System.out.println(sub);
		System.out.println(div);
//		System.out.println(obj.b);
//		System.out.println(obj.s);
//		System.out.println(obj.i);
//		System.out.println(obj.l);
//		System.out.println(obj.f);
//		System.out.println(obj.d);
//		System.out.println(obj.c);
//		System.out.println(obj.bo);
		
	}

}
