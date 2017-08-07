package javaBasic;

//class가 인스턴스화 될때 생성자가 실행되면서 객체의 초기화를 한다. 그 때 자신의 생성자만 실행이 되는것이 아니고, 부모의 생성자부터 실행된다.
//부모 생성자
//    public class Car{
//        public Car(){
//            System.out.println("Car의 기본생성자입니다.");
//        }
//    }
//
//    public class Bus extends Car{
//        public Bus(){
//            System.out.println("Bus의 기본생성자입니다.");
//        }
//
//    }
//생성자 테스트
//    public class BusExam{
//        public static void main(String args[]){
//            Bus b = new Bus();
//        }
//    }
//결과
//Car의 기본생성자입니다. Bus의 기본생성자입니다.
//
//new 연산자로 Bus객체를 생성하면, Bus객체가 메모리에 올라갈때 부모인 Car도 함께 메모리에 올라간다.
//생성자는 객체를 초기화 하는 일을한다.
//생성자가 호출될 때 자동으로 부모의 생성자가 호출되면서 부모객체를 초기화 하게된다.
//super
//자신을 가리키는 키워드가 this 라면, 부모들 가리키는 키워드는 super
//super() 는 부모의 생성자를 의미한다.
//부모의 생성자를 임의로 호출하지 않으면, 부모 class의 기본 생성자가 자동으로 호출된다.
//아래 예제처럼 호출해보면 위에서 super()를 호출하지 않을때와 결과가 같다.
//    public Bus(){
//        super();
//        System.out.println("Bus의 기본생성자입니다.");
//    }
//부모의 기본생성자가 아닌 다른 생성자를 호출하는 방법
//클래스는 기본 생성자가 없는 경우도 존재한다.
//    public class Car{
//        public Car(String name){
//            System.out.println(name + " 을 받아들이는 생성자입니다.");
//        }
//    }
//Car class가 위 처럼 수정되면, Bus생성자에서 컴파일 오류가 발생한다.
//부모가 기본생성자가 없기 때문에 컴파일 오류가 발생하게 되는 것이다.
//이런 문제를 해결하려면 자식 클래스의 생성자에서 직접 부모의 생성자를 호출해야 합니다.
//    public Bus(){
//        super("소방차"); // 문자열을 매개변수로 받는 부모 생성자를 호출하였다.
//        System.out.println("Bus의 기본생성자입니다.");
//    }
//super 키워드는 자식에서 부모의 메소드나 필드를 사용할 때도 사용합니다.


public class TruckExam {

	public static void main(String[] args) {
		Truck truck = new Truck();
		
		
	}

}
