package pattern;

public class Pattern {
	public static void main (String [] args) {
		Pattern.test();	
		
	}
	public static void test() {
		//int n=4;
		for(int i=1;i<=10;i++){ 
		for(int k=10;k>=i;k--) {
			System.out.print("");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
	}

}
