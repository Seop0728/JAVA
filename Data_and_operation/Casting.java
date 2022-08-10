
public class Casting {
	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		System.out.println(b);
		
		double d = 1.1;
		int e = (int) 1.9;
		System.out.println(e);
		
		// 1 to string
		int f2 = 5;
		String f = Integer.toString(f2);
		System.out.println("f2 : "+f2);
		System.out.println("Interger.toString f : "+ f.getClass());
		
		String g = "1";
		System.out.println("String g : "+g.getClass());
		
		
	}
}
