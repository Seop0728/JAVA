package beakJoon.Lv_3;

import java.util.Scanner;

//구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌
//총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
public class Lv3_4 {

	public static void main(String[] args) {


	        Scanner sc = new Scanner(System.in);

	        int total =  sc.nextInt();
	        int count = sc.nextInt();

	        for(int i = 0; i< count; i++){
	            int price = sc.nextInt();
	            int num = sc.nextInt();

	            total = total - (price * num);
	        }

	        if(total == 0) System.out.println("Yes");
	        else System.out.println("No");


	    }
	}
	}

}
