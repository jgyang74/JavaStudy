package javaBasic;

//�������̵��̶� �θ� ������ �ִ� �޼ҵ�� �Ȱ��� ����� �޼ҵ带 �ڽ��� ������ �ִ� ���̴�. �� �������̵��̶� �޼ҵ带 ������ �ϴ� ���̴�.
//�޼ҵ� �������̵�
//Car Ŭ������ ��ӹ��� Bus Ŭ������ �θ�Ŭ������ ������ �ִ� run() �޼ҵ带 �� ����Ѵ�.
//    //run �޼ҵ带 ������ �ִ�  CarŬ���� 
//    public class Car{
//        public void run(){
//            System.out.println("Car�� run�޼ҵ�");
//        }
//    }
//
//    //Car �� ��ӹ޴� Bus Ŭ���� 
//    public class Bus extends Car{
//
//    }
//
//    public class BusExam{
//        public static void main(String args[]){
//            Bus bus = new Bus();
//            bus.run();  //Car�� run�޼ҵ尡 ����ȴ�. 
//        }
//    }
//BusŬ������ �θ� ������ �ִ� �޼ҵ�� ����� ���� �޼ҵ带 ����
//    public class Bus extends Car{
//        public void run(){
//            System.out.println("Bus�� run�޼ҵ�");
//        }
//    }
//
//    public class BusExam{
//        public static void main(String args[]){
//            Bus bus = new Bus();
//            bus.run();  //Bus run�޼ҵ尡 ����ȴ�. 
//        }
//    }
//BusExam�� ������ ������ �ϰڽ��ϴ�. "Bus�� run�޼ҵ�"�� ��µȴ�.
//�޼ҵ带 �������̵� �ϸ�, �׻� �ڽ�Ŭ�������� ���ǵ� �޼ҵ尡 ȣ��ȴ�.
//�������̵� �Ѵٰ� �ؼ� �θ��� �޼ҵ尡 ������� ���� �ƴϴ�.
//super Ű���带 �̿��ϸ�, �θ��� �޼ҵ带 ȣ�� �� �� �ִ�.
//    public class Bus extends Car{
//        public void run(){
//            **super.run();**  // �θ���  run()�޼ҵ带 ȣ�� 
//            System.out.println("Bus�� run�޼ҵ�");
//        }
//    }

public class Bus extends Car {
	
		public void bangbang() {
			System.out.println("bangbang!!");
		}
		
		public void run() {
			super.run();
			System.out.println("Bus run method");
		}
}
