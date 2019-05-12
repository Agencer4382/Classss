package com.May4;

import java.util.*;

public class MapIntro {

	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<>();
		map.put(101, "John");
		map.put(102, "Jane");
		map.put(103, "Kate");
		map.put(104, "James");
		//retrieve or access
		System.out.println(map.get(102));
		System.out.println(map.get("John"));
		System.out.println(map.size());
		//how to update value
		map.replace(104, "Bilal");
		System.out.println(map.get(103));
		//how to remove
		map.remove(103);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map);
		//to check is specific key/val in the map
		System.out.println(map.containsKey(102));
		System.out.println(map.containsValue("Kate"));
		
		map.put(105, "James");
		System.out.println(map);
		map.put(101, "Shaban");
		System.out.println(map);
		//adding null key with some value
		map.put(null, "Some value");
		System.out.println(map);
		//adding null key with null value
		map.put(null, null);
		System.out.println(map);

	}

}
