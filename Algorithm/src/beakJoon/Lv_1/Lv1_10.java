package beakJoon.Lv_1;

import java.util.Scanner;

//체스는 총 16개의 피스
//킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개

//첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰
//개수가 주어진다. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수
public class Lv1_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int chess[] = {1, 2, 2, 2, 8};
		int answer[] = {6};
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(chess[i] -answer[i]+"");
			
		}
		
	}

}
