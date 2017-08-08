package javaBasic;

public class ExceptionTrhowExamExam {
	public static void main(String[]args)  {
		ExceptionThrowExam ex = new ExceptionThrowExam();
		
			int[] array = new int[48];
			try {
				ex.get50thItem(array);
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				e.toString();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
