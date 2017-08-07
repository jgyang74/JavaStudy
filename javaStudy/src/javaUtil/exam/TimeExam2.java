package javaUtil.exam;

import java.time.LocalDateTime;
import java.time.Month;


public class TimeExam2{
  public static void main(String[] args){
    //지금이 몇월인지를 영어로(예. 1월이면 JANUARY, 2월이면 FEBRUARY) 출력하세요
	  
	  LocalDateTime timePoint = LocalDateTime.now();
	  System.out.println(timePoint);

	  Month month = timePoint.getMonth();
	  System.out.println(month);
	  
  }
}
