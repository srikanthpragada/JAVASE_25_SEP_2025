package lib1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class SortDates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		LocalDate dates[] = new LocalDate[5];
		
		for(int i = 0; i < 5; i ++)
		{
			System.out.print("Enter date [yyyy-mm-dd]: ");
			String dateStr = s.nextLine();
			dates[i] = LocalDate.parse(dateStr);
		}
		
		Arrays.sort(dates);
		
		for(LocalDate d : dates)
			System.out.println(d);
	}

}
