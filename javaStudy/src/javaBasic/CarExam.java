package javaBasic;

//Ŭ����
//�ڹٴ� ��ü�� ����� ���� �ݵ�� Ŭ������ ���� ������ �Ѵ�. Ŭ������ ��ü�� ����� ���� ������ Ʋ�̴�.
//�ؾ�� ��ü���, �ؾ Ʋ�� Ŭ����
//�ڵ��� Ŭ���� ����
//    public class Car{
//
//    }
//Car.java�� ������ �����.
//������ �ϸ� ��Ŭ������ �������Ͽ� ��ũ�� Car��� Ŭ������ �����Ѵ�.
//�ڵ��� Ŭ������ �����Ǿ��ٰ� �ؼ� �ڵ����� ����� ������ �ƴϴ�.
//Car��ü �����ϱ� (�ڵ��� �����)
//    public class CarExam{
//        public static void main(String args[]){
//            Car c1 = new Car();
//            Car c2 = new Car();
//        }
//    }
//new �����ڴ� new������ �ڿ� ������ �����ڸ� �̿��Ͽ� �޸𸮿� ��ü�� ������ ���.
//�޸𸮿� ������� ��ü�� �ν��Ͻ�(instance)��� �Ѵ�.
//�̷��� ������� ��ü�� �����ϴ� ������ c1 , c2 �̴�.
//���� �ڵ尡 ����Ǹ� Car��� ��ü�� 2���� ��������� ������ ��ü�� �����ϴ� c1�� c2������ ����˴ϴ�.

public class CarExam {

	public static void main(String[] args) {
		Car c1 = new Car();  // ������
		Car c2 = new Car();  // ������
//		Car c2 = new Car("AAA");
//		Car c3 = new Car("BBB");
		
		
	    c1.name = "�ҹ���";  //c1�� �����ϴ� ��ü�� name�� �ҹ����� ���� 
	    c1.number = 1234;   // c1.number = 1234�� c1�� �����ϴ� ��ü�� number�� 1234 �� ���� 

	    c2.name = "������";  //c2�� ����Ű�� ��ü��name�� �������� ����
	    c2.number = 1004;  //c2�� ����Ű�� ��ü�� number�� 1004�� ����


	    System.out.println(c1.name);  //�ֿܼ� c1�� �����ϴ� ��ü�� name �� ����մϴ�. 
	    System.out.println(c1.number); //�ֿܼ� c1�� �����ϴ� ��ü�� number �� ����մϴ�. 

	    String name = c2.name;   //c2�� �����ϴ� ��ü�� name �� String Ÿ�� ���� name �� �����ϰ� �մϴ�.
	}

}
