package javaUtil.exam;


//자바에서 Thread를 만드는 방법은 크게 Thread 클래스를 상속받는 방법과 Runnable인터페이스를 구현하는 방법이 있다.
//Thread를 상속 받아서 쓰레드를 생성하는 방법
//java.lang.Thread클래스를 상속받는다. 그리고 Thread가 가지고 있는 run()메소드를 오버라이딩한다.
//10번 반복하면서 str을 찍습니다.


public class MyThread1 extends Thread {

	String str;
	public MyThread1(String str)
	{
		this.str = str;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(str);
			
			try {
				Thread.sleep((int)(Math.random()*1000)) ;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
