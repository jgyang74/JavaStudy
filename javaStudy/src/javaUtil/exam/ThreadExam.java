package javaUtil.exam;

//
//Thread 클래스를 상속받은 MyThread1을 사용하는 클래스
//Thread를 상속 받았으므로 MyThread1은 Thread 이다.
//쓰레드를 생성하고, Thread 클래스가 가지고 있는 start() 메소드를 호출 한다.

public class ThreadExam {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		
		t1.start();
		t2.start();
		
		System.out.println("main end!!!!");
		
	}
}	
