package javaUtil.exam;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarExam2 {

	public String hundredDaysAfter(){
	    //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy'년'MM'월'dd'일'");
		
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





