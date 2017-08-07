package javaUtil.exam;

//wait�� notify�� ����ȭ��(synchronized) ��Ͼȿ��� ����ؾ� �Ѵ�. wait�� ������ �Ǹ� �ش� ������� �ش� ��ü�� ����͸� ���� ���� ������ ������ �ִٸ� ����͸� ���� ������ ���� ����Ѵ�.

public class ThreadB extends Thread {
	
	// �ش� �����尡 ����Ǹ� �ڱ� �ڽ��� ����͸� ���� ȹ��
    // 5�� �ݺ��ϸ鼭 0.5�ʾ� ���鼭 total�� ���� ����
    // ���Ŀ� notify()�޼ҵ带 ȣ���Ͽ� wiat�ϰ� �ִ� �����带 ���� 
	
	int total;
	
	public void run() {
		synchronized (this) {
			for(int i=0;i<5;i++){
				System.out.println(i+"�� ���մϴ�.");
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
