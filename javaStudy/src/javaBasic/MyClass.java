package javaBasic;

//메소드
//필드가 물체의 상태라면, 물체의 행동에 해당하는게 메소드다. car에 이름과 번호가 있기도 하지만, car는 앞으로 전진할수도 있고 후진하는 행동도 할 수 있다.
//메소드는 입력값이 있고, 그 입력값을 받아서 무언가 한 다음 결과를 도출해 내는 수학의 함수와 비슷한 개념이다.
//이때 입력값을 매개변수라고 하고,결과값을 리턴값이라고 합니다.
//인자( Argument ) 는 어떤 함수를 호출시에 전달되는 값을 의미한다.
//매개 변수( Parameter ) 는 그 전달된 인자를 받아들이는 변수를 의미한다.
//메소드란 클래스가 가지고 있는 기능이다. 클래스 안에 선언됩니다.

//다양한 형태의 메소드
//매개변수도 없고 리턴하는 것도 없는 형태의 메소드
//리턴하는 것이 없을 경우 void라고 작성합니다.
//    public class MyClass{
//        public void method1(){
//            System.out.println("method1이 실행됩니다.");
//        }
//    }
//정수를 받아들인 후, 리턴하지 않는 메소드
//받아들이는 값은 어떤 타입이라도 상관없다.
//받아 들이는 값의 수는 여러개 일 수 있다. 여러개을 경우 콤마(,)로 구분한다.
//    public class MyClass{       
//        public void method2(int x){
//            System.out.println(x + " 를 이용하는 method2입니다.");
//        }
//    }
//이번엔 정수를 받아들인 후, 리턴하지 않는 메소드입니다. 이것을 클래스에서 작성하면 다음과 같습니다.
//
//아무것도 받아들이지 않고, 정수를 반환하는 메소드
//리턴하는 값 앞에 return 이라는 키워드를 사용한다.
//메소드 이름 앞에는 리턴하는 타입을 적어준다.
//리턴타입은 하나만 사용할 수 있다. 리턴하는 타입은 어떤 타입이라도 상관없다.
//    public int method3(){
//        System.out.println("method3이 실행됩니다.");
//
//        return 10;
//    }
//    //위 메소드가 실행되면, 콘솔에 'method3이 실행됩니다.' 를 출력하고, 이 메소드를 호출한 쪽에 10을 리턴한다.
//정수를 2개 매개변수로 받고, 아무것도 반환하지 않는 메소드
//    public void method4(int x, int y){
//        System.out.println(x + "," + y + " 를 이용하는 method4입니다.");
//    }
//정수를 한개 받아들인 후, 정수를 반환하는 메소드
//public class MyClass{
//    public void method(){
//        System.out.println("method1이 실행됩니다.");
//    }
//
//    public void method2(int x){
//        System.out.println(x + " 를 이용하는 method2입니다.");
//    }
//
//    public int method3(){
//        System.out.println("method3이 실행됩니다.");
//
//        return 10;
//    }
//
//    public void method4(int x, int y){
//        System.out.println(x + "," + y + " 를 이용하는 method4입니다.");
//    }
//
//    public int method5(int y){
//        System.out.println(y + " 를 이용하는 method5입니다.");
//        return 5;
//    }
//}

public class MyClass {

	  public void method1(){
	  System.out.println("method1이 실행됩니다.");
	}
	
	public void method2(int x){
	  System.out.println(x + " 를 이용하는 method2입니다.");
	}
	
	public int method3(){
	  System.out.println("method3이 실행됩니다.");
	
	  return 10;
	}
	
	public void method4(int x, int y){
	  System.out.println(x + "," + y + " 를 이용하는 method4입니다.");
	}
	
	public int method5(int y){
	  System.out.println(y + " 를 이용하는 method5입니다.");
	  return y*5;
	}
	
	
	public static void main(String args[]){
        MyClass my1 = new MyClass(); //메소드가 정의된 클래스 생성 

        my1.method1();   //MyClass에서 정의해 놓은 메소드 method1() 를 호출한다.       

        my1.method2(10);

        int x = my1.method3();

        System.out.println("method3 이 리턴한 " + x + " 입니다.");

        my1.method4(10,100);

        int x2 = my1.method5(50);

        System.out.println("method5 가 리턴한 " + x2 + " 입니다.");

    }
}
