package com.April6;

public class NestedLoop1 {

	public static void main(String[] args) {
		NestedLoop1 num=new NestedLoop1();
		num.callnum(0);
		
	}
	void callnum(int num) {
		for(int row=1; row<=7; row++) {
			for(int col=1; col<=7; col++) {
				
				System.out.print(row);
			}
		
			System.out.println();
		}
		
	}
}
		

	


