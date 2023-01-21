package demo;

public class BreakKeyWordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// use of break keyword
		// i iterated a loop for ten time
		// but when number reach at 5 
		// go out from the loop 
		// coming out from the loop - we used the break keyword
		int i=1;
		while(i<=10) {
			System.out.println("Loop count -> \t"+i);
			if(i==5)
				break;
			i++;
		}
		
	}

}
