package Flowcontrol;

public class EqualsApp {

	public static void main(String[] args) {
		
		int p1 = 1;
		int p2 = 1;
		//int p2 = new Integer(1);
		
		if(p1 == p2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		String o1 = "java";
		String o2 = new String("java");
		
		if(o1 == o2) {
			System.out.println("true");
		}else {
			System.out.println("o1 == o2 = false");
		}
		if(o1.equals(o2)) {
			System.out.println("o1.equals(02) = true");
		}else {
			System.out.println("false");
		}
		
		
		String o3 = "java1";
		String o4 = "java1";
		
		if(o3 == o4) {
			System.out.println("o3 == o3 =true");
		}else {
			System.out.println("false");
		}
		
		
		
		
		
	}

}
