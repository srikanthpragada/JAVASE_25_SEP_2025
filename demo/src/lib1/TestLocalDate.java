package lib1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestLocalDate {

	public static void main(String[] args) {
		 var cd = LocalDate.now();
		 var fd = LocalDate.of(2025, 1,1);
		 var sd = LocalDate.parse("10-10-2025",
				DateTimeFormatter.ofPattern("dd-MM-yyyy") );
				 
		 
		 System.out.println(cd);
		 System.out.println(fd);
		 System.out.println(sd);
		 
		 System.out.println(cd.plusDays(10));

	}

}
