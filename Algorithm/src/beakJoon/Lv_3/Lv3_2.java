package beakJoon.Lv_3;

import java.util.Scanner;

//각 테스트 케이스마다 A+B를 출력한다.
public class Lv3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(b + c);

		}

	}

}
