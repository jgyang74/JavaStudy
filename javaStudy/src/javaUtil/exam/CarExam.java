package javaUtil.exam;

import java.util.*;
public class CarExam{
  public static void main(String[] args){
    //Car객체를 만들어서 cars에 넣습니다.
    List<Car> cars = new ArrayList<>();
    cars.add( new Car("작은차",2,800,3) );
    cars.add( new Car("봉고차",12,1500,8) );
    cars.add( new Car("중간차",5,2200,0) );
    cars.add( new Car("비싼차",5,3500,1) );

    //같은 검색조건에 대해 람다를 이용하면 메소드 지정도 필요 없으므로 더 간결하게 표현할 수 있습니다.
    CarExam carExam = new CarExam();
    carExam.printCar(cars, 
      //인터페이스 CheckCar의 test메소드에 대응하는 람다를 만듭니다.
      (Car car) -> { return car.capacity >= 4 && car.price < 2500; }
    );
    
    
    
    printCarCheaperThan(cars, 2000);
    
    printCar(cars, new CheckCarForBigAndNotExpensive()); 
//    이번에는 조건이 더 복잡한 경우입니다. 
//    내부클래스를 이용해서 CheckCar라는 인터페이스를 만들고, 그걸 구현하는 CheckCarForBigAndNotExpensive클래스를 만들어서 
//    4명 이상이 탈 수 있고, 가격이 2500이하인 차를 검색합니다.
    
    
    printCar(cars, 
    	      //인터페이스 CheckCar를 구현하는 익명클래스를 만듭니다.
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

	  //내부클래스를 만들어서 사용합니다.
	  static class CheckCarForBigAndNotExpensive implements CheckCar{
	  	public boolean test(Car car){
	  		return car.capacity >= 4 && car.price < 2500;
	  	}
	  }

}