package coll;

import java.util.ArrayList;

public class RawVsGenerics {

	public static void main(String[] args) {
        // raw list and it can take any type of objects
		// not type-safe
		var raw = new ArrayList();

		raw.add(10);
		raw.add("Abc");
		raw.add(true);

		//var s = (String) raw.get(0);
		
		var generic = new ArrayList<Integer>();
		
		generic.add(10);
		generic.add(20);
		//generic.add("Abc");
		
		int n = generic.get(0);
		
		
	}
}
