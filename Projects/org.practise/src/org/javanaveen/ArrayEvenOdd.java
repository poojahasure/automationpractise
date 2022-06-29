package org.javanaveen;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int cnt=0,cnto=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				cnt+=1;
			}else {
				cnto++;
			}
		}
		System.out.println("even numbers " + cnt);
		System.out.println("odd numbers " + cnto);

	}

}
