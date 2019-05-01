package com.InterAbs;


public class Animal {
	public static void main(String[] args) {
		AnimalBehavior obj= new AnimalBehavior();
		obj.petData(new Dog());
		obj.playData(new Dog());
		obj.spaekData(new Dog());
		obj.petData(new Cat());
		obj.playData(new Cat());
		obj.spaekData(new Cat());
		
	}

}
class AnimalBehavior{
	public void petData(IData data) {
		data.pet();
	}
	public void playData(IData data) {
		data.play();
	}
	public void spaekData(IData data) {
		data.speak();
	}
}
