package finalkeyword;

public class FinalKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// With the variable
		final double pie=3.141;
		System.out.println("Area of "+(2*pie*(5*5)));
		//pie=4;
		ChildClassFinalKeywordInMethod ch=new ChildClassFinalKeywordInMethod();
		ch.showMethod();
		FinalMethodExample fm=new FinalMethodExample();
		fm.showMethod();
		
		//FinalMethodExample fm1=new ChildClassFinalKeywordInMethod();

	}

}
