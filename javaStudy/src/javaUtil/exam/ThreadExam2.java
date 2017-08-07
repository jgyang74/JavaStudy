package javaUtil.exam;


//Runable 인터페이스를 구현한 MyThread2 사용하는 방법
//MyThread2는 Thread를 상속받지 않았기 때문에 Thread가 아니다.
//Thread를 생성하고, 해당 생성자에 MyThread2를 넣어서 Thread를 생성한다.
//Thread 클래스가 가진 start()메소드를 호출한다.


public class ThreadExam2 {
	public static void main(String[] args) {
		 MyThread2 t1 = new MyThread2("*");
		 MyThread2 t2 = new MyThread2("-");
		 
		 Thread thread1 = new Thread(t1);
		 Thread thread2 = new Thread(t2);
		 
		 thread1.start();
		 thread2.start();
		 
		 System.out.println("main end!!!");
		 
		 
	}
}
