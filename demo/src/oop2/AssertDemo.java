package oop2;

public class AssertDemo {

	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	public static void main(String[] args) {
		assert isEven(11) == false : "isEven() failed for odd number!";
		assert isEven(10) == true : "isEven() failed for even number!";
	}

}
