package oop2;

import java.util.Arrays;

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person other) {
//		System.out.println(this);
//		System.out.println(other);
		
		return this.name.compareTo(other.name);
	}
}

public class SortPersons {
	public static void main(String[] args) {
		Person[] people = new Person[5];

		people[0] = new Person("Jack", 40);
		people[1] = new Person("Mark", 45);
		people[2] = new Person("Steve", 30);
		people[3] = new Person("Larry", 35);
		people[4] = new Person("Ben", 20);

		Arrays.sort(people);
		
		for(var p : people)
			System.out.println(p.toString());
	}

}
