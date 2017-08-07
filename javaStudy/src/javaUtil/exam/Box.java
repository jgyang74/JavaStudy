package javaUtil.exam;

//public class Box {
//    private Object obj;
//    public void setObj(Object obj){
//    this.obj = obj;
//    }
//
//    public Object getObj(){
//    return obj;
//    }
//}

//클래스 이름 뒤에 <E>가 제네릭을 적용한 것이다. Box는 가상의 클래스 E를 사용한다는 의미.
//Object를 받아들이고, 리턴하던 부분이 E로 변경. E는 실제로 존재하는 클래스는 아니다.

public class Box<E>  {
	private E obj;
	public void setObj(E obj){
		this.obj = obj;
	}

	public E getObj(){
		return obj;
	}
}
