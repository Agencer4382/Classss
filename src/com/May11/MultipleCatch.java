package com.May11;

public class MultipleCatch {

	public static void main(String[] args) {
		System.out.println("Begining of code");
		try {
			
			Thread.sleep(2000);
			System.out.println(10/0);
			
		}catch (ArithmeticException e) {
			//3 ways to print name and details of an exception
			//e.printStackTrace();//name E.,detail of E., location
           // System.out.println(e);//name of the E and details
			System.out.println(e.getMessage());//details of an E
		System.out.println("Code of Arithmetic Exception catch ");	
		}catch(InterruptedException e) {
			System.out.println("Code of Interrupted Exception catch ");
			
		}
		System.out.println("End of the code");
	}

}
