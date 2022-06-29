package org.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayEx2 {
		public static void main(String [] args) {
		ArrayList<String> obj =new  ArrayList<String>();//declaration
		obj.add("Pune");// add method 
		obj.add("Mumbai");
		obj.add("Pune");
		
//		obj.add(null);
//		obj.add(null);
		obj.add(1,"Pooja");//adding value at specific index
//		obj.set(4,10); 
		
//		System.out.println("*****Methods***");
//		System.out.println(obj.indexOf("Pune"));//1st occ
//		System.out.println(obj.lastIndexOf("Pune"));
		System.out.println(obj.size());//length
//		System.out.println(obj.isEmpty());
//		System.out.println(obj.remove(6));
//		Collections.sort(obj);
		System.out.println("**************");

		System.out.println("*********arraylist***");
		
		for(int i=0;i<obj.size();i++) {     //iterate through arraylist
		System.out.println(obj.get(i));  //get method
		}
//		
//		System.out.println("*************");
//		System.out.println(obj.size());
//		
//		ArrayList<String> obj1 =new  ArrayList<String>();
//		obj1.add("hi");
//		obj1.add("Hello");
//		obj1.add("bye");
//		obj1.add("sky");
//		obj1.add("hiffw");
//		
//		Collections.sort(obj1);
//		Collections.sort(obj1,Collections.reverseOrder());
//		
//		Collections.copy(obj1,obj);
//		
//		System.out.println(obj.contains("Chennai"));
//		System.out.println(obj.containsAll(obj1));
//	
//		System.out.println(obj.removeAll(obj1));

		System.out.println("*********Updated arraylist***");
//		
		for(int i=0;i<obj.size();i++) {     //iterate through arraylist
		System.out.println(obj.get(i));  //get method
	}
		
		System.out.println("*************");
		}
}
