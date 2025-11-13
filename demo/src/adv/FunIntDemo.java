package adv;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunIntDemo {

	public static void main(String[] args) {
	  
		Predicate<String> p = (s) -> s.length() > 5;
		System.out.println(p.test("Abcd"));
		
		Consumer<String> c  = (s) -> System.out.println(s.toUpperCase());
		c.accept("Hello");

	}

}
