package javaBasic;

public class Taxi implements Meter {
	public int BASE_FARE = 3000; // �⺻���(�������̽��� ������ ������ ����� ������ �� �����ϴ�.)  
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("������ �����մϴ�.");

	}

	@Override
	public int stop(int distance) {
		// TODO Auto-generated method stub
		 int fare = BASE_FARE + distance * 2;
		    System.out.println("������ �����մϴ�. ����� " + fare + "�� �Դϴ�.");
		    return fare;
	}

}
