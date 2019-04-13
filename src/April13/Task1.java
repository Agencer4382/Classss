package April13;

public class Task1 {
	public static String company="Ford";
	
	public String employeeName;
	public int employeeAge;

	public Task1(int age, String name) {
		employeeName = name;
		employeeAge = age;

	}
	public void getEmployee() {
		String details="Company name "+company+" employee name "+employeeName+" employee age "+employeeAge;
		System.out.println(details);
		
	}

}
