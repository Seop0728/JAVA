package Flowcontrol;

public class AuthApp {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		String id = "seop";
		String inputId = args[0];
		
		String pass = "1234";
		String inputPass = args[1];
		
		if(inputId.equals(id) && inputPass.equals(pass)) {
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
