package org.collection;
import java.util.*;
public class ConvertListToArray {
	
	  public static void main(String args[]) {
	      // Creating and initializing ArrayList
	      ArrayList<String> fruits = new ArrayList<>();
	      fruits.add("Apple");
	      fruits.add("Banana");
	      fruits.add("Mango");
	      fruits.add("Pear");

	      // 1.ArrayList to String array conversion
	      
	      String[] str = new String[fruits.size()];
	      for(int i=0; i < fruits.size(); i++) {
	          str[i] = fruits.get(i);
	      }
	      
	      //2. ArrayList to String array conversion using toArray()
	      String str1[]=fruits.toArray(new String[fruits.size()]);
	      
	      // Print elements using for-each loop
	      for(String s : str) {
	        System.out.println(s);      
	      }
	    }

}
