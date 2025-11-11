package coll;

import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		  var customers = new TreeMap<String, Integer>();
		  
		  customers.put("Scott", 30);
		  customers.put("Steve", 40);
		  customers.put("Allen", 30);
		  customers.put("Jackson", 35);
		  customers.put("Allen", 45);   // Updates value of Allen 
		  
		  //customers.put("Allen", "12"); 
		  
		  for (var key : customers.keySet())
			  System.out.println(key + " : " + customers.get(key));
		  
		  

	}

}
