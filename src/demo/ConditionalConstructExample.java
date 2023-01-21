package demo;

public class ConditionalConstructExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boolean operator and conditional
		// a person salary of 5000 or not
		// person's salary
		// == conditional 
		// Result - Person is getting 5000 salary - Result
		// Result - Person is not getting 5000 salary 
		// At a time - only one
		
		double salary=5000; // 
		boolean isSalaryFiveThousand = salary==5000;
		System.out.println(isSalaryFiveThousand);
//		System.out.println("Person is getting 5000 salary");
		// conditional construct
		// if - else
		// if - else if - else
		if(isSalaryFiveThousand) {
			System.out.println("A person\'s salary is 5000");
		}
		else {
			System.out.println("A person\'s salary is not 5000");
		}
		
		
		
		
		
	}

}
