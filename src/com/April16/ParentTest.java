package com.April16;

public class ParentTest {

	public static void main(String[] args) {
		String a;
		a = "10";// local

		double d = 12;
System.out.println("----------parent---------");
		Parent par = new Parent();
		par.love();
		par.work();
		par.cry();

//achieving run time ploymor.
		System.out.println("----------Child1---------");
		Parent par1 = new Child1();
		par1.work();
		par1.love();// common method
		
		
		System.out.println("----------Child2---------");
		Parent par2 = new Child2();
		par2.work();
		par2.love();
		par2.cry();
		if(par2 instanceof Child2) {
			((Child2)par2).prinParentCount();
		}
		

	}

}
