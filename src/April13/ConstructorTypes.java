package April13;

public class ConstructorTypes {
	
	ConstructorTypes(){
		System.out.println("I am a constructor with parameters");
	}
	ConstructorTypes(String str){//str is local variable 
		System.out.println("I am a constructor with 1 parameters "+str);
	}
	ConstructorTypes(int a, String str){
		System.out.println("I am a constructor with 2 parameters "+a+" and "+str);
	}
	
	public static void main(String[] args) {
		ConstructorTypes obj=new ConstructorTypes();
		ConstructorTypes obj1=new ConstructorTypes("String");
		ConstructorTypes obj2=new ConstructorTypes(123,"String");
		
	}

}
