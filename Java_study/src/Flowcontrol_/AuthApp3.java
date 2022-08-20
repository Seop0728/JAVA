package Flowcontrol_;

public class AuthApp3 {

	public static void main(String[] args) {
		String[][] users = {
				{ "seop", "1111" },
				{ "sehee", "2222" },
				{ "mong", "3333" } 
		};
		String inputId = args[0];
		String inputPass = args[1];

		boolean isLoginde = false;
		for (int i = 0; i < users.length; i++) {
			String[] current = users[i];
			if (
					current.equals(inputId) &&
					current.equals(inputPass)
					
				) 
			{
				isLoginde = true;
				break;
			}
		}
		System.out.println("hi");
		if (isLoginde) {
			System.out.println("Master !!");
		} else {
			System.out.println("Who are you?");
		}
	}
}