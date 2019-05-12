package com.May5;
import java.util.*;

public class CollectionRecap {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("Jva");
		list.add("is");
		list.add("fun");
		
		System.out.println(list);
		System.out.println(list.get(2));
		
		Set<String>set=new HashSet<>();
		set.add("Jva");
		set.add("is");
		set.add("fun");
		set.add("logic");
		
		
		Set<String>set1=new LinkedHashSet<>();
		set1.add("Jva");
		set1.add("is");
		set1.add("fun");
		set1.add("logic");
		set1.add("and cool");
		
		
		Set<String>set2=new TreeSet<>();
		set2.add("Jva");
		set2.add("is");
		set2.add("fun");
		set2.add("logic");
		set2.add("and cool");
		set2.add("also magic");
		
		
		Map<Integer,String>map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(null, "C");
		map.put(5, null);
		System.out.println(map);
		
	}
	

}
