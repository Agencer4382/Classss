package com.May11;

public class ChildParentException {

	public static void main(String[] args) {
		int[]ary= {17,99,8};
		try {
			Thread.sleep(2000);
		System.out.println(ary[3]);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
			
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("Code after an exception");
		Exception e1=new ArrayIndexOutOfBoundsException();

	}

}
