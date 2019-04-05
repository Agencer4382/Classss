package com.free;

import java.util.Scanner;

public class OmerTaskkk {

	public static void main(String[] args) {
		
		
				Scanner reader = new Scanner(System.in);
				System.out.print("What size x would you like (an odd number)? ");
				int size = reader.nextInt();
				int count=0, counter=0;
				int outlineSpaces = 0;
				int begin=0;
				int insideSpaces=size-2;
				while(count<(size+1)/2) 
				{
					counter=0;
					while(counter<outlineSpaces) {
						System.out.print(" ");
						counter++;
					}
					outlineSpaces++;
					if(counter!=(size-1)/2)
						System.out.print("*");

					begin=0;
					while(begin<insideSpaces) {
						System.out.print(" ");
						begin++;
					}
					insideSpaces-=2;

					count++;
					System.out.print("*\n");
				}
				
				outlineSpaces=outlineSpaces-2;
				insideSpaces=1;	
				count=0;
				while(count<(size-1)/2) 
				{
					counter=0;
					while(counter<outlineSpaces) {
						System.out.print(" ");
						counter++;
					}
					outlineSpaces--;
					if(counter!=(size-1)/2)
						System.out.print("*");

					begin=0;
					while(begin<insideSpaces) {
						System.out.print(" ");
						begin++;
					}
					insideSpaces+=2;

					count++;
					System.out.println("*");
				}
			
		
		
		
		

	}

}
