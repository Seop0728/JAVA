class Print {
	public String delimiter;
	
	//method 가 instance 소속일때는 static을 제거한다	instance.a()
	//method 가 class 소속일때는 static을 제거한다		Print.a()
	public  void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}

	 void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}

}

public class StaticMethod {

	public static void main(String[] args) {
//		Print.a("-------");
//		Print.b("@@@@@@@");
		
		//Print t1 = new Print();	
		//Print 클래스를 복제한다(앞에 new를 붙혀서) 그 복제된것을
		//ti(인스턴스) 이라는 데이터 타입이 Print 변수에 담았다
		
		Print t1 = new Print();	
		t1.delimiter = "------";
		t1.a();
		t1.b();
		
		
		
		
	}

}
