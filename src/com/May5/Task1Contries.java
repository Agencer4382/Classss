package com.May5;
import java.util.*;
import java.util.Map.Entry;

public class Task1Contries {

	public static void main(String[] args) {
		String[] countries= {"Baku","Paris","Moscow","Canberra"};
		Map<String, Integer>map=new LinkedHashMap<>();
		
		for(String city:countries) {
			map.put(city, city.length());
			
		}
		System.out.println(map);
		
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry=it.next();
			if(entry.getKey().length()>=7) {
				it.remove();
			}

		}
		System.out.println(map);
		
	}
	
	
	

}
