package com.April16;

public class ParentTest {

	public static void main(String[] args) {
		String a;
		a = "10";

		double d = 12;

		Parent par = new Parent();
		par.love();
		par.work();

		Parent par1 = new Child();
		par1.work();
		par1.love();
		par1.work();
		

	}

}
