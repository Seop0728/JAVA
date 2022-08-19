package Exceoption_;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {
	public static void main(String[] args) {
		FileWriter f = null;
		
		// try catch finally
		try {
			f = new FileWriter("data.txt");
			f.write("hello");
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			if (f != null) {
				try {
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
