package org.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class MultiHashMap {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(20);
		ar1.add(10);
		
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		ar2.add(40);
		ar2.add(50);
		ar2.add(80);
		ar2.add(30);
		
		ArrayList<Integer> ar3=new ArrayList<Integer>();
		ar3.add(100);
		ar3.add(10);
		ar3.add(90);
		
		
		HashMap<Integer,ArrayList<Integer>> obj =new HashMap<Integer,ArrayList<Integer>>();
	    obj.put(1,ar1);
	    obj.put(2,ar2);
	    obj.put(3,ar3);
	    for(int i=0;i<obj.size();i++) {
			for(int j=0;j<obj.get(i).size();j++) {
				
				System.out.println(obj.get(i).get(j));
				
			}
		}
	    
	}
	
	

}
