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
		// iterate one by one value
		for(Map.Entry m : map.entrySet())
		{
			System.out.println("Key\t -> " + m.getKey());
			System.out.println("Value \t -> "+m.getValue());
		}
		map.put(null, "Java");
		System.out.println("Print the map value");
		System.out.println(map);
		
		map.put(6, "Delhi");
		System.out.println("Print the map value after adding duplicate value");
		System.out.println(map);
		
		map.put(2, "Hydrabad");// newest will be overwrite by oldest  key
		System.out.println("Print the map value after adding duplicate key");
		System.out.println(map);
		
		map.put(7, null);// newest will be overwrite by oldest  key
		System.out.println("Print the map value after adding null value");
		System.out.println(map);
		
	}

}
