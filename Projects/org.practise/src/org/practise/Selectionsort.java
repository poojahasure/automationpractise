package org.practise;

public class Selectionsort {
	
	public static void main(String args []) {
		
		int arr[]= {3,8,34,2,80,-2};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print( arr[i]+" ");
		}
		
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print( arr[i]+" ");
		}
		
	}

}
