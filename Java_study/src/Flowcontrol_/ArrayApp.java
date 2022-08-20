package Flowcontrol_;

public class ArrayApp {
	public static void main(String[] args) {
		String[] users = new String[3];
		users[0] = "seop";
		users[1] = "sehee";
		users[2] = "mong";
		
		System.out.println(users[1]);
		System.out.println(users.length);
		System.out.println();
		
		//int[] scores = new int[3];
		int[] scores = {10, 100, 100};
		System.out.println(scores[1]);
		System.out.println(scores.length);
		
	}
}
