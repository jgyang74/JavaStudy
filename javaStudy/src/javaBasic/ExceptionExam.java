package javaBasic;

//Exception
//���α׷������� ����ġ ���� ����� ���ܶ�� �Ѵ�. ���� ��Ȳ�� �̸� �����ϰ� ó���� �� �ִµ�, �̷��� �ϴ� ���� ���� ó����� �Ѵ�.
//    public class ExceptionExam {
//        public static void main(String[] args) {
//            int i = 10;
//            int j = 5;
//            int k = i / j;
//            System.out.println(k);
//            System.out.println(main ����!!);
//        }
//    }
//�� �ڵ忡�� j�� 0���� �ٲٸ� Excption �߻�
//
//j�� 0���� �ٲٸ� ArithmeticException�� �߻��ϸ鼭 ���α׷��� ����ȴ�.
//Java�� ������ ������ ������ 0���� ������ �ȵȴ�.0���� ������ ������ �߻��ϴ� ���Դϴ�.
//���� ó��
//
//���α׷��Ӵ� j��� ������ 0�� �������� �𸣴� ���� ��Ȳ�� �̸� �����ϰ� ó���� �� �ִ�.
//����ó���ϴ� ����
//
//������ �߻��� ���� �κ��� try��� ������� ���� ��, �߻��� ������ ���õ� Exception�� catch��� ��Ͽ��� ó���Ѵ�.
//������ �߻��ߵ� ���ߵ� ������ ����Ǵ� finally��� ����� ���� �� �ִ�.
//finally����� ���������ϴ�.
//    public class ExceptionExam {
//        public static void main(String[] args) {
//            int i = 10;
//            int j = 0;
//            try{
//                int k = i / j;
//                System.out.println(k);
//            }catch(ArithmeticException e){
//                System.out.println("0���� ���� �� �����ϴ�. : " + e.toString());
//            }finally {
//                System.out.println("������ �߻��ϵ� ���ϵ� ������ ����Ǵ� ����Դϴ�.");
//            }
//        }
//    }
//������ 
//0���� ���� �� �����ϴ�. : java.lang.ArithmeticException: / by zero
//������ �߻��ϵ� ���ϵ� ������ ����Ǵ� ����Դϴ�.
//
//Exception ó������ �ʾ������� ���α׷��� ���� ����Ǿ��µ� catch��� ������� Exception�� ó���ϴ� 
//����������� �ʰ� �� ����Ǵ� ���� �� �� �ִ�.
//
//try��Ͽ��� ���������� Exception�� �߻��Ѵٸ� catch��� ����� ������ �� �� �ִ�.
//
//ExceptionŬ�������� ��� ExceptionŬ������ ��ӹ����Ƿ�, 
//����Ŭ������ Exception�� �ΰ� �Ǹ� � ������ �߻��ϵ��� ���� �ϳ��� catch��Ͽ��� ��� ������ ó���� �� �ִ�.

public class ExceptionExam {
public static void main(String[] args) {
  int i = 10;
  int j = 0;
  try{
  int k = i / j;
  System.out.println(k);
  }catch(ArithmeticException e) {
	  System.out.println("can not be divided by 0 " + e.toString());
  }finally {
	  System.out.println("finally block");
  }
  System.out.println("main ����!!");
}
}