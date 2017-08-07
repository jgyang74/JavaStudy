package javaBasic;

//오버라이딩이란 부모가 가지고 있는 메소드와 똑같은 모양의 메소드를 자식이 가지고 있는 것이다. 즉 오버라이딩이란 메소드를 재정의 하는 것이다.
//메소드 오버라이딩
//Car 클래스를 상속받은 Bus 클래스는 부모클래스가 가진고 있는 run() 메소드를 잘 사용한다.
//    //run 메소드를 가지고 있는  Car클래스 
//    public class Car{
//        public void run(){
//            System.out.println("Car의 run메소드");
//        }
//    }
//
//    //Car 를 상속받는 Bus 클래스 
//    public class Bus extends Car{
//
//    }
//
//    public class BusExam{
//        public static void main(String args[]){
//            Bus bus = new Bus();
//            bus.run();  //Car의 run메소드가 실행된다. 
//        }
//    }
//Bus클래스에 부모가 가지고 있는 메소드와 모양이 같은 메소드를 선언
//    public class Bus extends Car{
//        public void run(){
//            System.out.println("Bus의 run메소드");
//        }
//    }
//
//    public class BusExam{
//        public static void main(String args[]){
//            Bus bus = new Bus();
//            bus.run();  //Bus run메소드가 실행된다. 
//        }
//    }
//BusExam을 실행해 보도록 하겠습니다. "Bus의 run메소드"가 출력된다.
//메소드를 오버라이드 하면, 항상 자식클래스에서 정의된 메소드가 호출된다.
//오버라이딩 한다고 해서 부모의 메소드가 사라지는 것은 아니다.
//super 키워드를 이용하면, 부모의 메소드를 호출 할 수 있다.
//    public class Bus extends Car{
//        public void run(){
//            **super.run();**  // 부모의  run()메소드를 호출 
//            System.out.println("Bus의 run메소드");
//        }
//    }

public class Bus extends Car {
	
		public void bangbang() {
			System.out.println("bangbang!!");
		}
		
		public void run() {
			super.run();
			System.out.println("Bus run method");
		}
}
