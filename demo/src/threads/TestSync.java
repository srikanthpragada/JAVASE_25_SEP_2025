package threads;

class Data {
	public synchronized void print() {
		for (int i = 1; i <= 5; i++) {
			System.out.printf("%s : %d\n", Thread.currentThread().getName(), i);
			try {
				Thread.sleep(100);
			} catch (Exception ex) {
			}
		}
	}
}

class CThread extends Thread {
	Data obj;

	public CThread(Data obj, String name) {
		this.obj = obj;
		this.setName(name);
	}

	public void run() {
		obj.print();
	}
} // end of CThread

public class TestSync {
	public static void main(String args[]) {
		CThread thread1, thread2;
		Data obj = new Data();
		// make two threads access the same object
		thread1 = new CThread(obj, "First");
		thread2 = new CThread(obj, "Second");
		thread1.start();
		thread2.start();
	}
}
