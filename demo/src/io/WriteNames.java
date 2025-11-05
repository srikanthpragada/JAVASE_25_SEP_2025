package io;

import java.io.FileWriter;

public class WriteNames {

	public static void main(String[] args) throws Exception {
		 String names[] = {"Larry", "Mark", "Stephen", "Richards" };
		 
		 var fw = new FileWriter("c:\\classroom\\java\\names.txt");
		 
		 for(var name : names)
			 fw.write(name + "\n");
		 
		 
		 fw.close();
	}

}
