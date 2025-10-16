package oop;

record Customer(String name, String email) {
	
}


public class TestRecord {

	public static void main(String[] args) {
		var c1 = new Customer("Ben", "ben@gmail.com");
		System.out.println(c1.email());  // getter method 
		
		var c2 = new Customer("Ben", "ben@gmail.com");
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.toString());
	}

}
