package javaUtil.exam;

//공유객체가 가진 메소드를 동시에 호출 되지 않도록 하는 방법
//메소드 앞에 synchronized 를 붙힌다.
//여러개의 Thread들이 공유객체의 메소드를 사용할 때 메소드에 synchronized가 붙어 있을 경우 먼저 호출한 메소드가 객체의 사용권(Monitoring Lock)을 얻는다.

//메소드 앞에 synchronized 를 붙혀서 실행해 보면, 메소드 하나가 모두 실행된 후에 다음 메소드가 실행된다.
//해당 모니터링 락은 메소드 실행이 종료되거나, wait()와 같은 메소드를 만나기 전까지 유지된다.
//다른 쓰레드들은 모니터링 락을 놓을때까지 대기한다.
//synchronized를 붙히지 않은 메소드는 다른 쓰레드들이 synchronized메소드를 실행하면서 모니터링 락을 획득했다 하더라도, 그것과 상관없이 실행된다.
//synchronized를 메소드에 붙혀서 사용 할 경우, 메소드의 코드가 길어지면, 마지막에 대기하는 쓰레드가 너무 오래 기다리는것을 막기위해서 메소드에 synchronized를 붙이지 않고, 
//문제가 있을것 같은 부분만 synchronized블록을 사용한다.

//Thread, Thread Status
//쓰레드가 3개가 있다면 JVM은 시간을 잘게 쪼갠 후에 한번은 쓰레드1을, 한번은 쓰레드 2를, 한번은 쓰레드 3을 실행합니다. 이것에 빠르게 일어나다 보니 쓰레드가 모두 동작하는 것처럼 보이는 것이다.
//쓰레드는 실행가능상태인 Runnable과 실행상태인 Running상태로 나뉜다.
//실행되는 쓰레드 안에서 Thread.sleep()이나 Object가 가지고 있는 wait()메소드가 호출이 되면 쓰레드는 블록상태가 된다.
//Thread.sleep()은 특정시간이 지나면 자신 스스로 블록상태에서 빠져나와 Runnable이나 Running상태가 된다.
//Object가 가지고 있는 wait()메소드는 다른 쓰레드가 notify()나 notifyAll()메소드를 호출하기 전에는 블록상태에서 해제되지 않는다.
//wait()메소드는 호출이 되면 모니터링 락을 놓게 된다. 그래서 대기중인 다른 메소드가 실행한다.
//쓰레드의 run메소드가 종료되면, 쓰레드는 종료된다. 즉 Dead상태가 된다.
//Thread의 yeild메소드가 호출되면 해당 쓰레드는 다른 쓰레드에게 자원을 양보하게 된다.
//Thread가 가지고 있는 join메소드를 호출하게 되면 해당 쓰레드가 종료될 때까지 대기하게 된다.

public class MusicBox {
	
	public synchronized void playMusicA() {
		for(int i=0;i<10;i++) {
			System.out.println("music A!!!");
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void playMusicB() {
		for(int i=0;i<10;i++) {
			System.out.println("music B!!!");
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void playMusicC() {
		for(int i=0;i<10;i++) {
			
			synchronized (this) {
				System.out.println("music C!!!");
			}
						
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
