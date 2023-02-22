package collections;

import java.util.*;
public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> tm=new TreeMap<>();
		tm.put("Java", 1);
		tm.put("C#", 2);
		tm.put("Oralce", 3);
		tm.put("Sql Server", 4);
		tm.put("Mongo DB", 5);
		System.out.println("Display the tree map value");
		System.out.println(tm);
		tm.put("Sybase", null);
		System.out.println("Display the tree map value after add null value");
		System.out.println(tm);
		tm.put(null, 10);
		System.out.println("Display the tree map value after add null key");
		System.out.println(tm);
	}

}
