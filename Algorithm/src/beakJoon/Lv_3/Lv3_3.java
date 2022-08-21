package beakJoon.Lv_3;

import java.util.Scanner;

//1부터 n까지 합을 출력한다.
public class Lv3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	//11
		sc.close();
		
		int sum = 0;
		for(int i=1; i<=a; i++) {
			sum += i;
		}
		System.out.println(sum);	//66
	}

}
