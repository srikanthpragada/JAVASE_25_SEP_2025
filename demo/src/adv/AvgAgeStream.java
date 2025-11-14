package adv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AvgAgeStream {

	public static void main(String[] args) throws IOException {
		var p = Path.of("c:\\classroom\\java\\marks.txt");
		
		var avg = 
			 Files.lines(p)
		     .mapToInt(s -> Integer.parseInt(s))
		     .filter(m -> m >= 50)
		     .average()
		     .getAsDouble();
		
		System.out.println(avg);
		     
	}

}
