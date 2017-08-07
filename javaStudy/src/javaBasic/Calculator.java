package javaBasic;

//�������̽��� default �޼ҵ�
//JAVA 8�� �����ϸ鼭 interface�� ���� ���ǰ� �� ���� ����Ǿ���.
//default�޼ҵ�
//�������̽��� defaultŰ����� ����Ǹ� �޼ҵ尡 ������ �� �ִ�. ���� �̸� �����ϴ� Ŭ������ default�޼ҵ带 �������̵� �� �� �ִ�.
//    public interface Calculator {
//        public int plus(int i, int j);
//        public int multiple(int i, int j);
//        default int exec(int i, int j){      //default�� ���������� �޼ҵ带 ������ �� �ִ�.
//            return i + j;
//        }
//    }
//
//    //Calculator�������̽��� ������ MyCalculatorŬ����
//    public class MyCalculator implements Calculator {
//
//        @Override
//        public int plus(int i, int j) {
//            return i + j;
//        }
//
//        @Override
//        public int multiple(int i, int j) {
//            return i * j;
//        }
//    }
//
//    public class MyCalculatorExam {
//        public static void main(String[] args){
//            Calculator cal = new MyCalculator();
//            int value = cal.exec(5, 10);
//            System.out.println(value);
//        }
//    }
//�������̽��� ������ �Ǹ�, �������̽��� �����ϴ� ��� Ŭ�������� �ش� �޼ҵ带 �����ؾ� �ϴ� ������ �ִ�. �̷� ������ �ذ��ϱ� ���Ͽ� �������̽��� �޼ҵ带 ������ ���� �� �ֵ��� �Ͽ���.
//static�޼ҵ�
//    public interface Calculator {
//        public int plus(int i, int j);
//        public int multiple(int i, int j);
//        default int exec(int i, int j){
//            return i + j;
//        }
//        public static int exec2(int i, int j){   //static �޼ҵ� 
//            return i * j;
//        }
//    }
//
//    //�������̽����� ������ static�޼ҵ�� �ݵ�� �������̽���.�޼ҵ� �������� ȣ���ؾ��Ѵ�.  
//
//    public class MyCalculatorExam {
//        public static void main(String[] args){
//            Calculator cal = new MyCalculator();
//            int value = cal.exec(5, 10);
//            System.out.println(value);
//
//            int value2 = Calculator.exec2(5, 10);  //static�޼ҵ� ȣ�� 
//            System.out.println(value2);
//        }
//    }
//�������̽��� static �޼ҵ带 ���������ν�, �������̽��� �̿��Ͽ� ������ ����� ������ ��ƿ��Ƽ�� �������̽��� ���� �� �ְ� �Ǿ���.

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
    default public int exec(int i, int j){
    	return i+j;
    }
    
    public static int exec2(int i, int j){
    	return i*j;
    }
	
	
}
