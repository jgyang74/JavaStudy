package javaUtil.exam;


//Box�� �Ű������� Object�� �ϳ� �޾Ƶ��̰�, Object�� ��ȯ�Ѵ�.
//Object�� �޾Ƶ��� �� �ִٴ� ���� Object�� �ļ��̶�� �����̵� �޾Ƶ��� �� �ִٴ� ���̴�.

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

    	
//    	����Ÿ�Կ� <Object> , <String>, <Integer>�� �ִ� ���� �� �� �ִ�.
//    	ù��°�� Object�� ����ϴ� Box�� �ν��Ͻ��� ����ڴٴ� �ǹ�
//    	�ι�°�� String�� ����ϴ� Box�ν��Ͻ��� ����ڴٴ� �ǹ�
//    	����°�� Integer�� ����ϴ� Box�ν��Ͻ��� ����ٴ� �ǹ�
//    	Generic�� ��������ν� �����Ҷ��� ������ Ÿ������ �����ϰ�, 
//    	���ÿ��� ��ü���� Ÿ���� ���������ν� �پ��� Ÿ���� Ŭ������ �̿��ϴ� Ŭ������ ���� �� �ֽ��ϴ�. 
//    	Generic�� ����ϴ� ��ǥ���� Ŭ������ �÷��� �����ӿ�ũ�� ���õ� Ŭ�����Դϴ�.
    	
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