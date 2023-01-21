package demo;

public class IfElseConstruct_01 {
	public static void main(String[] args) {
		int Math=45;
		int Science=45;
		int English=60;
		if(Math>=60 & Science>=60 & English>=60) {
			System.out.println("First");
		}else if(Math>=60 & Science>=60 & English<=60) {
			System.out.println("Second");
			}
		else if(Math>=60 & Science<60 & English<60) {
			System.out.println("Third");
			}
		/*else if(Math<60 & Science<60 & English<60) {
			System.out.println("Fail");
			}*/
		else {
			System.out.println("Fail");
		}
	}

}
