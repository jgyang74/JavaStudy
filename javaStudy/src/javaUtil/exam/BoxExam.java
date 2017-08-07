package javaUtil.exam;


//Box는 매개변수로 Object를 하나 받아들이고, Object를 반환한다.
//Object를 받아들일 수 있다는 것은 Object의 후손이라면 무엇이든 받아들일 수 있다는 것이다.

public class BoxExam {
    public static void main(String[] args) {
//        Box box = new Box();
//        box.setObj(new Object());
//        Object obj = box.getObj();
//
//        box.setObj("hello");
//        String str = (String)box.getObj();
//        System.out.println(str);
//
//        box.setObj(1);
//        int value = (int)box.getObj();
//        System.out.println(value);

    	
//    	참조타입에 <Object> , <String>, <Integer>가 있는 것을 볼 수 있다.
//    	첫번째는 Object를 사용하는 Box를 인스턴스로 만들겠다는 의미
//    	두번째는 String을 사용하는 Box인스턴스를 만들겠다는 의미
//    	세번째는 Integer를 사용하는 Box인스턴스를 만든다는 의미
//    	Generic을 사용함으로써 선언할때는 가상의 타입으로 선언하고, 
//    	사용시에는 구체적인 타입을 설정함으로써 다양한 타입의 클래스를 이용하는 클래스를 만들 수 있습니다. 
//    	Generic을 사용하는 대표적인 클래스는 컬렉션 프레임워크와 관련된 클래스입니다.
    	
    	Box<Object> box = new Box<>();
    	box.setObj(new Object());
    	Object obj = box.getObj();
    	System.out.println(obj);
    	
    	Box<String> box2 = new Box<>();
    	box2.setObj("Hello");
    	String str = box2.getObj();
    	System.out.println(str);
    	
    	Box<Integer> box3 = new Box<>();
    	box3.setObj(1);
    	int v2 = box3.getObj();
    	System.out.println(v2);
    	
    }
}