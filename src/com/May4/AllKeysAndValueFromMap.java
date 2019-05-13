package com.May4;
import java.util.*;
public class AllKeysAndValueFromMap {
public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "AA");
		map.put(3, "B");
		map.put(4, "C");
		map.put(5, "D");
		
		
	System.out.println(map);
	//returns a SET of keys from the map
	System.out.println("--------each loop-------------");
	Set<Integer>keys=map.keySet();
	for(Integer key: keys) {
		System.out.println(key+" : "+map.get(key));
	}
	System.out.println();
	System.out.println("------iterator----");
	Iterator<Integer>keysIt=keys.iterator();
	while(keysIt.hasNext()) {
		Integer key=keysIt.next();
		System.out.println(key+" : "+map.get(key));
	}
	Collection<String>valCol=map.values();
	System.out.println();
	System.out.println("------------each loop---------");
	for(String value:valCol) {
		System.out.print(value+", ");
		}
	System.out.println();
	System.out.println("------iterator----");
	Iterator<Integer>itValues=keys.iterator();
	while(itValues.hasNext()) {
		System.out.print(itValues.next()+", ");
	}
	
	}

}
