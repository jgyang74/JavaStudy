package javaBasic;

//����̶�? �θ� �������� �ڽĿ��� �����ִ°��� �ǹ��Ѵ�.
//��Ʈ���� ��ǻ���� �� ������.
//ħ��� ������ �� ������. Ȥ�� ħ��� ������.
//�ҹ����� �ڵ�����.
//�̷��� ���� �� �ִ� ���踦 is a ���� Ȥ�� kind of ������ �Ѵ�.
//
//Car �� ��ӹ��� Bus �� class�� ǥ���ϴ� ���
//    public class Car{
//
//    }
//
//    public class Bus extends Car{
//
//    }
//�ڹٴ� Ŭ���� �̸� �ڿ� extends Ű���带 ���� �θ�Ŭ���� �̸��� ���� �Ǹ� �θ� Ŭ������ ������ �ִ� ���� ��ӹ��� �� �ְ� �ȴ�.
//����̶� �θ� ������ �ִ� ���� �ڽ��� �����޴� ���� ���Ѵ�. ��, �θ� ������ �ִ� ���� �ڽ��� ����� �� �ְ� �ȴ�.
//�θ�Ŭ������ �޼ҵ� �߰��ϱ�
//Car�� run()�޼ҵ带 �߰�
//    public class Car{
//        public void run(){
//            System.out.println("�޸���.");
//        }
//    }
//Car�� ��ӹ��� Bus ���
//    public class BusExam{
//        public static void main(String args[]){
//            Bus bus = new Bus();
//            bus.run();  
//            //Bus class �� �ƹ��� �ڵ带 ������ �ʴ´�. �׷����� run �̶�� �޼ҵ带 ����ϴµ� ������ �߻����� �ʴ´�. 
//        }   
//    }
//Bus�� �޼ҵ� �߰�
//    public class Bus extends Car{
//        public void ppangppang(){
//            System.out.println("����");
//        }       
//    }
//Bus�� Car���� �������� run�޼ҵ�� ppangppang�޼ҵ带 ����� �� �ְ� �ȴ�.
//�θ� ������ �ִ� �޼ҵ�ܿ� �߰��� �޼ҵ带 �����ϴ� ���� Ȯ���Ͽ��ٰ� ǥ���Ѵ�.

public class BusExam {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		
//		bus.bangbang();
//		
//		Car car = new Car();
//		car.run();
		
		Car c = new Bus();
		c.run();
		// c.bangbang(); //�θ�Ÿ������ �ڽİ�ü�� �����ϰ� �Ǹ� �θ� ������ �ִ� �޼ҵ常 ����� �� �ִ�. 
		//�ڽİ�ü�� ������ �ִ� �޼ҵ峪 �Ӽ��� ����ϰ� �ʹٸ� ����ȯ �ؾ� �Ѵ�.
		Bus bus2 = (Bus)c;
		
		bus2.bangbang();
		

	}

}

//Ŭ���� ����ȯ
//�θ�Ÿ������ �ڽİ�ü�� �����ϰ� �Ǹ� �θ� ������ �ִ� �޼ҵ常 ����� �� �ִ�. 
//�ڽİ�ü�� ������ �ִ� �޼ҵ峪 �Ӽ��� ����ϰ� �ʹٸ� ����ȯ �ؾ� �Ѵ�.
//����ȯ
//    public class Car{
//        public void run(){
//            System.out.println("Car�� run�޼ҵ�");
//        }
//    }
//
//    public class Bus extends Car{
//        public void ppangppang(){
//            System.out.println("����.");
//        }   
//    }
//��Ӱ���� is a ������ ���߾����ϴ�. "Bus�� Car��." ��� ���谡 �����Ǵ� ������.
//���ǿ����� �츮�� ������ ����Ű�鼭 ����. ��� ���ϰ� �մϴ�.
//
//�θ�Ÿ������ �ڽİ�ü�� ������ �� �ִ�.
//�θ�Ÿ������ �ڽİ�ü�� �����ϰ� �Ǹ� �θ� ������ �ִ� �޼ҵ常 ����� �� �ִ�.
//    public class BusExam{
//        public static void main(String args[]){
//            Car car = new Bus();
//            car.run();
//            car.ppangppang(); // ������ ���� �߻�
//        }
//    }
//ppangppang()�޼ҵ带 ȣ���ϰ� �ʹٸ� BusŸ���� ���������� �����ؾ� �Ѵ�.
//    public class BusExam{
//        public static void main(String args[]){
//            Car car = new Bus();
//            car.run();
//            //car.ppangppang(); // ������ ���� �߻�
//
//            Bus bus = (Bus)car;  //�θ�Ÿ���� �ڽ�Ÿ������ ����ȯ 
//            bus.run();
//            bus.ppangppang();
//        }
//    }
//��ü�� ������ ����ȯ�� �����ϴ�. �� ��Ӱ��迡 �־��� ���� �����ϴ�.
//�θ�Ÿ������ �ڽ�Ÿ���� ��ü�� ������ ���� ���������� ����ȯ�� �Ͼ��.
//�θ�Ÿ���� ��ü�� �ڽ�Ÿ������ �����ϰ� �Ҷ��� ��������� ����ȯ ���־� �Ѵ�.
//�� �̷��� ����ȯ �Ҷ����� �θ� �����ϴ� �ν��Ͻ��� ����ȯ �Ϸ��� �ڽ�Ÿ���� ���� �����ϴ�.