package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLines {

	public static void main(String[] args) throws Exception {
		var fr = new FileReader("c:\\classroom\\java\\names.txt");
		var br = new BufferedReader(fr);

		while (true) {
			String line = br.readLine();
			if (line == null)
				break;

			System.out.println(line);
		}

		br.close();
		fr.close();
	}
}
