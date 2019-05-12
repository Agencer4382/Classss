package com.Yalcin;

import java.util.ArrayList;

public class ArrayListMethodsStatic {

	public static ArrayList<String>nameList(){
		ArrayList<String>names=new ArrayList<>();
		names.add("Shiva");
		names.add("Asel");
		names.add("Kevin");
		return names;
		
	}
	public static void main(String[] args) {
		ArrayList<String>ary=nameList();
		System.out.println(ary);
	}

}
