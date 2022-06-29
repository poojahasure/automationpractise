package org.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	
	public static void main(String args[]) {
		
		LinkedHashSet<Integer> hs =new LinkedHashSet<Integer>();
		hs.add(null);
		hs.add(null);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		hs.add(10);
		
		System.out.println(hs);
		System.out.println(hs.contains(20));
		System.out.println(hs.isEmpty());
//		hs.remove(10);
		System.out.println(hs);
//		hs.clear();
		System.out.println(hs.size());
	}

}
