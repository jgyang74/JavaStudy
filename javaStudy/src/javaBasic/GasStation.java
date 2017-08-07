package javaBasic;

public class GasStation{
	public static void main(String[]args){
		GasStation gasStation = new GasStation(); //gasStation�ν��Ͻ� ����
		Suv suv = new Suv(); //suv �ν��Ͻ� ����
		Truck truck = new Truck(); //truck �ν��Ͻ� ����
		Bus bus = new Bus(); //bus �ν��Ͻ� ����

		//gasStation���� suv�� �⸧�� �ֽ��ϴ�.
		gasStation.fill(suv);

		//gasStation���� truck�� �⸧�� �ֽ��ϴ�.
		gasStation.fill(truck);

		//gasStation���� bus�� �⸧�� �ֽ��ϴ�.
		gasStation.fill(bus);
		
	}

//	public void fill(Suv suv){
//		System.out.println("Suv�� �⸧�� �ֽ��ϴ�.");
//		suv.gas += 10;
//		System.out.println("�⸧�� "+suv.gas+"���� ����ֽ��ϴ�.");
//	}
//
//	public void fill(Truck truck){
//		System.out.println("Truck�� �⸧�� �ֽ��ϴ�.");
//		truck.gas += 10;
//		System.out.println("�⸧�� "+truck.gas+"���� ����ֽ��ϴ�.");
//	}
//
//	public void fill(Bus bus){
//		System.out.println("Bus�� �⸧�� �ֽ��ϴ�.");
//		bus.gas += 10;
//		System.out.println("�⸧�� "+bus.gas+"���� ����ֽ��ϴ�.");
//	}
	

	public void fill(Car car){
		//����. car.getClass().getName()�� car������Ʈ�� ������ � Ŭ���������� �˷��ݴϴ�.
	 	System.out.println(car.getClass().getName()+"�� �⸧�� �ֽ��ϴ�.");

	 	car.gas += 10;
	 	System.out.println("�⸧�� "+car.gas+"���� ����ֽ��ϴ�.");
	}
//	GasStation�ڵ带 ���캸�� 3���� fill�޼ҵ尡 �ֽ��ϴ�. 
//	�Ű������� �޾Ƶ��̴� 3������ �ٸ� ������ ���ؼ� �⸧�� �־��ִ� ������ �ϴ°� ���ε� 3���� �ߺ��� �ڵ尡 ����־ ��ȿ�����ε���.
//	CarŬ������ �ִ� gas��� �Ӽ��� ���������� ����ϹǷ� �̷���� fill�޼ҵ��� �Ű������� Car�� �ϸ� �˴ϴ�.
//	�׷��� Suv,Truck,BusŬ������ CarŬ������ ����ȯ �ǹǷ� �ϳ��� fill�޼ҵ�ε� ���� ������ �� �� �ֽ��ϴ�.
//	GetStationŬ������ ���ǵǾ� �ִ� 3���� fill�޼ҵ带 �����, ���� �Ʒ��� �ּ�ó���Ǿ��ִ� fill�޼ҵ��� �ּ��� ������ ���� ������ ����������.
//	���� �ϳ��� fill�޼ҵ�� ���� ������ �� �� �ֽ��ϴ�.
}
