package Flowcontrol_;

public class LogicalOperatiorApp {
	public static void main(String[] args) {
		
		//AND
		System.out.println(1 == 1);
		System.out.println(true && true);	// true
		System.out.println(true && false);	// false
		System.out.println(false && true);	// false
		System.out.println(false && false);	// false
		
		//OR
		System.out.println(true || true);	// true
		System.out.println(true || false);	// true
		System.out.println(false || true);	// true
		System.out.println(false || false);	// false
		
		//NOT
		System.out.println(!true);	// false
		System.out.println(!false);	// true
	}
}
