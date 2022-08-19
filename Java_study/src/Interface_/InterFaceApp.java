package Interface_;
interface calculable {
	int sum(int v1, int v2);
}
//class Realcal{
//	public double plus(double v1, double v2, double v3) {
//		return v1+v2+v3;
//	}
//}

interface Printable{
	void print();
}

class Realcal implements calculable, Printable{

	public int sum(int v1, int v2) {
		return v1+v2;
	}

	public void print() {
		System.out.println("This is Realcal !!");
	}
	
}

class Dummycal implements calculable {
	public int sum(int v1, int v2) {
		return 3;
	}
}

public class InterFaceApp {

	public static void main(String[] args) {
		// 더하기 기능이 있는 클래스를 만들어주세요.

		Realcal c = new Realcal();
		System.out.println(c.sum(2, 1));
		c.print();
		

	}

}
