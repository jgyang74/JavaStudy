package javaBasic;

//�߻� Ŭ������ ��ü������ ���� Ŭ������ �ǹ��Ѵ�. ������, Ÿ���� ��ü���� ���� ��Ī�ϴµ� ��, ������ ���� ���� ��ü������ �ʴ�.
//�̷� ���� ������ Ŭ������ �߻� Ŭ������� �Ѵ�.
//�߻� Ŭ���� �����ϱ�
//�߻� Ŭ������ Ŭ���� �տ� abstract Ű���带 �̿��ؼ� �����Ѵ�.
//�߻� Ŭ������ �̿ϼ��� �߻� �޼ҵ带 ������ �� �ִ�.
//�߻� �޼ҵ��, ������ ���� �޼ҵ� �̴�. �� ������ ���� ���� �޼ҵ��̴�.
//�߻� �޼ҵ�� ���� Ÿ�� �տ� abstract��� Ű���带 �ٿ��� �Ѵ�.
//�߻� �޼ҵ�� �ν��Ͻ��� ������ �� ����.
//    public abstract class Bird{
//        public abstract void sing();
//
//        public void fly(){
//            System.out.println("����.");
//        }
//    }
//�߻� Ŭ������ ��ӹ޴� Ŭ���� �����ϱ�
//�߻� Ŭ������ ��ӹ��� Ŭ������ �߻� Ŭ������ ���� �ִ� �߻� �޼ҵ带 �ݵ�� �����ؾ� �Ѵ�.
//�߻� Ŭ������ ��ӹް�, �߻� Ŭ������ ���� �ִ� �߻� �޼ҵ带 �������� ������ �ش� Ŭ������ �߻� Ŭ������ �ȴ�.
//    public class Duck extends Bird{
//        @Override
//        public void sing() {
//            System.out.println("�в�!!");
//        }
//    }
//����ϱ�
//Bird�� �߻� Ŭ���� �̹Ƿ� ��ü�� ������ �� ����.
//    public class DuckExam { 
//        public static void main(String[] args) {
//            Duck duck = new Duck();
//            duck.sing();
//            duck.fly();
//
//            //Bird b = new Bird();
//        }   
//    }


public abstract class Bird {
	public abstract void sing();
	public void fly() {
		System.out.println("fly!!!");
	}
}
