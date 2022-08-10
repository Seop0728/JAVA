//첫째 줄에 다음 세 가지 중 하나를 출력한다.
//
//A가 B보다 큰 경우에는 '>'를 출력한다.
//A가 B보다 작은 경우에는 '<'를 출력한다.
//A와 B가 같은 경우에는 '=='를 출력한다.


package beakJoon.Lv_2;

import java.util.Scanner;


public class Lv2_1 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		String str = (a>b) ? ">" : ((a<b) ? "<" : "==");
		//삼항연산자
		//변수 = (조건문) ? (true 일 때의 연산) : (false 일 때의 연산) ;
	
		
	}
}
