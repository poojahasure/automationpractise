package org.array;

public class OddArray {
	public static void main(String[]args ) {
		
		int[] arr= {12,33,45,66,71,5,7};
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
			
			
		}
	}

}
