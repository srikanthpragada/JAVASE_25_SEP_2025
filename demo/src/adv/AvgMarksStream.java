package adv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AvgMarksStream {
	
	public static int getAge(String dobstr) {
		var dob  = LocalDate.parse(dobstr);
		return (int) ChronoUnit.YEARS.between(dob, LocalDate.now());
	}
	
	public static void main(String[] args) throws IOException {
		var p = Path.of("c:\\classroom\\java\\dob.txt");
		
		var avg = 
			 Files.lines(p)
			 .filter(l -> l.strip().length() > 0) // ignore blank lines
		     .mapToInt(AvgMarksStream::getAge)  // age in years 
		     .average()
		     .getAsDouble();
		
		System.out.println(avg);
	}
}
