package finalkeyword;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str; // Thread safe mutable (Value can't be change runtime) 
		str="Hello!!";
		str.concat("Method");
		System.out.println(str);
		StringBuilder sb=new StringBuilder(str); // immutable -> value changed at runtime easily
		sb.append("Method");
		System.out.println(sb.toString()); // Thread safe
	}
}
