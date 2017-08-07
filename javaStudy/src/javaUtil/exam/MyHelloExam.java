package javaUtil.exam;

//MyHello클래스를 이용하는 MyHelloExam클래스를 작성
//MyHello의 hello메소드가 @Count100어노테이션이 설정되어 있을 경우, hello()메소드를 100번 호출하도록 합니다.


import java.lang.reflect.Method;

public class MyHelloExam {

	public static void main(String[] args) {
	
		MyHello hello = new MyHello();
		
		try {
			Method method = hello.getClass().getDeclaredMethod("hello");
			
			if(method.isAnnotationPresent(Count100.class)) {
				for(int i=0 ; i<100; i++) {
					hello.hello();
				}				
			}else{
				hello.hello();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

 	}

}
