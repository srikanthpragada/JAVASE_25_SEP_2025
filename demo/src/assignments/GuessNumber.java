package assignments;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		// take a random number in the range 0 to 25
		long number = Math.round(Math.random() * 25);

		Scanner s = new Scanner(System.in);

		for (int attempts = 1; attempts <= 3; attempts++) {

			System.out.print("Guess Number :");
			int gn = s.nextInt();

			if (gn == number) {
				System.out.println("Congratualtions. You have done it!");
				return;
			}
			// Provide assistance when it is not last attempt
			if (attempts < 3) {
				if (gn > number)
					System.out.println("Your number is bigger!");
				else
					System.out.println("Your number is smaller!");
			}
		}

		System.out.println("Sorry! Better luck next time!");
	}

}
