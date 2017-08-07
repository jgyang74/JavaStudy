package javaBasic;

public class DuckExam {

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.sing();
		
		duck.fly();
		
		// Bird b = new Bird();  추상 메소드는 인스턴스를 생성할 수 없다.
	}

}
