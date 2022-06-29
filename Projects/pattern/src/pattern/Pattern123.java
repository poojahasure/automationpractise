package pattern;

public class Pattern123 {
	
	public static void main(String args[]) {
	
		Pattern123.pattern();
	
		
	}
	public static void pattern() {
	
		for(int n=1;n<=3;n++) {
		for(int i=1;i<=3;i++) {
			for(int j=i;j<=i;j++) {
				System.out.println(i+""+j);
		}
		}System.out.println();
		
	}
	}
}
