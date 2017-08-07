package javaBasic;

//연산자 우선순위
//최우선연산자 ( ., [], () )
//
//단항연산자 ( ++,--,!,~,+/-   : 부정, bit변환>부호>증감)
//
//산술연산자 ( *,/,%,+,-,shift) < 시프트연산자 ( >>,<<,>>> ) >
//
//비교연산자 ( >,<,>=,<=,==,!= )
//
//비트연산자 ( &,|,,~ )
//
//논리연산자 (&& , || , !)
//
//삼항연산자 (조건식) ? :
//
//대입연산자 =,*=,/=,%=,+=,-=

public class OperatorExam3 {

	public static void main(String[] args) {
		int a =5;
		int b = 10;
		int c = 15;
		
		System.out.println((a-b)*c);
		System.out.println(a>5 && b>5);
		System.out.println(a>5 || b>5);
		
		System.out.println(++a - 5);
		System.out.println(a);
		System.out.println(a++ - 5);
		System.out.println(a);
	}

}
