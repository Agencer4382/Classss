package com.May4;
import java.util.*;

public class TaskCountries {

	public static void main(String[] args) {
		Map<String,String>map=new HashMap<>();
		map.put("USA", "DC");
		map.put("ITALY", "ROMA");
		map.put("TURKEY", "ISTANBUL");
		
		System.out.println(map);
		Set<String>keys=map.keySet();
		
		for(String key: keys) {
			System.out.println(key+" : "+map.get(key));
		
		}
		Collection<String>valCon=map.values();
		for(String value:valCon) {
			System.out.print(value+", ");
		
	}
		System.out.println();
		Iterator<String>it=keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
