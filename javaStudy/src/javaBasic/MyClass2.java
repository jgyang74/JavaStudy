package javaBasic;

//�޼ҵ� �����ε�
//�Ű������� ������ ������ �ٸ��� �Ͽ� ���� �̸��� �޼ҵ带 ���� �� ���� �� �ְ��ϴ� ���
//�޼ҵ� �����ε�
//�̸��� ������ �Ű������� �ٸ� �޼ҵ�
//    class MyClass2{
//        public int plus(int x, int y){
//            return x+y;
//        }
//
//        public int plus(int x, int y, int z){
//            return x + y + z;
//        }
//
//        public String plus(String x, String y){
//            return x + y;
//        }
//    }
//�޼ҵ� �����ε��� �Ű����� �κ��� �޶�� �Ѵ�.
//    public int plus(int i, int f){
//        return i+f;
//    }
//��ó�� �������� �ٸ�����, �Ű������� Ÿ�԰� ������ ������ �޼ҵ带 �� ���� �� ���� ����.
//�����ε��� �޼ҵ� �̿��ϱ�
//�޼ҵ��� ���ڿ� � ���� ���̴��Ŀ� ���� ���� �ٸ� �޼ҵ尡 ȣ��ȴ�.
//    public MethodOverloadExam{
//        public static void main(String args[]){
//            MyClass2 m = new MyClass2();
//            System.out.println(m.plus(5,10));
//            System.out.println(m.plus(5,10,15));
//            System.out.println(m.plus("hello" + " world"));
//        }
//    }


public class MyClass2 {
	public int plus(int x, int y) {
		return x+y;
	}
	
	public int plus(int x, int y, int z) {
		return x+y+z;
	}
	
	public String plus(String x, String y) {
		return x+y;
	}
	
	

}
