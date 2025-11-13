package adv;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.length() - s2.length();
	}
}

public class LambdaDemo {

	public static int compareByLength(String s1, String s2) {
		return s2.length() - s1.length();
	}

	public static void main(String[] args) {
		String[] names = { "Bill", "Li", "Stephen", "Richards", "Ze", "Jackson" };

		// Arrays.sort(names , new LengthCompare() );

		// Lambda Expression
		Arrays.sort(names, (s1, s2) -> s1.length() - s2.length());

		// Lambda Block
		Arrays.sort(names, (s1, s2) -> {
			return s1.length() - s2.length();
		});

		// Method reference
		Arrays.sort(names, LambdaDemo::compareByLength);

		for (var name : names) {
			System.out.println(name);
		}

	}

}
