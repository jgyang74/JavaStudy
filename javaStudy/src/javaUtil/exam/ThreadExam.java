package javaUtil.exam;

//
//Thread Ŭ������ ��ӹ��� MyThread1�� ����ϴ� Ŭ����
//Thread�� ��� �޾����Ƿ� MyThread1�� Thread �̴�.
//�����带 �����ϰ�, Thread Ŭ������ ������ �ִ� start() �޼ҵ带 ȣ�� �Ѵ�.

public class ThreadExam {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		
		t1.start();
		t2.start();
		
		System.out.println("main end!!!!");
		
	}
}	
