package com.April27;

public interface Shape {
	
	void calculeArea(double radius);
	void calculatePerimiter(double perimeter);
	
}
class Circle implements Shape {
	double radius;

		@Override
	public void calculeArea(double radius) {
		this.radius=radius;
		double area=(radius*radius)*3.14;
		
		System.out.println("Circle area is : "+area);
		
	}

	@Override
	public void calculatePerimiter(double radius) {
		this.radius=radius;
		double perimeter=2*(3.14*radius);
		System.out.println("Circle perimiter : "+perimeter);
		
	}
	
}
class Square implements Shape{
	double side;
	@Override
	public void calculeArea(double side) {
		
		this.side=side;
		double area=side*side;
		System.out.println("Square area is : "+area);
		
	}

	@Override
	public void calculatePerimiter(double side) {
		this.side=side;
		double perimeter=4*side;
		System.out.println("Square perimeter is : "+perimeter);
		
		
	}
	
}
