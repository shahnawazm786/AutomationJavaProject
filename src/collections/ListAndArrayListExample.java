package collections;
import java.util.*;

public class ListAndArrayListExample {
	public static void main(String[] args) {
		//integerList();
		//stringList();
		stringRemoveFromList();
	}
	public static void integerList() {
		List<Integer> item=new ArrayList<Integer>();
		for(int i=100;i<=120;i++) {
			//item.add(new Integer(i)); 
			item.add(i);
		}
		System.out.println(item);
		item.remove(1);
		System.out.println(item);
	
	}
	public static void stringList() {
		List<String> item=new ArrayList<String>();
		String str="codingmaktab\nkazonline\nkaztraing\nkazacademy";
		item=Arrays.asList(str.split("\n"));
		//String[] word=str.split("\n");
		//item=Arrays.asList(word);
		System.out.println(item);
		int countWord=item.size();
		System.out.println("Word count is "+countWord);
		Iterator itr=item.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//item.remove(1);
		System.out.println(item);
		
		
	}
	public static void stringRemoveFromList() {
		List<String> str=new ArrayList<>();
		str.add("Java");
		str.add("C#");
		str.add("Python");
		str.add("Php");
		str.add("Ruby");
		System.out.println(str);
		str.remove(0); // by index
		System.out.println(str);
		str.remove("Ruby"); // by object
		System.out.println(str);
		str.remove("Oracle"); // false
		System.out.println(str);
		str.add("Java");
		str.add("C#");
		System.out.println(str);
		str.add("C#");
		System.out.println(str);
		str.add("Java");
		System.out.println(str);
	}

}
