package conditionalstatement;

public class IfElseLadder {
	
 public static void main(String args[]) {
	 IfElseLadder obj =new IfElseLadder();
	 obj.method(72 );
 }
 // if else is ladder using method
 public int method(int marks) {
	 
	 if(marks>=85) {
		 System.out.println("distinction");
	 }
	 else if(marks>=70) {
		 System.out.println("first class");
	 }
	 else if(marks>=60) {
		 System.out.println("second class");
	 }
	 else if(marks>=50) {
		 System.out.println("pass class");
	 }
	 else {
		 System.out.println("fail");
	 }
	 return marks;
 }
	 
	 
 
 
}
