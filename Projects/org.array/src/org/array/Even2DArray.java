package org.array;

public class Even2DArray {

	public static void main(String args[]) {
		
		int[][] arr= {{12,23,44},{33,44,55},{88,66,77}};
		
		
		System.out.println("Below are even no of 2d array");
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				
				if((arr[i][j])%2==0) {
					
					System.out.println(arr[i][j]);
				} 
			}
		}
		
	}
}
