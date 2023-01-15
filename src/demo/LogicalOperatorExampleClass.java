package demo;

public class LogicalOperatorExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Logical Operator - & (AND) | (OR)
		// AND -> 
		
		// 100 , 200 and 300
		
		// 100> 200  
		// 200 > 300
		
		
		/*boolean result=100>200; // false
		System.out.println(result);
		boolean result1=200>300; // false		
		System.out.println(result1);
		boolean res=(result!=result1);
		System.out.println(result!=result1);
		System.out.println(false!=false);*/
		
		boolean compare=100>200 & 200>300;
		System.out.println(compare);
		compare= 100>50 & 50>25 & 25 >15 & 15>10; // true
		// 100>50 - true
		// 50>25 - true
		// 25>15 - true
		// 15>10 - true
		// true
		System.out.println(compare);
		compare= 100>50 & 50>25 & 25 >15 & 15<10;
		System.out.println(compare);
		System.out.println(" OR Operator");
		compare= 100>50 | 50>25 | 25 >15 | 15>10; // true
		System.out.println(compare);
		compare= 100<50 | 50<25 | 25 <15 | 15<10; // false
		System.out.println(compare);
		compare= 100<50 | 50<25 | 25 >15 | 15<10; // true
		System.out.println(compare);
		System.out.println(" Not (!) Operator");
		
		System.out.println(!true); // false
		System.out.println(!false); // true
	}

}
