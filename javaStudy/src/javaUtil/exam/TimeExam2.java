package javaUtil.exam;

import java.time.LocalDateTime;
import java.time.Month;


public class TimeExam2{
  public static void main(String[] args){
    //������ ��������� �����(��. 1���̸� JANUARY, 2���̸� FEBRUARY) ����ϼ���
	  
	  LocalDateTime timePoint = LocalDateTime.now();
	  System.out.println(timePoint);

	  Month month = timePoint.getMonth();
	  System.out.println(month);
	  
  }
}
