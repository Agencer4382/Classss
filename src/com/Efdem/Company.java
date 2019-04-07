package com.Efdem;

public class Company {
	private int capital;
	private int incomeTtl;
	private int expenseTtl;
	private String name;
	public int age;
	
	Company(String str,int amount ){
		name=str;
		capital=amount;
	}
	
	public void setName(String str) {
		name=str;
	}
	public String getName() {
		return name;
	}
	public int getIncomeTtl() {
		return incomeTtl;
	}
	
	public void setCapital(int amount ) {
		capital =amount*110/100;
	}
	public void sell(int amount ) {
		incomeTtl+=amount;
		
	}
	public void invest(int amount) {
		incomeTtl+=amount-1000;
	}
	public void buy (int amount) {
		expenseTtl+=amount;
	}
	public int getCapital() {
		int net=incomeTtl-expenseTtl;
		int tax=net*20/100;
		int actual=net-tax;
		return capital+actual;
	}
	

}
