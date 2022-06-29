package org.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {
	public static void main(String [] args) {
	
	ArrayList<String> obj1=new ArrayList<String>();
	obj1.add("Pune");
	obj1.add("Mumbai");
	obj1.add("Delhi");
	

	ArrayList<String> obj2 =new  ArrayList<String>();
	obj2.add("hi");
	obj2.add("Hello");
	obj2.add("bye");
	obj2.add("Pune");
	
//	System.out.println(obj2);
	
//	obj1.addAll(obj2);
//	System.out.println(obj1);
	obj1.retainAll(obj2);// common elements
//	
	System.out.println(obj2);
//	
//	
//	obj2.clear();//delete all elements present in arraylist
//	
//	System.out.println(obj2);
	System.out.println(Collections.disjoint(obj1, obj2));
	
}
}