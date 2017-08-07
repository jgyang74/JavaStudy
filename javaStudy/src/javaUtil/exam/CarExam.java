package javaUtil.exam;

import java.util.*;
public class CarExam{
  public static void main(String[] args){
    //Car��ü�� ���� cars�� �ֽ��ϴ�.
    List<Car> cars = new ArrayList<>();
    cars.add( new Car("������",2,800,3) );
    cars.add( new Car("������",12,1500,8) );
    cars.add( new Car("�߰���",5,2200,0) );
    cars.add( new Car("�����",5,3500,1) );

    //���� �˻����ǿ� ���� ���ٸ� �̿��ϸ� �޼ҵ� ������ �ʿ� �����Ƿ� �� �����ϰ� ǥ���� �� �ֽ��ϴ�.
    CarExam carExam = new CarExam();
    carExam.printCar(cars, 
      //�������̽� CheckCar�� test�޼ҵ忡 �����ϴ� ���ٸ� ����ϴ�.
      (Car car) -> { return car.capacity >= 4 && car.price < 2500; }
    );
    
    
    
    printCarCheaperThan(cars, 2000);
    
    printCar(cars, new CheckCarForBigAndNotExpensive()); 
//    �̹����� ������ �� ������ ����Դϴ�. 
//    ����Ŭ������ �̿��ؼ� CheckCar��� �������̽��� �����, �װ� �����ϴ� CheckCarForBigAndNotExpensiveŬ������ ���� 
//    4�� �̻��� Ż �� �ְ�, ������ 2500������ ���� �˻��մϴ�.
    
    
    printCar(cars, 
    	      //�������̽� CheckCar�� �����ϴ� �͸�Ŭ������ ����ϴ�.
    	      new CheckCar(){
    	      public boolean test(Car car){
    	        return car.capacity >= 4 && car.price < 2500;
    	      }
    	    });

    	  
  }

  public static void printCarCheaperThan(List<Car> cars, int price){
    for(Car car : cars){
      if(car.price < price){
        System.out.println(car);
      }
    }
  }
  
  public static void printCar(List<Car> cars, CheckCar tester){
	  	for(Car car : cars){
	  		if (tester.test(car)) {
	  			System.out.println(car);
	  		}
	  	}
	  }

	  interface CheckCar{
	  	boolean test(Car car);
	  }

	  //����Ŭ������ ���� ����մϴ�.
	  static class CheckCarForBigAndNotExpensive implements CheckCar{
	  	public boolean test(Car car){
	  		return car.capacity >= 4 && car.price < 2500;
	  	}
	  }

}