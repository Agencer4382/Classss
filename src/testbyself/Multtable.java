package testbyself;

import java.util.Scanner;

public class Multtable {

	public static void main(String[] args) {
	
		Scanner kevin=new Scanner(System.in);
		
		int num=1;
		
		System.out.println("enter num: ");
		num=kevin.nextInt();
		
		for(int x=1; x<=num; x++) {
			
			System.out.println(num+" - "+x+" = "+(num-x));
		}
				
	
	}

	}


