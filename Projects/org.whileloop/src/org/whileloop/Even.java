package org.whileloop;

public class Even {
	public static void main(String args[]) {
		
		int i=50;
		while(i<=70) {
//			if(i%2==0) {
				
				System.out.println("even no is "+ i);
//			}
			i++;
			
		}
		 int j=50;
		while(j<=70) {
			
			if(j%2!=0) {
				System.out.println("odd no is "+ j);
			}
			j++;
		}
		int k=50;
		while((k<=70) & (i%2==0)) {
			System.out.println("even is " + k);
			k++;
		}
	}

}
