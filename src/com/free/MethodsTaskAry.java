package com.free;

public class MethodsTaskAry {

	public static void main(String[] args) {
		MethodsTaskAry num= new MethodsTaskAry();
		int []ary= {50,25,100,-55,-8,0};	
		num.maxAndMin(ary);
		
	}
	public void maxAndMin(int []ary) {
		int max=Integer.MIN_VALUE;
		int max2=0;
		int min=Integer.MAX_VALUE;
		int min2=0;
		
		for(int i=0; i<ary.length; i++) {
			if(ary[i]>max) {
				max2=max;
				max=ary[i];
				
			}else if(ary[i]>max2&&ary[i]!=max) {
				max2=ary[i];
			}
			if(ary[i]<min) {
				min2=min;
				min=ary[i];
				
			}else if (ary[i]<min2&&ary[i]!=min) {
				min2=ary[i];
				
			}
		}
		System.out.println(max);
		System.out.println(max2);
		System.out.println(min);
		System.out.println(min2);
	}
	
	
}
