package javaBasic;

//throws
//throws�� ���ܰ� �߻������� ���ܸ� ȣ���� �ʿ��� ó���ϵ��� �����ش�.
//    public class ExceptionExam2 {   
//        public static void main(String[] args) {
//            int i = 10;
//            int j = 0;
//            int k = divide(i, j);
//            System.out.println(k);
//        }
//
//        public static int divide(int i, int j){
//            int k = i / j;
//            return k;
//        }
//    }
//������ �Ű������� 2���� �޾Ƶ��� �� �������� �� �� �� ����� ��ȯ�ϴ� divide�޼ҵ�
//main�޼ҵ忡���� divde�޼ҵ带 ȣ��
//
//������ ���� divide�޼ҵ带 ����
//
//    public class ExceptionExam2 {
//
//        public static void main(String[] args) {
//            int i = 10;
//            int j = 0;
//            int k = divide(i, j);
//            System.out.println(k);
//        }
//
//        public static int divide(int i, int j) throws ArithmeticException{
//            int k = i / j;
//            return k;
//        }
//    }
//�޼ҵ� ���� �ڿ� throws ArithmeticException �� �����ִ� ���� �� �� �ֽ��ϴ�. �̷��� ��������� divide�޼ҵ�� ArithmeticException�� �߻��ϴ� divide�޼ҵ带 ȣ���ϴ� �ʿ��� ������ ó���϶�� ���Դϴ�.
//
//    package javaStudy;
//    public class ExceptionExam2 {
//
//        public static void main(String[] args) {
//            int i = 10;
//            int j = 0;
//            try{
//                int k = divide(i, j);
//                System.out.println(k);
//            } catch(ArithmeticException e){
//                System.out.println("0���� ������ �����ϴ�.");
//            }
//
//        }
//
//        public static int divide(int i, int j) throws ArithmeticException{
//            int k = i / j;
//            return k;
//        }
//
//    }

public class ExceptionExam2 {

  public static void main(String[] args) {
  int i = 10;
  int j = 0;
  try{
      int k = divide(i, j);
      System.out.println(k);
  } catch(ArithmeticException e){
      System.out.println(e.toString() + "0���� ������ �����ϴ�.");
  }

}

public static int divide(int i, int j) throws ArithmeticException{
  int k = i / j;
  return k;
}

}
