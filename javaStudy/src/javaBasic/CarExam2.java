package javaBasic;

//this
//this�� ���� ��ü, �ڱ� �ڽ��� ��Ÿ����.
//this �� ���
//    public class Car{
//        String name;
//        int number;
//
//        public Car(String n){
//            name = n;
//        }
//    }
//CarŬ������ ������ �Ű������� �̸��� n �̴�. n �̶�� �������� ������ �ǹ��ϴ��� ���� �˼� ����.
//n ���� ���� ���ٴ� name ���� ����ϴ� ���� ����.
//    public Car(String name){
//        name = name;
//    }
//'name=name' �̶�� �ڵ带 �ٲٸ�, ������ ����� ������ �켱 ����ϱ� ������ 'name=name'�̶�� �ڵ�� �Ű������� name�� ���� �Ű����� name�� �����϶�� �ǹ̰� �ȴ�.
//��, �ʵ�� �ٲ��� �ʽ��ϴ�. �̷� ��� �ʵ��� ���� �����Ϸ��� JVM���� �˷��ֱ� ���ؼ� thisŰ���带 ����ؾ� �Ѵ�.
//    public Car(String name){
//        this.name = name;
//    }
//���� this.name�� �ʵ� name�� ���ϰ� =(����) ���� name�� �Ű������� �ǹ��Ѵ�.
//�� �Ű������� ���� �ʵ忡 �����϶�� �ǹ̰� �ȴ�.
//Ŭ���� �ȿ��� �ڱ� �ڽ��� ������ �ִ� �޼ҵ带 ����� ���� this.�޼ҵ��()���� ȣ���� �� �ִ�.

public class CarExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("AAA");
 		Car c2 = new Car("BBB");
 		
 		System.out.println(c2.name);
	}

}
