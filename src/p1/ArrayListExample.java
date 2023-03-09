package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import io.cucumber.java.en.Given;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> myList=new ArrayList<String>();
		myList.add("A1");
		myList.add("A2");
		myList.add("A3");
		System.out.println(myList);
		myList.remove("A2");
	System.out.println(myList);	
	System.out.println(myList.get(1));
	myList.add(0, "A4");
	System.out.println(myList);

	//Set
	
	Set<String> set=new HashSet<String>();
	set.add("B1");
	set.add("B2");
	System.out.println(set);
	
	
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(1, "One");
	map.put(2, "Two");
	System.out.println(map);
	System.out.println(map.get(1));
	}

	//Hashmap
	
	
	
}
