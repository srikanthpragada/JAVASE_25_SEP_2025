package basics;

public class Wish {
	public static void main(String ... args) {
		if (args.length == 0)
			System.out.println("Hello Guest!");
		else
			System.out.printf("Hello %s", args[0]);
		
	}

}
