package com.May4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySet {

	public static void main(String[] args) {
		Map<String,Integer> calssroomMap=new LinkedHashMap<>();
		calssroomMap.put("Table", 20);
		calssroomMap.put("Chair", 60);
		calssroomMap.put("Screen", 3);
		
		System.out.println(calssroomMap);
		for(Map.Entry<String, Integer> entry:calssroomMap.entrySet()) {
			System.out.println(entry);
		}
		Iterator<Map.Entry<String, Integer>>it=calssroomMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer>me=it.next();
			System.out.println(me.getKey()+" = "+me.getValue());
		}
	}

}
