package beakJoon.Lv_2;

import java.util.Scanner;

// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수
// 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.

public class Lv2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		//int y = 1200;		[ % = 나눈 나머지를 저장]
		sc.close();
		
		//System.out.print((y%4==0)?((y%400==0)?"1":(y%100==0)?"0":"1"):"0");
		
		if(y % 4 == 0 ) {
			if(y % 400 == 0) System.out.println("1");
			else if(y % 100 == 0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
	}

}
