package constructor;

public class ConstructorExample {

	
	public ConstructorExample() {
	System.out.println("Constructor Created");	
	}
	public ConstructorExample(String name) {
		System.out.println("My name is "+name);
	}
	public ConstructorExample(String name,int hour) {
		System.out.println("My name is "+name + " total hour is "+hour);
	}
	
}

