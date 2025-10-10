package oop;

abstract class Shape {
	protected int x, y;

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void show() {
		System.out.println(this.x);
		System.out.println(this.y);
	}
	
	public abstract double getArea();

}

class Circle extends Shape {
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void show() {
		super.show();
		System.out.println(this.radius);
	}

	@Override 
	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}
}

class Square extends Shape {
	private int side;

	public Square(int x, int y, int side) {
		super(x, y);
		this.side = side;
	}

	@Override
	public void show() {
		super.show();
		System.out.println(this.side);
	}

	public double getArea() {
		return this.side * this.side;
	}
}

public class TestShapes {

	public static void main(String[] args) {
		Shape s = new Circle(10, 20, 15);
		s.show(); // Runtime Polymorphism
		System.out.println(s.getArea());
		
		s = new Square(5,5,20);
		s.show();
		System.out.println(s.getArea());

	}

}
