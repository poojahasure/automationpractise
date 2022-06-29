package org.practise;


public class BubblePrac {
    public static void main(String [] args) {
   	 
   	 int[]arr= {80,50,-90,00,70};
   	 
   	 System.out.println("Before sort");
   	
   	 for(int i=0;i<arr.length;i++) {
   		 System.out.print(arr[i]+ " ");
   		
   	 }
   	 
   	 for(int i=0;i<arr.length-1;i++) {  // arr[0]= 80
   		 for(int j=0;j<arr.length-1-i;j++) { // 50
   			 
   			 if(arr[j]>arr[j+1]) {  // 80 >50
   				 
   				 int temp=arr[j];
   				 arr[j]=arr[j+1];
   				 arr[j+1]=temp;
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
