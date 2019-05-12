package com.May5;
import java.util.*;
import java.util.HashMap;

public class Tas2Salary {

	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<>();
		map.put("John", 70000);
		map.put("James", 90000);
		map.put("Frank", 40000);
		map.put("Jordan", 60000);
		
		int maxSalary=Integer.MIN_VALUE;
		String key=null;
		
	for	(Map.Entry<String, Integer>entry:map.entrySet()) {
		if(entry.getValue()>maxSalary){
			maxSalary=entry.getValue();
			key=entry.getKey();
			
		}
		
	}
	System.out.println(maxSalary+" belongs to "+key);
				
		
		
	}

}
