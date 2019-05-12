package com.May2;

public abstract class Insurance {
	String insuranceName;
	public Insurance(String insuranceName) {
		this.insuranceName=insuranceName;
	}
	public abstract void getQuote();
	public abstract void cancelInsurance();

}
class Car extends Insurance{
	public String carModel;
	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel=carModel;
		}
	@Override
	public void getQuote() {
		System.out.println(carModel+" coverage with "+insuranceName+" quote : $200.");
	}
   @Override
	public void cancelInsurance() {
		System.out.println("Cancelation "+insuranceName+" for "+carModel);
	}
	
}
class Pet extends Insurance{
	public String petType;
	public Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType=petType;
	}

	@Override
	public void getQuote() {
		System.out.println(petType+" coverage with "+insuranceName+" quote : $500.");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancelation "+insuranceName+" for "+petType);
		
	}
	
}
class Health extends Insurance{
	public String healthIns;
	public Health(String insuranceName,String healthIns) {
		super(insuranceName);
		this.healthIns=healthIns;
		
	}

	@Override
	public void getQuote() {
		System.out.println(healthIns+" coverage with "+ insuranceName+" qoute : $6000");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancelation "+insuranceName+" for "+healthIns+" coverage.");
	}
	
}