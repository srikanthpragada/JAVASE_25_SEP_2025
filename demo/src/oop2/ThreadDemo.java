package oop2;

public class ThreadDemo {
	
	public static void print() {
		var mt = Thread.currentThread();
		System.out.println(mt);
		
		for(int i = 1; i <= 5; i ++)
			System.out.println(i);
	}

	public static void main(String[] args) {
		 var mt = Thread.currentThread();
		 System.out.println(mt);
		 
		 print();
	}

}
