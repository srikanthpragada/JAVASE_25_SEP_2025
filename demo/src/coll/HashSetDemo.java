package coll;

import java.util.TreeSet;

class Circle implements Comparable<Circle>{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "radius =" + radius;
	}

	@Override
	public int hashCode() {
		return (int) this.radius;
	}

	@Override
	public boolean equals(Object obj) {
		var other = (Circle) obj;
		return this.radius == other.radius;
	}

	@Override
	public int compareTo(Circle other) {
		 return  (int) (this.radius  - other.radius);
	}
}

public class HashSetDemo {

	public static void main(String[] args) {
		var circles = new TreeSet<Circle>();

		circles.add(new Circle(10));
		circles.add(new Circle(20));
		circles.add(new Circle(15));
		circles.add(new Circle(10));

		for (var c : circles) {
			System.out.println(c.hashCode());
			System.out.println(c);
		}
	}
}
