package forloopex;

public class LeapYear {
	
	public static void main(String args[]) {
		
		int year=1900;// Leap year=2000, 2004, 2008, 2012, 2016, 2020,
		              //2024, 2028, 2032, 2036, 2040, 2044, and 2048.
		
		if((year%4==0)&&(year%100==0)&&(year%400==0)) {
			
		System.out.println(year+" is Leap year");	
		}
		else {
			System.out.println(year+" is not a leap year");
		}
		
	}
	

}
