package com.Yalcin;

import java.util.ArrayList;

public class ArrayListW {
	public static void main(String[] args) {
		ArrayList<Integer>names= new ArrayList<>();
		for(int i=0; i<=5; i++) {
			names.add(i);
			names.add(i);
			
		}
		for(Object object:names) {
			System.out.print(object+" ,");
		}
	}
}
