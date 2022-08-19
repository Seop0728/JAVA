package Method_;
import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	static String seop = "Love";

	public static void main(String[] args) throws IOException {

									// 인자, argument
		//System.out.println(twoTimes(seop, "^*^*^* ^*^*^*^*^*^*^"));
		
		FileWriter fw = new FileWriter("FileWriter=String.txt");
		fw.write(twoTimes(seop, "FileWriter=String/내용/"));
		fw.close();
		System.out.println("FileWriter : 생성완료");

	}

									// 매개변수, parameter
//	public static void printTwoTime(String text, String delimiter) {
//		System.out.println(delimiter);
//		System.out.println(text);
//		System.out.println(text);
//	}

	public static String twoTimes(String text, String delimiter) {
		String out = "aa";

		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;

	}

}
