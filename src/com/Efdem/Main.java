package com.Efdem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	static String makeString(String s1, String s2) {
		String temp="";
		for(int i=0; i<s1.length(); i++) {
			temp=temp+s1.charAt(i)+s2.charAt(i);
			
		}
		return temp;
		
	}
	public static void main(String []args) {
		
		//System.out.println(Main.makeString("kale", "123456"));
		
		Company mercedes = new Company("Mercedes Benz", 10000000);
		Company renault = new Company("Renault Mais", 100000);
		
		Map<String, Company> sirketListesi = new HashMap<>();
		sirketListesi.put("US132567", renault);
		sirketListesi.put("US132567", mercedes);

		Company cmp1 = sirketListesi.get("US132567");
		System.out.println(cmp1.getName());
		
		System.out.println("==========");
		List<Company> companyList = new ArrayList<>();
		companyList.add(mercedes);
		companyList.add(renault);
		companyList.add(mercedes);
		for(Company comp:companyList) {
			System.out.println(comp.getName());
		}
		
		System.out.println("==========");
		Set<Company> companySet = new HashSet<>();
		companySet.add(mercedes);
		companySet.add(renault);
		companySet.add(mercedes);
		for(Company comp:companySet) {
			System.out.println(comp.getName());
		}
		

		
	}
}
	
	