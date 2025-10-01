package basics;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int num = s.nextInt();
		
		//System.out.println(num * num);
		System.out.printf("Square = %d", num * num);
		
		s.close();
	}
}
