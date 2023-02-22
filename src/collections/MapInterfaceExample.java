package collections;

import java.util.*;
public class MapInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map is known as entry set key,value pair 
		// pair dataset <Key,Value>
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Delhi");
		map.put(2, "Kolkatta");
		map.put(3, "Mumbai");
		map.put(4, "Chennai");
		map.put(5, "Bangaluru");
		// Access data / value by key
		String val=map.get(5);
		System.out.println(val);
		System.out.println("Print the map value");
		System.out.println(map);
		
		
	}

}
