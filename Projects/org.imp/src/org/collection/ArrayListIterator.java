package org.collection;

import java.util.ArrayList;
import java.util.ListIterator;

//.hasNext()
//.next()
//.remove()
//.hasPrevious
//.previous()
public class ArrayListIterator {
	
	public static void main(String args[]) {
		 ArrayList<String> obj =new   ArrayList<String>();
		 obj.add("pune");
		 obj.add("mumbai");
		 obj.add("gad");
		 obj.add("kop");
		  
//		 System.out.println(obj);
//		 obj.remove("gad");// string or index
//		 System.out.println(obj); 
//		 
		 //by using iterator
		 ListIterator<String> itr =obj.listIterator();
//		 
		 System.out.println(itr.next());
//		 System.out.println(itr.next());
//		 System.out.println(itr.next());
		 System.out.println(itr.previous());
		 
		 //by using for each loop
//		
//		 for(Object i:obj) {
//			 System.out.println(i);
//		 }
		 
	}

}
