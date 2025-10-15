package assignments;

public class TotalMarks {

	public static void main(String[] args) {
		 String data = "70,56,87,69";
		 
		 String marks [] = data.split(",");
		 
		 int total = 0;
		 for(String m : marks)
		      total += Integer.parseInt(m);
		 
		 System.out.println(total);
	}

}
