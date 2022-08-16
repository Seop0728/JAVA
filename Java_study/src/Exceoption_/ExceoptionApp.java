package Exceoption_;

public class ExceoptionApp {

	public static void main(String[] args) {
		int[] scores = { 10, 20, 30 };

		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(scores[3]);
			System.out.println(3);
			System.out.println(2 / 0);
			System.out.println(4);

		} catch (Exception e) {
			System.out.println("오류가 발생했습니다");
		}
		System.out.println(5);
		
//		try { // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3
//			// out of bounds for length 3
//		System.out.println(scores[3]);
//	} catch (ArrayIndexOutOfBoundsException e) {
//		System.out.println("없는 값을 찾고 계시네요.");
//	}
//
//	try {
//		System.out.println(2 / 0); // Exception in thread "main" java.lang.ArithmeticException: / by zero
//	} catch (ArithmeticException e) {
//		System.out.println("잘못된 계산이네요.");
//	}
//	System.out.println(3);
//	System.out.println("/////////////////////////");
	}

}
