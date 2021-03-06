package javaBasic;

//내부 클래스란 클래스 안에 선언된 클래스
//어느 위치에 선언하느냐에 따라서 4가지 형태가 있을 수 있다.
//첫번째는 클래스 안에 인스턴스 변수, 즉 필드를 선언하는 위치에 선언되는 경우. 보통 중첩클래스 혹은 인스턴스 클래스라고 한다.
//내부에 있는 Cal객체를 생성하기 위해서는, 밖에는 InnerExam1의 객체를 만든 후에 InnerExam1.Cal cal = t.new Cal();과 같은 방법으로 Cal객체를 생성한 후 사용한다.
//    public class InnerExam1{
//        class Cal{
//            int value = 0;
//            public void plus(){
//                value++;
//            }
//        }
//
//        public static void main(String args[]){
//            InnerExam1 t = new InnerExam1();
//            InnerExam1.Cal cal = t.new Cal();
//            cal.plus();
//            System.out.println(cal.value);
//
//        }
//    }
//두번째는 내부 클래스가 static으로 정의된 경우, 정적 중첩 클래스 또는 static 클래스라고 한다.
//필드 선언할 때 스태틱한 필드로 선언한 것과 같다. 이 경우에는 InnerExam2객체를 생성할 필요없이 new InnerExam2.Cal() 로 객체를 생성할 수 있다.
//    public class InnerExam2{
//        static class Cal{
//            int value = 0;
//            public void plus(){
//                value++;
//            }
//        }
//
//        public static void main(String args[]){
//            InnerExam2.Cal cal = new InnerExam2.Cal();
//            cal.plus();
//            System.out.println(cal.value);
//
//        }
//    }
//세번째로는 메소드 안에 클래스를 선언한 경우, 지역 중첩 클래스 또는 지역 클래스라고 한다.
//메소드 안에서 해당 클래스를 이용할 수 있다.
//    public class InnerExam3{
//        public void exec(){
//            class Cal{
//                int value = 0;
//                public void plus(){
//                    value++;
//                }
//            }
//            Cal cal = new Cal();
//            cal.plus();
//            System.out.println(cal.value);
//        }
//
//
//        public static void main(String args[]){
//            InnerExam3 t = new InnerExam3();
//            t.exec();
//        }
//    }
//네번재로는 익명클래스가 있다.


import javaBasic.InnerExam1.Cal;

public class InnerExam2 {
	
	static	class Cal {
			int value = 0;
			public void plus(){
				value++;
			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);
	}
	
	}
}


