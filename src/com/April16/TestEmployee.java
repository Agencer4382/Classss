package com.April16;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee fte = new FullTimeEmp();
		Employee con = new Contractor();

		emp.getPaid();// Employee gets paid
		fte.getPaid();// Full time emp. gets paid salary + bonus
		con.getPaid();//Contractor gets paid hourly

	}

}
