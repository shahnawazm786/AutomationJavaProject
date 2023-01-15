package demo;

public class SecondExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Conditional Operator
		// 100 and 200
		/*if(100>200) {
			
		}*/
		System.out.println(100>200); //
		// conditional operator giving you results from (true,false) value
		// > greater than value, True if left hand side value is greater 
		// to right hand side value
		//  to return false just work opposite to the definition
		
		// boolean container=left_hand_side_value(binary operator)right_hand_side_value
		
		System.out.println("> operator result");
		boolean result= 100 > 200; //false
		System.out.println(result);
		result= 200 > 100; //true
		System.out.println(result);
		// < less than value, True if left hand side value is less 
		// to right hand side value
		//  to return false just work opposite to the definition
		System.out.println("< operator result");
		result=100<200;  // true
		System.out.println(result);
		result=100>200;  // false
		System.out.println(result);
		// == operator, True if left hand side and the  
		// right hand side value is equal
		//  to return false just work opposite to the definition
		System.out.println("== operator result");
		result=100==200;  // false
		System.out.println(result);
		result=200==100;  // false
		System.out.println(result);
		result=100==100;  // true
		System.out.println(result);
		
		// >= (combination of greater and == operator)
		// 100>= 200 => 100>200 OR 100==200
		//              false OR false => false
		// 200>=100 => 200 >100 OR 200 == 100
		//             true OR false
		//             true
		// 200>=200  => 200>200 OR 200==200
		//				false OR true
		//				true
		
		System.out.println(">= operator result");
		result=100>=200;  // false
		System.out.println(result);
		result=200>=100;  // true
		System.out.println(result);
		result=200>=200;  // true
		System.out.println(result);
		
		// Use the <= operator and dry run like me which has been explained above
		
		
		
	}

}
