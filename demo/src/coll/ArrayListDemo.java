package coll;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		 var names = new ArrayList<String>();
		 
		 names.add("Bill");
		 names.add("Kevin");
		 names.add(0, "Jack");
		 
		 
		 names.sort(null);
		 
		 for (var n : names) {
			 System.out.println(n);
		 }
		 
		 
		 names.remove(0);
		 
		 System.out.println(names.contains("Bill"));
		 
		 for (var n : names) {
			 System.out.println(n);
		 }
		 
	}

}
