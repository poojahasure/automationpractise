package conditionalstatement;

public class IfElseEx {
	
	public static void main(String args[]) {
	//	int a=10,b=29,c=12;
	//	IfElseEx obj = new IfElseEx();
		//obj.method();
		IfElseEx.method();
	}
	
	public static void method( ) {
		int x=130,y=42,z=71;
		
		if(x>y && x>z ) {
			System.out.println(x+" is greater no");
		
		}else if(y>x && y>z) {
			
			System.out.println(y+" is greater no");
		}else  {
			System.out.println(z+" is greater no");
		}
		
		
		// AND=&&  true && true= true      OR ||    true || true = true
		
		//		true && false = false				false || true = true
		//       false && true =false				true || false =true
		//       false && false =false				false ||false =false
	}

}
