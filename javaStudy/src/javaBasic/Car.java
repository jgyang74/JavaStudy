package javaBasic;

//자동차는 자동차 이름, 자동차 번호를 가지고 있고, 
//자동차는 달리고 멈추는 기능이 있다. 여기에서 가지고 있는 것을 속성이라고 한다. 
//자바에서는 이러한 속성을 필드(Field)라는 용어로 사용한다.

//생성자
//모든 클래스는 인스턴스화 될때 생성자를 사용한다.
//생성자의 특징
//생성자는 리턴타입이 없다.
//생성자를 프로그래머가 만들지 않으면 매개변수가 없는 생성자가 컴파일할 때 자동으로 만들어진다.
//매개변수가 없는 생성자를 기본생성자라고 한다.
//생성자를 하나라도 프로그래머가 만들었다면 기본생성자는 자동으로 만들어지지 않는다.
//생성자의 역할
//생성자가 하는 일은 객체가 될 때 필드를 초기화 하는 역할을 수행한다.
//자동차가 객체가 될때 반드시 이름을 가지도록 하려면,Car클래스를 다음과 같이 만들어야 한다.

//public Car(String n){
//    name = n;
//}

public class Car {
	   String name;    
       int number;
       
       public Car(String name){
           this.name = name;
       }
       
       public Car() {
    	   this("no name",0);
    	 //this괄호 열고로 시작하면 자신의 생성자를 호출하는 것이다.
    	 //자기 자신의 생성자를 호출함으로써 비슷한 코드가 중복되서 나오는 것을 방지할 수 있다.
       }
       
       public Car(String name, int number) {
    	   this.name = name;
    	   this.number = number;
    	   
       }
}

