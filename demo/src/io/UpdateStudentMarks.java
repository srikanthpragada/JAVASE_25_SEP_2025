package io;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class UpdateStudentMarks {

	public static void main(String[] args) throws Exception {

		var raf = new RandomAccessFile("c:\\classroom\\java\\marks.dat", "rw");

		var s = new Scanner(System.in);

		System.out.print("Enter rollno : ");
		int rollno = s.nextInt();
		
		System.out.print("Enter new marks : ");
		int marks  = s.nextInt();

		// Move pointer to the required location
		raf.seek(rollno - 1);

		// write new marks 
		raf.writeByte((byte) marks);

		raf.close();
		s.close();

	}

}
