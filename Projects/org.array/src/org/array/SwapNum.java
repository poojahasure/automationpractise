package org.array;

public class SwapNum {
	 public static void main(String [] args) {
		 
		 //1-D array  arr[0]=3 arr[1]=2
		 int arr[]= {4,5};// decal + int
		
		 
	//	 int arr[]=new int[2];//decal
	//	 arr[0]=3;
	//	 arr[1]=2;
		
		 
		 int temp;
		  
		 System.out.println("Before swap= "+ arr[0]+" "+arr[1]);
	
		 temp=arr[0];
		 arr[0]=arr[1];
		 arr[1]=temp;
		 
		 System.out.println("After swap= "+ arr[0]+" "+arr[1]);
		 
		 
	 }

}
