package javaUtil.exam;

//Compare 인터페이스를 이용하는 클래스
//Compara 인터페이스를 받아들인 후, 해당 인터페이스를 이용하는 exec메소드
//compareTo메소드가 어떻게 구현되어 있느냐에 따라서 출력되는 값이 다름


public class CompareExam {
	
	public static void exec(Compare compare) {
		int k=10;
		int m=20;
		int value = compare.compareTo(k, m);
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		exec((i,j) -> {
			return i-j;
		});
	}
}

//자바는 메소드만 인자로 전달하려면 반드시 객체를 만들어서 전달해야 했다. 
//Java8에 람다식이 생기면서, 마치 함수만 전달하는 것처럼 간편하게 문법을 사용할 수 있게 되다.