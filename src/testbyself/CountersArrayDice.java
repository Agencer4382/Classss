package testbyself;
import java.util.Random;
public class CountersArrayDice {

	public static void main(String[] args) {
		
		Random kevin= new Random();
		int freq[]=new int [7];
		
		for(int roll=1; roll<100; roll++) {
		++freq[1+kevin.nextInt(6)];
		
			
		}
		System.out.println("Face\tFrequency");
		for(int face=1; face<freq.length; face++) {
			System.out.println(face+"\t"+freq[face]);
			
		}

	}

}
