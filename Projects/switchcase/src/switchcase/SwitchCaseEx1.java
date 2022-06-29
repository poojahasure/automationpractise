package switchcase;

public class SwitchCaseEx1 {
	
	public static void main (String args[]) {
		SwitchCaseEx1 obj = new SwitchCaseEx1();
		obj.method();
	}
	
	public void method() {
		int month=6;
		
		switch(month) {
		
		case 1:System.out.println("jan");
		case 2:System.out.println("feb");
		case 3:System.out.println("march");
				break;
		case 4:System.out.println("april");
				break;
		case 5:System.out.println("may");
				break;
		default:System.out.println("program end");		
		}
		
	}
			
}
