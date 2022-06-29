package org.practise;

public class Bubble {
	public static void main(String [] args) {
		
		int[]arr= {20,31,-2,50,75,32};
		
		System.out.println("Before sorting array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		// 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		
		System.out.println("after sorting array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
