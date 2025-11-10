package coll;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		 var marks = new TreeSet<Integer>();
		 
		 marks.add(10);
		 marks.add(20);
		 marks.add(15);
		 marks.add(5);
		 marks.add(10);
		 marks.add(12);
		 
		 for(var m : marks) {
			 System.out.println(m);
		 }
		 
		 
		 
	}

}
