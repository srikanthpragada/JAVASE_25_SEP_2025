package io;

import java.io.FileWriter;

public class WriteMarks {

	public static void main(String[] args) throws Exception {
		 int marks[] = {90,78,56,66,77,84,54,66,91,89};
		 
		 var fw = new FileWriter("c:\\classroom\\java\\marks.txt");
		 
		 for(var m : marks)
			 fw.write(m + "\n");
		 
		 
		 fw.close();
	}

}
