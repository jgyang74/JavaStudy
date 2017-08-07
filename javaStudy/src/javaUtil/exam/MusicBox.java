package javaUtil.exam;

//������ü�� ���� �޼ҵ带 ���ÿ� ȣ�� ���� �ʵ��� �ϴ� ���
//�޼ҵ� �տ� synchronized �� ������.
//�������� Thread���� ������ü�� �޼ҵ带 ����� �� �޼ҵ忡 synchronized�� �پ� ���� ��� ���� ȣ���� �޼ҵ尡 ��ü�� ����(Monitoring Lock)�� ��´�.

//�޼ҵ� �տ� synchronized �� ������ ������ ����, �޼ҵ� �ϳ��� ��� ����� �Ŀ� ���� �޼ҵ尡 ����ȴ�.
//�ش� ����͸� ���� �޼ҵ� ������ ����ǰų�, wait()�� ���� �޼ҵ带 ������ ������ �����ȴ�.
//�ٸ� ��������� ����͸� ���� ���������� ����Ѵ�.
//synchronized�� ������ ���� �޼ҵ�� �ٸ� ��������� synchronized�޼ҵ带 �����ϸ鼭 ����͸� ���� ȹ���ߴ� �ϴ���, �װͰ� ������� ����ȴ�.
//synchronized�� �޼ҵ忡 ������ ��� �� ���, �޼ҵ��� �ڵ尡 �������, �������� ����ϴ� �����尡 �ʹ� ���� ��ٸ��°��� �������ؼ� �޼ҵ忡 synchronized�� ������ �ʰ�, 
//������ ������ ���� �κи� synchronized����� ����Ѵ�.

//Thread, Thread Status
//�����尡 3���� �ִٸ� JVM�� �ð��� �߰� �ɰ� �Ŀ� �ѹ��� ������1��, �ѹ��� ������ 2��, �ѹ��� ������ 3�� �����մϴ�. �̰Ϳ� ������ �Ͼ�� ���� �����尡 ��� �����ϴ� ��ó�� ���̴� ���̴�.
//������� ���డ�ɻ����� Runnable�� ��������� Running���·� ������.
//����Ǵ� ������ �ȿ��� Thread.sleep()�̳� Object�� ������ �ִ� wait()�޼ҵ尡 ȣ���� �Ǹ� ������� ��ϻ��°� �ȴ�.
//Thread.sleep()�� Ư���ð��� ������ �ڽ� ������ ��ϻ��¿��� �������� Runnable�̳� Running���°� �ȴ�.
//Object�� ������ �ִ� wait()�޼ҵ�� �ٸ� �����尡 notify()�� notifyAll()�޼ҵ带 ȣ���ϱ� ������ ��ϻ��¿��� �������� �ʴ´�.
//wait()�޼ҵ�� ȣ���� �Ǹ� ����͸� ���� ���� �ȴ�. �׷��� ������� �ٸ� �޼ҵ尡 �����Ѵ�.
//�������� run�޼ҵ尡 ����Ǹ�, ������� ����ȴ�. �� Dead���°� �ȴ�.
//Thread�� yeild�޼ҵ尡 ȣ��Ǹ� �ش� ������� �ٸ� �����忡�� �ڿ��� �纸�ϰ� �ȴ�.
//Thread�� ������ �ִ� join�޼ҵ带 ȣ���ϰ� �Ǹ� �ش� �����尡 ����� ������ ����ϰ� �ȴ�.

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
