package com.taskerd;

public class Quiz2 {

	public static void main(String[] args) {
		int[] array = { 1, 4, 3, 6, 8, 2, 5};
		int what = array[0];

		// scan the array
		for ( int index=0; index < array.length; index++ )
		{ 
		if ( array[ index ] > what ) 
		what = array[ index ]; 
		}
		System.out.println( what );
		
		//--------------------------------->>9
		int array_variable[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};
		int sum = 0;
		for (int i = 0; i < 3; ++i)
		for (int j = 0; j < 3 ; ++j)
		sum = sum + array_variable[i][j];
		System.out.println(sum / 5);
		
//------------------------------->>>iiiiiiiii
		
		//---------------------------->>>>1
		int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n = 6;
		n = arr[arr[n] / 2];
		System.out.println(arr[n] / 2.0);
		
	//---------------------------------->>>>2,4,6,8,10
		int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

		for ( int index= 0 ; index < 5 ; index++ )
		System.out.print( egArray[ index ] + " " );
		
		
	}

}
