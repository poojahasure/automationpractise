package org.string;

public class StringDigitSum {
	public static void main(String Args[]){
		String s="1j2k3h3";//i= 0 1 2 3
		int sum=0,num=0;

		for(int i=0;i<s.length();i++) {

			char c=s.charAt(i);//2
			
          if(Character.isDigit(c)) {

				int digit=Integer.parseInt(String.valueOf(c));

				num=num*10+digit;//0*10+2=2  2*10+0=20 20*10+2=202
//				System.out.println(num);

				if(i==s.length()-1) {
					sum=sum+num;
				}
			}else {
				sum=sum+num;
				num=0;

			}
}		
		System.out.println("sum="+sum);
}
}