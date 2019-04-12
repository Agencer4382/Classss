package April11;

public class LocalVariables {

	public static void main(String[] args) {
		
		String name="Jhon";
		System.out.println(name);
		LocalVariables obj=new LocalVariables();
		obj.hello(name);
		System.out.println(name);
		
	}
	public void hello(String name) {
		System.out.println("Hello "+name);
	}

}
