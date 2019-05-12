package com.May4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOverview {

	public static void main(String[] args) {
	Set<String>classDay=new HashSet<>();
	classDay.add("Tuesday");
	classDay.add("Wednesday");
	classDay.add("Thursday");
	classDay.add("Saturday");
	classDay.add("Sunday");
	System.out.println(classDay);
	
	for(String days:classDay) {
		System.out.println(days);
	}
	System.out.println("--------iterator-------");
	Iterator<String>it=classDay.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	}

}
