package javaBasic;

//�͸� ��ø Ŭ������ �͸� Ŭ������� ���� ���ϸ�, ���� Ŭ�����̱⵵ �ϴ�.

//������ ������ �߰�ȣ ���� �ݰ� ������, �ش� ������ �̸��� �ش��ϴ� Ŭ������ ��ӹ޴� �̸����� ��ü�� ����ٴ� ���� ���Ѵ�.
//��ȣ �ȿ��� �޼ҵ带 �����ϰų� �޼ҵ带 �߰��� �� �ִ�. �̷��� ������ �̸� ���� ��ü�� action�̶�� ���������� �����ϵ��� �ϰ�,
//exec()�޼ҵ带 ȣ��.
//�͸�Ŭ������ ����� ������ Action�� ��ӹ޴� Ŭ������ ���� �ʿ䰡 ���� ����̴�.
//Action�� ��ӹ޴� Ŭ������ �ش� Ŭ���������� ���ǰ� �ٸ� Ŭ���������� ������ �ʴ� ����̴�.

public class ActionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Action action = new MyAction();
//		action.exec();
		
		Action action = new Action() {
			@Override
			public void exec() {
				System.out.println("exec");
			}
		};
		action.exec();
		
	}
		
		
		
	

}
