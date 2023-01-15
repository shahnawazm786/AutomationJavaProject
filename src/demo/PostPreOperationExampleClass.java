package demo;

public class PostPreOperationExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int res;
		int b=200;
		int res1;
		// Pre increment 
		System.out.println("Pre - Increment Example");
		res1=++b;
		System.out.println(b);
		System.out.println(res1); // 100
		
		// Post increment
		System.out.println("Post - Increment Example");
		res=a++;// assign the value into the container then the value of a is increased
		System.out.println(res); // 100
		System.out.println(a); // 101

	}

}
