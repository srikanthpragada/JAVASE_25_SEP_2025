package oop2;

public class ExceptionDemo {

	public static void main(String[] args) {
		String s = "0";

		try {
			int n = Integer.parseInt(s);
			System.out.println(100 / n);
		} catch (NumberFormatException ex) {
			System.out.println("Sorry! Not a valid number!");
		} catch (ArithmeticException ex) {
			System.out.println("Sorry! Zero is not a valid number!");
		}

		System.out.println("The End");

	}

}
