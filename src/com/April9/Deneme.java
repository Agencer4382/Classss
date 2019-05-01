package com.April9;

public class Deneme {
	
	void arrayMaxAndMin(int []ary) {
		int max=Integer.MIN_VALUE;
		int max2=0;
		int min=Integer.MAX_VALUE;
		int min2=0;
		
		for (int i=0; i<ary.length; i++) {
			if (ary[i]>max) {
				max2=max;
				max=ary[i];
				
			}else if (ary[i]>max2&&ary[i]!=max) {
				max2=ary[i];
				
			}
			if (ary[i]<min) {
				min2=min;
				min=ary[i];
				
			}else if(ary[i]<min2&&ary[i]!=min) {
				min2=ary[i];
			}
		}
		
		System.out.println(max);
		System.out.println(max2);
		System.out.println(min);
		System.out.println(min2);
		
	}
	
	

	public static void main(String[] args) {
		Deneme obj= new Deneme();
		int []ary1= {102,255,899,-100};
	    obj.arrayMaxAndMin(ary1);
		int []ary2= {555,205,4,-99,-411};
		obj.arrayMaxAndMin(ary2);
	}

}
