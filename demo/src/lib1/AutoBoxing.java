package lib1;

public class AutoBoxing {

	public static void main(String[] args) {
		  
		 Integer iobj = 10; // Auto-boxing
		 
		 Object obj = 10.50; // Autoboxing and upcasting 
		 System.out.println(obj.getClass());
		 
		 int a = iobj;  // Auto-unboxing 
		 
		 double d = (Double) obj; // Downcasting & unboxing 

	}

}
