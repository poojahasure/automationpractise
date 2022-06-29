package org.array;
// a=5 b=10       a  b  temp      temp=a
//				     10				a=b
//		 		 10	  5            b=temp
//
public class SwapArray {

	public static void main(String args[]) {
		
		int []arr= {7,3};// arr[0]  arr[1]
		int temp;
	     
			
			if(arr[0]>arr[1]) {
				temp=arr[1];
				arr[1]=arr[0];
				arr[0]=temp;
			}
			System.out.println("{"+arr[0]+" "+arr[1]+"}");
		}
			
		}
	

