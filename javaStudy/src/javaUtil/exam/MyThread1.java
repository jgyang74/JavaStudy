package javaUtil.exam;


//�ڹٿ��� Thread�� ����� ����� ũ�� Thread Ŭ������ ��ӹ޴� ����� Runnable�������̽��� �����ϴ� ����� �ִ�.
//Thread�� ��� �޾Ƽ� �����带 �����ϴ� ���
//java.lang.ThreadŬ������ ��ӹ޴´�. �׸��� Thread�� ������ �ִ� run()�޼ҵ带 �������̵��Ѵ�.
//10�� �ݺ��ϸ鼭 str�� ����ϴ�.


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
