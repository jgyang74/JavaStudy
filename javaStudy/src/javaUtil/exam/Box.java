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

//Ŭ���� �̸� �ڿ� <E>�� ���׸��� ������ ���̴�. Box�� ������ Ŭ���� E�� ����Ѵٴ� �ǹ�.
//Object�� �޾Ƶ��̰�, �����ϴ� �κ��� E�� ����. E�� ������ �����ϴ� Ŭ������ �ƴϴ�.

public class Box<E>  {
	private E obj;
	public void setObj(E obj){
		this.obj = obj;
	}

	public E getObj(){
		return obj;
	}
}
