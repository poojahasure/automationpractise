package switchcase;

public class SwitchCaseEx2 {
	
	public static void main(String args[]) {
		SwitchCaseEx2 obj =new SwitchCaseEx2();
		obj.method();
		
		
	}
	public void method() {
		char ch='t';
		
		switch(ch) {
		
		case 'a':System.out.println("Hello");
				break;
		case 'b':System.out.println("hello");
				
		
		default: System.out.println("Bye");
		}
	}

}
