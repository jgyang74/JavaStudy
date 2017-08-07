package javaUtil.exam;

//"hello"를 출력하는 hello()메소드를 가지는 MyHello라는 클래스를 작성
//hello메소드 위에 @Count100 어노테이션을 붙힙니다.

public class MyHello {
	@Count100
	public void hello() {
		System.out.println("hello");
	}

}
