	package com.May2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Task3 {

	public static void main(String[] args) {
		HashSet<String>set=new HashSet<>();
		set.add("New York");
		set.add("Dallas");
		set.add("Atlanta");
		
		System.out.println(set.size());
		set.add("Dallas");
		set.add("Atlanta");
		System.out.println("Set size after dupllicate : "+set.size());
		
		for(String city: set) {
			System.out.println(city);
		}
		
		Iterator<String>it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		ArrayList<String>list=new ArrayList<>(set);
		Collections.sort(list);
		System.out.println(list);
		
		
		
	}

}
