package com.May5;

import java.util.*;
import java.util.Map.Entry;

public class MapFromArray {

	public static void main(String[] args) {
		String[] names = { "Mehmet", "Asha", "Amina", "Omar", "Siyar" };
        Map<Integer, String> nameMap = new LinkedHashMap<>();
		int key = 1;
		for (String name : names) {
			nameMap.put(key, name);
			key++;
		}
		System.out.println(nameMap);
		
		// print key and value using entrySet(loop&&Iterartor)
		for (Entry<Integer, String> ary : nameMap.entrySet()) {
			System.out.println(ary);
		}
		System.out.println("-----------IT-------");
		Iterator<Entry<Integer, String>> it = nameMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
