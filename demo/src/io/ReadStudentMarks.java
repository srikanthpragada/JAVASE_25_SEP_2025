package io;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class ReadStudentMarks {

	public static void main(String[] args) throws Exception {

		var raf = new RandomAccessFile("c:\\classroom\\java\\marks.dat", "r");

		var s = new Scanner(System.in);

		System.out.print("Enter rollno : ");
		int rollno = s.nextInt();

		// Move pointer to the required location
		raf.seek(rollno - 1);

		System.out.println(raf.readByte());

		raf.close();
		s.close();

	}

}
