package javaUtil.exam;

import java.util.Calendar;

public class CalendarExam {

//	ate�� ������ �ذ��ϰ� ������ ���� CalendarŬ����
//	Calendar Ŭ���� ���� ���
//	CalendarŬ������ �߻�Ŭ�����̴�.
//	CalendarŬ������ ���� �ν��Ͻ��� �����Ϸ��� Calendar�� ������ �ִ� Ŭ���� �޼ҵ� getInstnace()�� ����ؾ� �Ѵ�.
//	getInstance()�޼ҵ带 ȣ���ϸ� ���������� java.util.GregorianCalendar �ν��Ͻ��� ���������Ѵ�.
//	GregorianCalendar�� Calendar�� �ڽ� Ŭ�����̴�.
//	    Calendar cal = Calendar.getInstance();
//	Calendar Ŭ������ �̿��ؼ� ���� ��¥�� �ð��� ���� ������ �˾Ƴ��� ���
//	Calendar�� ���� ��¥�� �ð��� ���� ������ �����ϴ�.
//	Calendar�� ������ �ִ� get�޼ҵ忡 Calendar�� ����� � ���� �־��ִ��Ŀ� ���� �ٸ� ���� ������ �˴ϴ�.
//	        int yyyy = cal.get(Calendar.YEAR);
//	        int month = cal.get(Calendar.MONTH) + 1; // ���� 0���� �����մϴ�.
//	        int date = cal.get(Calendar.DATE);
//	        int hour = cal.get(Calendar.HOUR_OF_DAY);
//	        int minute = cal.get(Calendar.MINUTE);
//	Calendar Ŭ������ �̿��ؼ� ���ϴ� ��¥�� �ð��� ���� ���� ������ ���
//	Calendar�� ������ �ִ� add�޼ҵ带 �̿��ϸ� ���� ���� ��¥�� ���� ��¥�� ���� �� �ֽ��ϴ�.
//	���� Į������ �ð��� 5�ð� ���ϴ� ���. 5�� -5�� �����ϸ� 5�ð� ���� ���� �� �ְ� �˴ϴ�.
//	        cal.add(Calendar.HOUR, 5);
	
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(Calendar.HOUR, 5);
		System.out.println(cal.get(Calendar.HOUR));

	}

}
