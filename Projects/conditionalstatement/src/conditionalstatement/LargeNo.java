package conditionalstatement;

public class LargeNo {
	
	public static void main(String [] args) {
		
		int a=20,b=10;
//		while(a>b) {
//			System.out.println("a is large no");
//		}
//		System.out.println("b is large no");
		
		int large=a>b?a:b;
		System.out.println(large);
		
	}

}
