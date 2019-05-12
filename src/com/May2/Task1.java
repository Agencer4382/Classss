package com.May2;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
	

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("Kevin");
		list.add("Colin");
		list.add("John");
		System.out.println("Before sorting "+list);
		Collections.sort(list);
		System.out.println("After sorting "+list);
		
	}

}
