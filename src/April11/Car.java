package April11;

public class Car {
	
	public String color;//null
	public static int totalCars;//0

	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.color="white";
		totalCars++;
		
		Car car2=new Car();
		car2.color="balck";
		totalCars++;
		
		System.out.println("Total car we made is "+totalCars);
		

	}

}
