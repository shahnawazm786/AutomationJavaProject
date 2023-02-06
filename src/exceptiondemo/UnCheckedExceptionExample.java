package exceptiondemo;

public class UnCheckedExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=5;
		try {
		int res=a/b;
		}catch(Exception e) {
			System.out.println("Number can't be devided");
		}finally {
			System.out.println("Every time it is going to be executed");
		}
	}

}
