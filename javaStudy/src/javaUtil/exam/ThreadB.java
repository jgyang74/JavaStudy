package javaUtil.exam;

//wait와 notify는 동기화된(synchronized) 블록안에서 사용해야 한다. wait를 만나게 되면 해당 쓰레드는 해당 객체의 모니터링 락에 대한 권한을 가지고 있다면 모니터링 락의 권한을 놓고 대기한다.

public class ThreadB extends Thread {
	
	// 해당 쓰레드가 실행되면 자기 자신의 모니터링 락을 획득
    // 5번 반복하면서 0.5초씩 쉬면서 total에 값을 누적
    // 그후에 notify()메소드를 호출하여 wiat하고 있는 쓰레드를 깨움 
	
	int total;
	
	public void run() {
		synchronized (this) {
			for(int i=0;i<5;i++){
				System.out.println(i+"를 더합니다.");
				total += 1;
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			notify();
		}
	}
}
