package constructor;

public class ConstructorImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample c=new ConstructorExample();
		ConstructorExample ce=new ConstructorExample("Java");
		//System.out.println(ce);
		ConstructorExample ce1=new ConstructorExample("Java",24);
		Constructor_01 c1=new Constructor_01();
		System.out.println(c1.a); //0 
		System.out.println(c1.name);// null
		System.out.println(c1.fees);//0
		
	}

}
