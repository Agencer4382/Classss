package com.Yalcin;

import java.util.ArrayList;

public class ArrayListMethd {
	public ArrayList<String>nameList(){
		ArrayList<String>list=new ArrayList<>();
		list.add("Kevin");
		list.add("Collin");
		return list;
	}
	public static void main(String[] args) {
		ArrayListMethd obj= new ArrayListMethd();
		ArrayList<String>list=obj.nameList();
		System.out.println(list);
	}
	

}
