package oop;

class Student {
	protected String name, email, course;

	public Student(String name, String email, String course) {
		this.name = name;
		this.email = email;
		this.course = course;
	}

	public void show() {
		System.out.println(this.name);
		System.out.println(this.email);
		System.out.println(this.course);
	}
	
	public String getCourse() {
		return this.course;
	}
}

class IStudent extends Student {
	protected String country;

	public IStudent(String name, String email, String course, String country) {
		super(name, email, course);
		this.country = country;
	}
	// Overriding 
	@Override 
	public void show() {
		super.show();
		System.out.println(this.country);
	}
	
	public String getCountry() {
		return this.country;
	}
}

public class TestStudent {

	public static void main(String[] args) {
		 IStudent istud = new IStudent("Larry", "larry@gmail.com", "BECS", "AUS");
		 istud.show();
		 System.out.println(istud.getCourse());
		 System.out.println(istud.getClass());
		 
	}

}
