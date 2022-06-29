package org.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1{
	public static void main(String [] args) {
		ArrayList<String> obj1=new ArrayList<String>();// declaration
		ArrayList<Integer> obj2=new ArrayList<Integer>();
		ArrayList<Float> obj3=new ArrayList<Float>();
		ArrayList<Double> obj4=new ArrayList<Double>();
		ArrayList<Character> obj5=new ArrayList<Character>();
		ArrayList<Boolean> obj6=new ArrayList<Boolean>();
		//string
		obj1.add("Pune");
		obj1.add("Mumbai");
		obj1.add("Delhi");
		//Integer
		obj2.add(12);//considered object of integer class
		Integer j=10;
		
		obj2.add(j);
		obj2.add(13);
		obj2.add(9);
		//char
		obj5.add('x');
		obj5.add('d');
		obj5.add('w');
		obj5.add('f');
		//float
		obj3.add(12.0f);
		obj3.add(1.0f);
		obj3.add(13.0f);
		obj3.add(90.0f);
		//boolean
		obj6.add(true);
		obj6.add(false);
		
		for(int i=0;i<obj2.size();i++) {     //iterate through arraylist
		System.out.println(obj2.get(i));
	}
	}
}
