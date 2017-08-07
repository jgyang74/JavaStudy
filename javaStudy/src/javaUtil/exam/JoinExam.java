package javaUtil.exam;

public class JoinExam {

	public static void main(String[] args) {
		MyThread5 thread = new MyThread5();
		
		thread.start();
		System.out.println("wait a termination of thread");
		
	
			try {
				thread.join();    //해당 쓰레드를 실행하고, 해당쓰레드가 종료될때까지 기다린 후, 내용을 출력하는 JoinExam클래스
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
		System.out.println("Thread end!!!");
		

	}

}
