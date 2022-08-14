
//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F

package beakJoon.Lv_2;

import java.util.Scanner;

public class Lv2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		sc.close();
		
//		if(A >= 90) System.out.println("A");
//		else if(A >= 80) System.out.println("B");
//		else if(A >= 70) System.out.println("C");
//		else if(A >= 60) System.out.println("D");
//		else System.out.println("F");
		
		System.out.println((A >= 90)?"A": (A >= 80)? "B": (A >= 70)? "C": (A >= 60)? "D": "F");
		
		
		
	}

}
