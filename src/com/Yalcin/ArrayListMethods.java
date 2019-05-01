package com.Yalcin;

import java.util.ArrayList;

public class ArrayListMethods {
public ArrayList<String>nameList(){
	ArrayList<String>names=new ArrayList<>();
	
	names.add("Shiva");
	names.add("Sandish");
	names.add("Asel");
	return names;
	
	
	
		
	}

	public static void main(String[] args) {
		ArrayListMethods obj= new ArrayListMethods();
		ArrayList<String>names=obj.nameList();
		System.out.println(names);
	

	}

}
