package javaUtil.exam;


//Runable �������̽��� ������ MyThread2 ����ϴ� ���
//MyThread2�� Thread�� ��ӹ��� �ʾұ� ������ Thread�� �ƴϴ�.
//Thread�� �����ϰ�, �ش� �����ڿ� MyThread2�� �־ Thread�� �����Ѵ�.
//Thread Ŭ������ ���� start()�޼ҵ带 ȣ���Ѵ�.


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
