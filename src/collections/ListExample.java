package collections;

import java.util.*;
public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		// to add value in list interface use the add()
		list.add("codingmaktab");
		list.add("kaz");
		list.add("kazonline");
		list.add("kazacademy");
		list.add("kaz technology");
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		String str="my name is coding maktab";
		String[] word=str.split(" ");
		list=Arrays.asList(word);
		itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
