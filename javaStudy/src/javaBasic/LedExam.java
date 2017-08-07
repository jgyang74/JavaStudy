package javaBasic;

//인터페이스 사용하는 방법
//인터페이스는 사용할때 해당 인터페이스를 구현하는 클래스에서 implements 키워드를 이용한다.
//  public class LedTV implements TV{
//      public void on(){
//          System.out.println("켜다");
//      }
//      public void off(){
//          System.out.println("끄다");   
//      }
//      public void volume(int value){
//          System.out.println(value + "로 볼륨조정하다.");  
//      }
//      public void channel(int number){
//          System.out.println(number + "로 채널조정하다.");         
//      }
//  }
//인터페이스가 가지고 있는 메소드를 하나라도 구현하지 않는다면 해당 클래스는 추상클래스가 된다.(추상클래스는 인스턴스를 만들 수 없음)
//  public class LedTVExam{
//      public static void main(String args[]){
//          TV tv = new LedTV();
//          tv.on();
//          tv.volume(50);
//          tv.channel(6);
//          tv.off();
//      }
//  }
//참조변수의 타입으로 인터페이스를 사용할 수 있다. 이 경우 인터페이스가 가지고 있는 메소드만 사용할 수 있다.
//만약 TV인터페이스를 구현하는 LcdTV를 만들었다면 위의 코드에서 new LedTV부분만 new LcdTV로 변경해도 똑같이 프로그램이 동작할 것다. 동일한 인터페이스를 구현한다는 것은 클래스 사용법이 같다는 것을 의미한다.
//클래스는 이러한 인터페이스를 여러개 구현할 수 있다.
public class LedExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new LedTV();
		tv.trunOn();
		tv.changeVolume(1);
		tv.changeChannel(9);
		tv.trunOff();
	}

}
