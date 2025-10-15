package lib1;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name + " - " + this.age;
	}

	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj; // downcast
		return this.name.equals(other.name) && this.age == other.age;
	}
}

public class TestPerson {
	public static void main(String[] args) {
		var p1 = new Person("Larry", 35);
		var p2 = new Person("Larry", 35);
		var p3 = new Person("Ellison", 75);

		System.out.println(p1.toString());
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

	}

}
