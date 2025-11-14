package adv;

import java.util.stream.Stream;

public class StringStream {

	public static void main(String[] args) {
		 
		Stream.of("Bill","Larry", "Jack", "Martin", "Jackson", "Richards", "Roberts")
		      .filter(n -> n.length() > 4)
	          .sorted()
	          .limit(5)
	          .forEach(System.out::println);
		

	}

}
