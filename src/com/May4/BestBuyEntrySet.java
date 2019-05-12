package com.May4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BestBuyEntrySet {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(109363, "TV");
		map.put(109367, "NoteBook");
		map.put(109369, "Scanner");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}
		System.out.println("----------Iterator----------");
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> list = it.next();
			System.out.println(list.getKey() + " : " + list.getValue());

		}
		

	}

}
