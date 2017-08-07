package javaUtil.exam;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarExam2 {

	public String hundredDaysAfter(){
	    //���ú��� 100�� ���� ��¥�� "2016��1��1��"�� �������� return�ϼ���.
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy'��'MM'��'dd'��'");
		
		System.out.println(ft.format(cal.getTime()));
		
		System.out.println(cal.getTime());
		
		cal.add(Calendar.DAY_OF_MONTH, 100);
		
		System.out.println(cal.getTime());
		
		System.out.println(ft.format(cal.getTime()));
		
		String dateStr = ft.format(cal.getTime());
		
		return dateStr;
		

	  }
	
	
	public static void main(String[] args) {
		
		CalendarExam2 cal2 = new CalendarExam2();
		
		String str = cal2.hundredDaysAfter();
		
		System.out.println(str);
		
	}

}





