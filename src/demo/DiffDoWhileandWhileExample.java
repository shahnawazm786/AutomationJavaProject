package demo;

public class DiffDoWhileandWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=11;
		while(counter<=10) { // 11<=10 - false
			System.out.println("Show me");
			counter++;
		}
		System.out.println("Execution done .....");
		
		int runner=11;
		do
		{
			System.out.println("Do while executed once even the result is false");
			runner++;
		}while(runner<=10);
		
		System.out.println("Execution done .....");
	}

}
