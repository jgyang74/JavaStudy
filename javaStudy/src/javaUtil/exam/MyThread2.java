package javaUtil.exam;


//자바에서 Thread를 만드는 방법은 크게 Thread 클래스를 상속받는 방법과 Runnable인터페이스를 구현하는 방법이 있다.

//다중상속을 허용하지 않기 때문에 Thread가 필요한 곳에 interface를 통해서 구현하도록 한다.

//자바에서는 두 개의 클래스로부터 상속을 받을 수 없으므로 이미 상속을 받은 클래스가 쓰레드로 동작하려면 Runnable인터페이스를 구현해야 합니다.

//Runnable인터페이스를 구현해서 쓰레드를 만드는 방법
//Runable 인터페이스가 가지고 있는 run()메소드를 구현한다.



public class MyThread2 implements Runnable {
	
	String str;
	
	public MyThread2(String str){
		this.str = str;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(str);
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
