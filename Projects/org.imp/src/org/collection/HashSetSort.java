package org.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

//Sorting is not present in HashSet so we  need to convert it into ArrayList or TreeSet
public class HashSetSort {
	public static void main(String args[]) {
		HashSet<String> H=new  HashSet<String>();
		 H.add("pune");
		 H.add("mumbai");
		 H.add("gad");
		 H.add("kop");
//		 H.add(null);
		  
		 System.out.println(H);
		 
		//1.convert into ArrayList
		 
		 ArrayList<String> obj =new   ArrayList<String>(H);
		 Collections.sort(obj);
		 System.out.println(obj);
		 
		 //2.convert it into TreeSet
		 
		 TreeSet<String> obj1 =new   TreeSet<String>(H);
		 System.out.println("TreeSet="+obj1);

}
}