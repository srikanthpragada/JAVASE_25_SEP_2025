package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesDemo {

	public static void main(String[] args) throws IOException {
		var p = Path.of("c:\\classroom\\java\\names.txt");
		System.out.println(p.getClass());
		var contents = Files.readString(p);
		System.out.println(contents);
	}
}
