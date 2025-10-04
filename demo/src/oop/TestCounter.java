package oop;

class Counter {
	 // instance variable 
	 private int value;
	 
	 public Counter(int v) {
		 value = v;
	 }
	 public Counter() {
		 value = 0;
	 }
	 
	 public void setValue(int v) {
		 value = v;
	 }
	 // methods 
	 public void increment() {
		 value ++;
	 }
	 
	 public void increment(int step) {
		 value += step;
	 }
	 
	 public void decrement() {
		 value --;
	 }
	 
	 public void decrement(int step) {
		 value -= step;
	 }
	 
	 public int getValue() {
		 return value;
	 }
}

public class TestCounter {

	public static void main(String[] args) {
		 Counter c; // Object reference
		 
		 c = new Counter(100); // object or instance 
		 c.increment();
		 c.increment(5);
		 
		 System.out.println(c.getValue());
		 
		 Counter c2 = new Counter();
		 c2.increment();
		 System.out.println(c2.getValue());
	}

}
