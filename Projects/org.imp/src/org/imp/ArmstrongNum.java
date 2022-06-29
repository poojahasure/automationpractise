package org.imp;

public class ArmstrongNum {
	public static void main(String args[]) {
		int x=407;
		ArmstrongNum.test(x);
		// armstrong =153, 370, 371, 407, 1634, 8208, 9474, 54748
		
		if(x==ArmstrongNum.test(x)) {
			System.out.println(x+"  is an armstrong no");
		}else {
			System.out.println(x+"  is not an armstrong no");
		}
		
	}
	
	public static int test(int n) {
		
		int rem;
		int temp=0;
		while(n>0) {
			
			rem=n%10;
			temp=temp+rem*rem*rem;
			n=n/10;
			
		}
		return temp;
	}

}
