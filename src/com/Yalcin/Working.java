package com.Yalcin;

public class Working {

	public static void main(String[] args) {
		Working obj= new Working();
		obj.evenOdd(25);
		obj.isPrime(20);
		obj.isFibanocci(0,1, 0);
		obj.isPalindrome("Radar");
		
	}
        public void evenOdd(int num) {
        	if(num%2==0) {
        		System.out.println(num+" is even number.");
        	}else {
        		System.out.println(num+" is odd number.");
        	}
        }
        public void isPrime(int num) {
        	boolean isPrime=true;
        	for(int i=2; i<10; i++) {
        		if(num%i==0) {
        			isPrime=false;
        			break;
        		}
        		
        	}
        	if(isPrime) {
        		System.out.println(num+" is prime number.");
        		
        	}else {
        		System.out.println(num+" is not prime number.");
        	}
        }
        public void isFibanocci(int a, int b, int c) {
        	System.out.print(a+" + "+b+" + ");
        	for(int i=0; i<10; i++) {
        		
        		c=a+b;
        		a=b;
        		b=c;
        		System.out.print(c+" + ");
        	}
        }
        public void isPalindrome(String str) {
        	String rev="";
        	for(int i=str.length()-1; i>=0;i--) {
        		rev+=str.charAt(i);
        	}
        		if(str.equalsIgnoreCase(rev)) {
        			System.out.println("\n"+str+" is palindrome.");	
        		}else {
        			System.out.println("\n"+str+" is not palindrome.");
        	
        		
        	}
        }
		
		}
		
	



