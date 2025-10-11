package oop;

abstract class Course {
	protected String title;
	protected int duration, fee;

	public Course(String title, int duration, int fee) {
		this.title = title;
		this.duration = duration;
		this.fee = fee;
	}

	public void show() {
		System.out.println(this.title);
		System.out.println(this.duration);
		System.out.println(this.fee);
	}
	
	public abstract int getFee();
}

class OfflineCourse extends Course {
	private String location;

	public OfflineCourse(String title, int duration, int fee, String location) {
		super(title, duration, fee);
		this.location = location;
	}

	@Override
	public void show() {
		super.show();
		System.out.println(this.location);
	}

	public int getFee() {
		return this.fee - (this.fee * 10 / 100);
	}
}

class OnlineCourse extends Course {
	private String url;

	public OnlineCourse(String title, int duration, int fee, String url) {
		super(title, duration, fee);
		this.url = url;
	}

	@Override
	public void show() {
		super.show();
		System.out.println(this.url);
	}
	
	public int getFee() {
		return this.fee + (this.fee * 5 / 100);
	}
}

public class TestCourse {

	public static void main(String[] args) {
		var c1 = new OfflineCourse("Python", 30, 10000, "Srikanth Technologies");
		c1.show();
		System.out.println(c1.getFee());

		Course c = c1; // Upcasting
		c = new OnlineCourse("Gen AI", 24, 10000, "url");

		if (c instanceof OfflineCourse)
			c1 = (OfflineCourse) c; // Downcasting

		if (c instanceof OfflineCourse oc)
			oc.show();
		else {
			OnlineCourse olc = (OnlineCourse) c;
			olc.show();
		}

	}

}
