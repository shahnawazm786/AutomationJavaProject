package collections;
import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> strSet=new TreeSet<>();
		strSet.add(new String("Java"));
		strSet.add("Oracle");
		strSet.add("Python");
		strSet.add("Php");
		strSet.add("Java Script");
		//strSet.add(null);
		strSet.add(new String("Java"));
		System.out.println(strSet);
		//strSet.add(null);
		System.out.println(strSet);
		Iterator itr=strSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
