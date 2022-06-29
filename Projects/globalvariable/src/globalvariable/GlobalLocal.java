package globalvariable;

public class GlobalLocal {
	int g=10;
	public static void main(String args[]) {
		int l=21;
		
		GlobalLocal obj = new GlobalLocal();
		int sum= l+obj.g;
		System.out.println(sum);
		
		
	}

}
