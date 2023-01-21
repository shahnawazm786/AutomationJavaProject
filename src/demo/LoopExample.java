package demo;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Loop -> A process can be iterated more than once 
		// in other words
		// a process is need to run more than once (certain period/certain time)
		// CodingMaktab - 5 times
		/*System.out.println("CodingMaktab");
		System.out.println("CodingMaktab");
		System.out.println("CodingMaktab");
		System.out.println("CodingMaktab");
		System.out.println("CodingMaktab");*/
		// 100 times 
		// this copy - paste process will take more effort
		// 1000 
		// 1 lakh times // effort is increasing 
		// your copy and paste is not feasible
		// Loop - while, do - while, for and for-each
		int number=1;
		
		while(number<=5) {
			System.out.println(number + " times \t CodingMaktab");
			number++;
		}
		
		number=1;
		while(number<=5) {
			int num2=1;
			while(num2<=5) {
				System.out.print(number + " times \t CodingMaktab \t");
				num2++;
			}
			System.out.println();
			number++;
		}
		
		
		

	}

}
