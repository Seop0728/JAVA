package Flowcontrol_;

public class AuthApp2 {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		String id = "seop";
		String inputId = args[0];
		
		String pass = "1234";
		String pass2 = "5678";
		String inputPass = args[1];
		
		boolean isRightPass = (inputPass.equals(pass)|| inputPass.equals(pass2));
		if(inputId.equals(id) && isRightPass) {
			System.out.println("Master !");
		} else {
			System.out.println("who are you");
		}
		
		
		
		
		
		//if(inputId == id) {
//		if (inputId.equals(id)) {
//			if (inputId.equals(p)) {
//			System.out.println("Master !");
//		} else {
//			System.out.println("who are you?");
//		
//		}
//		
	}
}
