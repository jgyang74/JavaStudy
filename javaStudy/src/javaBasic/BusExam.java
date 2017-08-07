package javaBasic;

//상속이란? 부모가 가진것을 자식에게 물려주는것을 의미한다.
//노트북은 컴퓨터의 한 종류다.
//침대는 가구의 한 종류다. 혹은 침대는 가구다.
//소방차는 자동차다.
//이렇게 말할 수 있는 관계를 is a 관계 혹은 kind of 관계라고 한다.
//
//Car 를 상속받은 Bus 를 class로 표현하는 방법
//    public class Car{
//
//    }
//
//    public class Bus extends Car{
//
//    }
//자바는 클래스 이름 뒤에 extends 키워드를 적고 부모클래스 이름을 적게 되면 부모 클래스가 가지고 있는 것을 상속받을 수 있게 된다.
//상속이란 부모가 가지고 있는 것을 자식이 물려받는 것을 말한다. 즉, 부모가 가지고 있는 것을 자식이 사용할 수 있게 된다.
//부모클래스에 메소드 추가하기
//Car에 run()메소드를 추가
//    public class Car{
//        public void run(){
//            System.out.println("달리다.");
//        }
//    }
//Car를 상속받은 Bus 사용
//    public class BusExam{
//        public static void main(String args[]){
//            Bus bus = new Bus();
//            bus.run();  
//            //Bus class 는 아무런 코드를 가지지 않는다. 그럼에도 run 이라는 메소드를 사용하는데 문제가 발생되지 않는다. 
//        }   
//    }
//Bus에 메소드 추가
//    public class Bus extends Car{
//        public void ppangppang(){
//            System.out.println("빵빵");
//        }       
//    }
//Bus는 Car에서 물려받은 run메소드와 ppangppang메소드를 사용할 수 있게 된다.
//부모가 가지고 있는 메소드외에 추가로 메소드를 선언하는 것을 확장하였다고 표현한다.

public class BusExam {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		
//		bus.bangbang();
//		
//		Car car = new Car();
//		car.run();
		
		Car c = new Bus();
		c.run();
		// c.bangbang(); //부모타입으로 자식객체를 참조하게 되면 부모가 가지고 있는 메소드만 사용할 수 있다. 
		//자식객체가 가지고 있는 메소드나 속성을 사용하고 싶다면 형변환 해야 한다.
		Bus bus2 = (Bus)c;
		
		bus2.bangbang();
		

	}

}

//클래스 형변환
//부모타입으로 자식객체를 참조하게 되면 부모가 가지고 있는 메소드만 사용할 수 있다. 
//자식객체가 가지고 있는 메소드나 속성을 사용하고 싶다면 형변환 해야 한다.
//형변환
//    public class Car{
//        public void run(){
//            System.out.println("Car의 run메소드");
//        }
//    }
//
//    public class Bus extends Car{
//        public void ppangppang(){
//            System.out.println("빵빵.");
//        }   
//    }
//상속관계란 is a 관계라고 말했었습니다. "Bus는 Car다." 라는 관계가 성립되는 것이죠.
//현실에서도 우리는 버스를 가리키면서 차다. 라고 말하곤 합니다.
//
//부모타입으로 자식객체를 참조할 수 있다.
//부모타입으로 자식객체를 참조하게 되면 부모가 가지고 있는 메소드만 사용할 수 있다.
//    public class BusExam{
//        public static void main(String args[]){
//            Car car = new Bus();
//            car.run();
//            car.ppangppang(); // 컴파일 오류 발생
//        }
//    }
//ppangppang()메소드를 호출하고 싶다면 Bus타입의 참조변수로 참조해야 한다.
//    public class BusExam{
//        public static void main(String args[]){
//            Car car = new Bus();
//            car.run();
//            //car.ppangppang(); // 컴파일 오류 발생
//
//            Bus bus = (Bus)car;  //부모타입을 자식타입으로 형변환 
//            bus.run();
//            bus.ppangppang();
//        }
//    }
//객체들 끼리도 형변환이 가능하다. 단 상속관계에 있었을 때만 가능하다.
//부모타입으로 자식타입의 객체를 참조할 때는 묵시적으로 형변환이 일어난다.
//부모타입의 객체를 자식타입으로 참조하게 할때는 명시적으로 형변환 해주어 한다.
//단 이렇게 형변환 할때에는 부모가 참조하는 인스턴스가 형변환 하려는 자식타입일 때만 가능하다.