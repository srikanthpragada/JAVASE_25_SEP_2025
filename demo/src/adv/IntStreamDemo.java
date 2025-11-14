package adv;

import java.util.Arrays;

public class IntStreamDemo {

	public static void main(String[] args) {
		int[] marks = { 90, 88, 56, 45, 76, 34, 56, 77, 93, 59 };

		Arrays.stream(marks)
		      .filter(m -> m >= 50) // Predicate - test(v)
			  .sorted()
			  .forEach(System.out::println); // Consumer - accept(v)

	}

}
