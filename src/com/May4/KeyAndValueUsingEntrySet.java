package com.May4;

import java.util.*;

public class KeyAndValueUsingEntrySet {

	public static void main(String[] args) {
		Map<String, String> userDetailsMap = new HashMap<>();
		userDetailsMap.put("Name", "Alex Smith");
		userDetailsMap.put("Salary", "90000");
		userDetailsMap.put("Department", "IT");
		userDetailsMap.put("Title", "Automation Tester");

		System.out.println(userDetailsMap);
		userDetailsMap.entrySet();// returns a set of entries
		for (Map.Entry entry : userDetailsMap.entrySet()) {
		System.out.println(entry.getKey() + " : " + entry.getValue());
			//System.out.println(entry);
		}
		System.out.println("----------Using Iterator");
		Iterator<Map.Entry<String,String>>it=userDetailsMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry=it.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
