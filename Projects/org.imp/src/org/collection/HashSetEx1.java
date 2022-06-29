package org.collection;

import java.util.HashSet;

public class HashSetEx1 {
	public static void main(String [] args) {
		HashSet<Object> H =new HashSet<Object>();
		H.add(null);
		H.add(10);
		H.add("pune");
		H.add(20);
		H.add(20);
		H.add(null);
		H.add(null);
		
		System.out.println(H);
		H.remove(20);
		System.out.println(H);
	}

}
