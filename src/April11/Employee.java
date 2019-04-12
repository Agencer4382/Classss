package April11;

public class Employee {
	int salary;
	int eID;
	public static String CEO="Sumair";

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.eID =1;
		obj.salary=100;
		
		Employee obj1 = new Employee();
		obj1.eID =2;
		obj1.salary=200;
		
	obj.getEmployee();
	obj1.getEmployee();

	}
	void getEmployee() {
		System.out.println("Employee id "+eID+" employee salary "+salary+" and ceo "+CEO);
	}
	

}
