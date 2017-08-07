package javaBasic;

//상수
//상수(常數)란 수식에서 변하지 않는 값을 의미한다.
//상수의 선언
//final 상수타입 상수명;
//
//final int J;
//상수의 사용
//상수명 = 값;
//
//J = 10; (J에는 값을 담을 수 있는 기회가 단 한 번만 허락됨)
//상수 명명 관례
//대문자로만 구성된 명사로 정함
//
//여러 단어로 구성된 이름의 경우 단어 사이에 '_'을 써서 구분함.
//
//상수를 사용해야 하는 경우
//값이 변하면 위험한 경우에 상수를 사용
//
//값만 봤을때 무엇을 의미하는지 쉽게 파악할 수 없는 값에도 값 자체를 사용하기 보다는 상수를 사용

public class ConstantExam {

	public static void main(String[] args) {
		int i;
		i=10;
		i=5;
		
		final int J;
		J=10;
//		J=5;
		
		double circleAreal;
		final double PI = 3.14159;
		circleAreal = 3*3*PI;
		
		final int OIL_PRICE = 1390;
		int totalPrice = 50 * OIL_PRICE;
		 

	}

}
