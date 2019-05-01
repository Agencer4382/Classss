package com.April25;

public interface IBank {
	static String name="Bank";//by default allveriables inside the are public static final 
	//by default comlpier adds public& abstract to every methods
	void hasChecking();
	void hasSaving();
	void hasCreditCard();
	//static void hasLoan(); can not have static abstract methods 
	
}
class BOA implements IBank{
	@Override
	public void hasChecking() {
	System.out.println("BOA has 2 checking account");
	}
	@Override
	public void hasSaving() {
		System.out.println("BOA has 2 saving account");
	}
	@Override
	public void hasCreditCard() {
	System.out.println("BOA has 10 different cc");
	}
}
class PNC implements IBank{

	@Override
	public void hasChecking() {
	System.out.println("PNC has 3 checking account");
	}

	@Override
	public void hasSaving() {
		System.out.println("PNC has 3 saving account");	
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 7 different cc");	
	}
	
}
