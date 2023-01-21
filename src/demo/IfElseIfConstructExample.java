package demo;

public class IfElseIfConstructExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math >=60
		// Science>=60
		// English>=60 - Grade - First
		int Math=45;
		int Science=53;
		int English=55;
		if(Math>=60) {
			if(Science>=60) {
				if(English>=60) {
					System.out.println("First");
				}
				else
				{
					System.out.println("Second");
				}
			}
			else {
				System.out.println("Third");
			}
			
		}
		else {
			System.out.println("Failed");
		}

	}

}
