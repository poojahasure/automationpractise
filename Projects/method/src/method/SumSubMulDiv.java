package method;

public class SumSubMulDiv {
	public static void main(String args[]) {
		int a=10,b=2;
		SumSubMulDiv obj = new SumSubMulDiv();
		
		System.out.println("sum of two nos  ="+obj.sum(10,2));
		System.out.println("sub of two nos  ="+obj.sub(10,2));
		System.out.println("mul of two nos  ="+obj.mul(10,2));
		System.out.println("div of two nos  ="+obj.div(10,5));
		
		
	}
	public  int sum(int x ,int y) {
		int sum1=x+y;
		return sum1;
	}
	
	public  int sub(int c ,int d) {
		int sub1=c-d;
		return sub1;
	}
	
	public  int mul(int e ,int f) {
		int mul1=e*f;
		return mul1;
	}
	
	public  int div(int g ,int h) {
		int div1=g/h;
		return div1;
	}
}
