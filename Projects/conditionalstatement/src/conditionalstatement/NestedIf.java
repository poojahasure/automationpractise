package conditionalstatement;

public class NestedIf {
	
	public static void main(String args[]) {
		int marks=35;
		if(marks>=40) {
			if(marks>50) {
				if(marks>70) {
					if(marks>85) {
						
						System.out.println("Distinction");
					}
					
					else {
						System.out.println("1st class");
					}
		          }
					else {
						System.out.println("2nd class");
					}
			      }
					else {
						System.out.println("fail");
					}
		        }
				
	
	}
}		
				
