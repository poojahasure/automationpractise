package conditionalstatement;

public class NestedIf2 {
	
	public static void main(String args[]) {
		NestedIf2 obj =new NestedIf2();
		obj.method();
		
	}
	
	public void method() {
		int num=34;
		if(num>0) {
			if(num<30) {
				if(num%2==0) {
					System.out.println("number is even");
				}else {
					System.out.println("odd");
				}
				
			}	else {
				System.out.println("number is greater than 30");
			}
			}
			
		else {
			System.out.println("number is less than 0 ");
		}
		}
	}
	


