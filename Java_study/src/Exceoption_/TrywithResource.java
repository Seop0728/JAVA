package Exceoption_;

import java.io.FileWriter;
import java.io.IOException;

public class TrywithResource {
	public static void main(String[] args) {
		
		// try with reource statements
		try (FileWriter f = new FileWriter("data.txt")) {
			f.write("hello");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
