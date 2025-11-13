package adv;

public class LambdaThread {

	public static void printNumbers() {
		for (var n = 1; n < 10; n++)
			System.out.println(n);
	}

	public static void main(String[] args) {
		var t = new Thread(() -> System.out.println("New Thread!"));
		t.start();

		var t2 = new Thread(() -> {
			for (var n = 1; n < 10; n++)
				System.out.println(n);
		});

		t2.start();

		// Method reference 
		var t3 = new Thread(LambdaThread::printNumbers);
		t3.start();

	}

}
