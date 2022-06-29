package org.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx1 {
//HashMap is in key-value pair
	public static void main(String[] args) {
		
		HashMap<Object,Object> obj =new HashMap<Object,Object>();
		
		obj.put("name","Pooja");
		obj.put("Rollno",12);
		obj.put("Rollno",32);
		obj.put("city","kop");
		
		obj.put(null,null);
		obj.put(null,"nullkey");
		obj.put("nullkey",null);
		
		System.out.println(obj);
		
		Set<Object> s= obj.keySet();
		
		for(Object i:s) {
			System.out.println(i);
		}
		
		Collection<Object> c= obj.values();
		
		for(Object i:c) {
			System.out.println(i);
		}
//		for(Object j: obj) {
//			System.out.println();
//		}
	}

}
