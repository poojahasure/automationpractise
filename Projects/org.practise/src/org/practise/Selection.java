package org.practise;

public class Selection {
	
	public static void main(String [] args) {
	int[]arr= {20,31,-2,50,75,32};
	
	System.out.println("Before sorting array");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	// 
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
	}
	
	System.out.println("after sorting array");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}

}
