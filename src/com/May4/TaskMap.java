package com.May4;

import java.util.HashMap;
import java.util.Map;

public class TaskMap {

	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<>();
		map.put(1, "Google");
		map.put(2, "Syntax");
		map.put(3, "Btach");
		map.put(4, "Firefox");
		map.put(5, "Chrome");
		map.put(6, "Explorer");
		map.put(7, "Youtube");
		System.out.println(map.size());
		map.replace(4, "Twitter");
		System.out.println(map);
		map.remove(7);
		System.out.println(map);
		
		

	}

}
