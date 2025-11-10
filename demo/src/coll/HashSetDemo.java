package coll;

import java.util.HashSet;

class Circle {
	private double radius;
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "radius =" + radius;
	}
}

public class HashSetDemo {

	public static void main(String[] args) {
        var circles = new HashSet<Circle>();
        
        circles.add(new Circle(10));
        circles.add(new Circle(20));
        circles.add(new Circle(15));
        circles.add(new Circle(10));
        
        for(var c : circles)
        	System.out.println(c);
	}
}
