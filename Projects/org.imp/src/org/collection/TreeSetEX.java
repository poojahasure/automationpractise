package org.collection;

import java.util.Iterator;
import java.util.TreeSet;
//Added elements are automatically sorted in TreeSet
public class TreeSetEX {
	
	public static void main(String []args) {
		TreeSet<Object> obj =new TreeSet<Object>();
		
//		obj.add(null);// It gives NullPointerException.we cannot compare null values
		obj.add(3);
		obj.add(10);
		obj.add(5);
		obj.add(20);
		System.out.println(obj);
//		System.out.println(obj.contains(30));
//		System.out.println(obj.remove(20));
//		System.out.println(obj.isEmpty());
//		System.out.println(obj.size());//size of TreeSet=no of elements
//		
//		//After clear 
//		obj.clear();
//        System.out.println(obj);
//        
//      
		Iterator<Object> itr = obj.iterator();
		
		while(itr.hasNext()) {
			if() {
				
			}
		}
	}

}
