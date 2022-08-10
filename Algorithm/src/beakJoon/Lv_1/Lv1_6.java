package beakJoon.Lv_1;
import java.util.Scanner;

//첫째 줄에 A×B를 출력한다

public class Lv1_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		sc.close();

		System.out.println(a / b);
	}

}
