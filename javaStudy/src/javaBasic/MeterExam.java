package javaBasic;

//�Ʒ��� ������ ���� �ڵ��Դϴ�. �������� ������.
public class MeterExam {
	public static void main(String[]args){
		Taxi taxi = new Taxi();
		boolean a = Meter.class.isInstance(taxi);
		
		if(a!=true){
			System.out.println("TaxiŬ������ Meter�������̽��� �����ؾ� �մϴ�.");
		}
		else if(taxi.stop(200)!=400){
			System.out.println("stop(200)�� ���� 400�̾�� �մϴ�.");
		}
		else{
			System.out.println("�����Դϴ�. [����]�� ��������.");
		}
		
		//taxi.BASE_FARE = 2500;
	}
}