package method;

public class LeapYear {
   public static void main(String args[]) {
	   
	   LeapYear obj =new LeapYear();
	   obj.method();
   }
   public void method() {
	   int year= 1900;
	   if((year%4==0)&&(year%400==0)&&(year%100==0)) {
		   
		   System.out.println(year+ " is a leap year");
	   }
	   else {
		   System.out.println(year+ "is not a leap year");
	   }
   }
}
