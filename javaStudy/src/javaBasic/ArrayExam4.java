package javaBasic;

public class ArrayExam4 {
	public int sum(int[] param) {
		int[] array = param;
		int sum = 0;
		// array�� ���̸� �� �� ���� int�� �迭�Դϴ�.
		// array���� ������ ����ִٰ� �����ϰ� �� �Ʒ����� sum�� array�� ��� ���� ���ϼ���.

		for(int i=0; i<array.length; i++)
		{
			sum = sum + array[i];
		}
		// �Ʒ��� ��� �򰡸� ���� �ڵ��Դϴ�. �������� ������.
		return sum;
	}
	
	//�Ʒ��� ������ ���� �ڵ��Դϴ�. �������� ������.
	public static void main(String[] args) {
		int[]TestCase = new int[4];
		String str = "";
		int rightResult = 0;
		for(int i=0; i<4; i++){
			TestCase[i] = (int)(Math.random()*100);
			rightResult += TestCase[i];
			str+=(TestCase[i]+",");
		}
		str=str.substring(0,str.length()-1);

		ArrayExam4 exam = new ArrayExam4();
		int Answer = exam.sum(TestCase);
		
		if (Answer==rightResult) {
	  		System.out.println("�����Դϴ�. [����]�� ��������.");
		}
		else{
			System.out.println( str+"�� ���� sum�� ���� Ʋ���ϴ�.");
		}
	}
}

