package method;

public class MethodWithParameter {
	public static void main(String args[]) {
		MethodWithParameter obj = new MethodWithParameter();
		int b=23;
		obj.print();
		obj.print1(b);
		
	}

	public void print() {
		System.out.println("10");//without using parameter direct print
	}
	
	public void print1(int a) {
		System.out.println(a); // with parameters
	}
}
