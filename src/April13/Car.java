package April13;

public class Car {
	public static String make = "Toyota";
	String color;//declaring instance variable
	String model;
	int doors;
	boolean engine;

//	Car() {//constructor----constructor name must be same class name---no parameters
//		System.out.println("I am a constructor");
//		System.out.println("Hello from constructor");
//	}

	// public= Access modifier
	// static =non Access modifier
	// Strin[]args...parameters
	// new =keyword creates an object
	// car()=constructor

	public static void main(String[] args) {
		Car obj = new Car();
		System.out.println(obj.color);
		System.out.println(obj.doors);
		System.out.println(obj.engine);
		hello();

	}
	public static void hello() {
		//before using local variable we have to initialize it 
		String name;
		//System.out.println(name);-----will give you error
		System.out.println("I am a satatic helo method");
	}

}
