package javaBasic;

//�� ������
//�������ڴ� ����(&&,&) ����(||,|), ��Ÿ�� ���� () ������(!) ������ �����Ѵ�. �� �������� �ǿ����ڴ� �� Ÿ�Ը� ����� �� �ִ�. ����� �Ҹ����̴�.
//    boolean b1 = true;
//    boolean b2 = false;
//    boolean b3 = true;
//���� (&&, &) - �ǿ����ڰ� ��� true�� ��쿡�� ���� ����� true �̴�.
//
//System.out.println(b1 && b2); -> b2�� false �̹Ƿ� ����� false
//System.out.println(b1 && b3); -> b1�� b2 ��� true �̹Ƿ� ����� true
//���� (||,|) - �ǿ����� �� �ϳ��� true�̸� ���� ����� true �̴�.
//
//System.out.println(b1 || b2); -> b1 �� true�̹Ƿ� ����� true �̴�.
//��Ÿ�� ���� (^) -> �ǿ����ڰ� ���� �ٸ� ���� ��츸 ���� ����� true �̴�.
//
//System.out.println(b1 ^ b2); -> b1�� true, b2�� false�� ���� �ٸ��Ƿ� ����� true �̴�.
//System.out.println(b1 ^ b3); -> b1, b3 ��� true�� ���� ����. �����false �̴�
//�� ���� (!) -> �ǿ������� ������ �ٲ۴�. true�� false�� false�� true�� �ٲ۴�.
//
//System.out.println(!b1); -> b1 �� true �̹Ƿ� ����� false �̴�.
//System.out.println(!b2); -> b1 �� false �̹Ƿ� ����� true �̴�.

public class OperatorExam5 {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b2);
		
		int score = 88;
		if(score <=100 && score>=70) {
			System.out.println("Success");
		}else {
			System.out.println("fail");
		}
		
		System.out.println(b1 ^ b3);
		System.out.println(b1 ^ b2);
		System.out.println(!b1);
		
	}
}
