package io;

import java.io.RandomAccessFile;

public class WriteStudentMarks {

	public static void main(String[] args) throws Exception {

		var raf = new RandomAccessFile("c:\\classroom\\java\\marks.dat", "rw");

		for (int i = 1; i <= 50; i++) {
			var marks = (byte) Math.round(Math.random() * 100);
			raf.writeByte(marks);
		}

		raf.close();

	}

}
