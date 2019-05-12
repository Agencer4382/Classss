package com.May5;
import java.util.*;
public class MapReview {

	public static void main(String[] args) {
		Map<String,Integer>groceryMap=new LinkedHashMap<>();
		groceryMap.put("Milk", 1);
		groceryMap.put("Bread", 2);
		groceryMap.put("Eggs", 12);
		groceryMap.put("Coffe", 2);
		groceryMap.put("Patato", 2);
		groceryMap.put("Cookies", 3);
		
		groceryMap.put("Cheese", 1);
		System.out.println(groceryMap.size());
		groceryMap.replace("Eggs", 18);
		System.out.println(groceryMap);
		groceryMap.remove("Cheese");
		
		//retrieving all key+value using keySet();
		Set<String>keySet=groceryMap.keySet();
		for(String key:keySet) {
			System.out.println("Key is "+key+" and vluaes is "+groceryMap.get(key));
			
		}
		Iterator<String>keyIt=keySet.iterator();
		while(keyIt.hasNext()) {
			String key=keyIt.next();
			System.out.println(key+" : "+groceryMap.get(key));
		}
	//retrieving all values using keySet;
		
		for(Integer value:groceryMap.values()) {
			System.out.println(value);
		}
		Iterator<Integer>valueIt=groceryMap.values().iterator();
		while(valueIt.hasNext()) {
			System.out.println(valueIt.next());
		}
		//retrieving all values using entrySet;
		for (Map.Entry<String, Integer>entry:groceryMap.entrySet()) {
			System.out.println(entry.getKey()+"=="+entry.getValue());
		}
		//map-->using entrySet-->any collection has iterator method-->Iterator
		Iterator<Map.Entry<String, Integer>>it=groceryMap.entrySet().iterator();
	     while(it.hasNext()) {
	    	 Map.Entry entry=it.next();
	    	 String valueFromMap=entry.getKey()+" and value is"+entry.getValue();
	    	 System.out.println(valueFromMap);
	    	 
	     }
	}

}
