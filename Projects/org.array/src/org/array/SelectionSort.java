package org.array;

public class SelectionSort {
     public static void main(String [] args) {
    	 
    	 int[]arr= {80,50,-90,00,70};
    	 
    	 System.out.println("Before sort");
    	
    	 for(int i=0;i<arr.length;i++) {
    		 System.out.print(arr[i]+ " ");
    		// System.out.print(" ");
    	 }
    	 
    	 for(int i=0;i<arr.length;i++) {  // arr[0]= 80
    		 for(int j=i+1;j<arr.length;j++) { // 50
    			 
    			 if(arr[i]>arr[j]) {  // 80 >50
    				 
    				 int temp=arr[i];
    				 arr[i]=arr[j];
    				 arr[j]=temp;
    			 }
    		 }
    	
    	 }
    	 System.out.println();
    	 System.out.println("after sort");
    	 for(int i=0;i<arr.length;i++) {
    		 System.out.print(arr[i]+ " ");
    	 }
     }
}
