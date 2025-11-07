package io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		var f = new File("c:\\classroom\\java\\names.txt");

		System.out.println(f.exists());
		System.out.println(f.length());

		System.out.println(new File("c:\\").getTotalSpace() / (1024 * 1024 * 1024));
		
		var f2 = new File("c:\\classroom\\java\\oldnames.txt");
		f2.delete();
		

	}

}
