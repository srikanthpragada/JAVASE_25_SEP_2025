package adv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileStream {

	public static void main(String[] args) throws IOException {
		var p = Path.of("c:\\classroom\\java\\names.txt");
		
		Files.lines(p)
		     .filter( l -> l.contains("e"))
		     .sorted( (s1, s2) -> s2.compareTo(s1)) // Sort desc
		     .forEach(System.out::println);
	}

}
