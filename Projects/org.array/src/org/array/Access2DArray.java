package org.array;

public class Access2DArray {
	public static void main(String [] args) {
		int[][]arr1=new int[4][4];// declaration  int a    a=10
		
		// arr[0][1]=12
		
		//     c0  c1 c2 c3
		// r0  12  23 44 2
       //  r1  33  44 55 3
		// r2  88  66 77 5
		// r3  1   2  3  4
		
		int[][] arr2= {{12,23,44,2},{33,44,55,3},{88,66,77,5}};// declaration + initialization
		
		for(int i=0;i<arr2.length;i++) {//row=3  0 1 2
			
			for(int j=0;j<=arr2.length;j++) {//col=4 0 1 2 3
				
				
				System.out.print(arr2[i][j]+"  ");//arr[0][0]
			}
			
			System.out.println();
		}
		//System.out.println(arr[2][0]);
	}

}
