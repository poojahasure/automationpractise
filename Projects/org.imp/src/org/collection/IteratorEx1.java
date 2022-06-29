package org.collection;
// Iterator is an interface

import java.util.HashSet;
import java.util.Iterator;

//.hasNext() --> check  t or f
//.next(); -->returns next object
//remove(); --> removes object where iterator is pointing

public class IteratorEx1 {
	public static void main(String [] args) {
		HashSet<Object> H =new HashSet<Object>();
//		H.add(null);
		H.add(10);
		H.add("pune");
		H.add(20);
		H.add(20);
//		H.add(null);
//		H.add(null);
//	 System.out.println(H);
//	
	 Iterator<Object> itr =H.iterator();
//		
		while(itr.hasNext()) {
			if(itr.next().equals(20)) {
				itr.remove();
			}
		}
	System.out.println(H);
	

//	 for(Object i:H) {
//		 System.out.println(i);
//	 }
}
}