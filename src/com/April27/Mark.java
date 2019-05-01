package com.April27;

public abstract class Mark {
	int math;
	int esl;
	int science;
	int history;

	Mark(int math, int esl, int science) {
		this.esl = esl;
		this.science = science;
		this.math = math;

	}

	Mark(int math, int esl, int science, int history) {
		this.esl = esl;
		this.science = science;
		this.math = math;
		this.history = history;

	}

	abstract void getPercentage();

}

class A extends Mark {

	A(int math, int esl, int science) {
		super(math, esl, science);

	}

	@Override
	void getPercentage() {
		System.out.println("A average of the mark is : " + (math + esl + science) / 3);

	}

}

class B extends Mark {

	B(int math, int esl, int science, int history) {
		super(math, esl, science, history);
		
	}

	@Override
	void getPercentage() {
		System.out.println("B average of the mark is : " + (math + esl + science + history) / 4);

	}

}
