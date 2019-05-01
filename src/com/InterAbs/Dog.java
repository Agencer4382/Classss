package com.InterAbs;

public class Dog implements IData{

	@Override
	public void play() {
		System.out.println("Dog play with the human");
		
	}

	@Override
	public void pet() {
		System.out.println("Dog use for pet");
		
	}

	@Override
	public void speak() {
		System.out.println("Dog can not talk");
		
	}

	@Override
	public void ability() {
		System.out.println("Dog use for security");
		
	}

}
