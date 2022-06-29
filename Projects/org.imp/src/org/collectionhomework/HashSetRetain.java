package org.collectionhomework;

import java.util.HashSet;

public class HashSetRetain {

	public static void main(String[] args) {
		 // Creating an empty HashSet
        HashSet<String> set = new HashSet<String>();
		// Use add() method to add elements into the Set
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Delhi");
        
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Welcome");
        set1.add("To");
        set1.add("Pune");
        set1.add("Geeks");
        set.retainAll(set1);
        System.out.println(set);
	}

}
