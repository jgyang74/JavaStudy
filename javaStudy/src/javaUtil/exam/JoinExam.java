package javaUtil.exam;

public class JoinExam {

	public static void main(String[] args) {
		MyThread5 thread = new MyThread5();
		
		thread.start();
		System.out.println("wait a termination of thread");
		
	
			try {
				thread.join();    //�ش� �����带 �����ϰ�, �ش羲���尡 ����ɶ����� ��ٸ� ��, ������ ����ϴ� JoinExamŬ����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
		System.out.println("Thread end!!!");
		

	}

}
