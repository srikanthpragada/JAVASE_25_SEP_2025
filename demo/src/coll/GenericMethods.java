package coll;

public class GenericMethods {

//	public static void print(String[] values) {
//		for (var v : values)
//			System.out.println(v);
//	}
//
//	public static void print(int[] values) {
//		for (var v : values)
//			System.out.println(v);
//	}
//
//	public static void print(double[] values) {
//		for (var v : values)
//			System.out.println(v);
//	}
	
	public static <T> void printArray(T [] values) {
		for (T v : values)
			System.out.println(v);
	}

	public static void main(String[] args) {
		 var names = new String[10];
		 var marks = new Integer[10];
		 
		 printArray(names);
		 printArray(marks);
		 
	}

}
