package io;
import java.io.FileReader;

public class ReadNames {

	public static void main(String[] args) throws Exception {
		var fr = new FileReader("c:\\classroom\\java\\names.txt");

		while (true) {
			int ch = fr.read();
			if (ch == -1) // EOF
				break;

			System.out.print((char) ch);
		}

		fr.close();
	}
}
