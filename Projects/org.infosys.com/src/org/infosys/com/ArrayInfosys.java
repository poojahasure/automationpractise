package org.infosys.com;


	import java.util.Arrays;
	public class ArrayInfosys {
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
	        int[][] numArray= {{1,1}, {2,4}, {3,6,9},{4,16}};
	        System.out.println(numArray[1][0]);
	        System.out.println(numArray[1]);
	        System.out.println(Arrays.toString(numArray[1]));
	        
	        numArray[1][1]=8;
	        
	        for (int i=0; i<numArray.length;i++) {
	            for (int j=0;j<numArray[i].length;j++) {
	                System.out.println(numArray[i][j]);
	                
	            }
	        }
	
	        System.out.println("for each loop*****");
	        
	        for (int[] num:numArray) {
	            for (int element:num) {
	                System.out.println(element);
	                
	            }
	        }
	        
	        for(int i=0;i<numArray.length;i++) {
	            System.out.println(Arrays.toString(numArray[i]));
	        }
	        
	        
	    }
	}


