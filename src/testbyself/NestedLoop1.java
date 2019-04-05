package testbyself;

public class NestedLoop1 {

	public static void main(String[] args) {

		int num=1;
		
		while(num<=5) {
			System.out.println("outer loop itr: "+num);
			
			for(int x=1; x<=3; x++) {
				System.out.println("num = "+num+" ; x = "+x);
			}
			num++;
		}

	}

}
