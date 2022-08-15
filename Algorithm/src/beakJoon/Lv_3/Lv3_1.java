package beakJoon.Lv_3;

import java.util.Scanner;

//출력형식과 같게 N*1부터 N*9까지 출력한다.
public class Lv3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i = 1; i < 10; i ++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
		
	}

}
