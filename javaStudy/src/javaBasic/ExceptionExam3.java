package javaBasic;

//������ ������ �߻���Ű�� throw
//throw�� ������ ���ѱ�� throws�� ���� ���� ���˴ϴ�.
//    public class ExceptionExam3 {   
//        public static void main(String[] args) {
//            int i = 10;
//            int j = 0;
//            int k = divide(i, j);
//            System.out.println(k);
//
//        }       
//        public static int divide(int i, int j){
//            int k = i / j;
//            return k;
//        }   
//    }
//divide�޼ҵ�� 2��° �Ķ������ ���� 0�� ��� �����⸦ �� �� Exception�� �߻��Ѵ�.
//���� �ڵ带 ������ �߻����� �ʰ� ����
//    public class ExceptionExam3 {
//        public static void main(String[] args) {
//            int i = 10;
//            int j = 0;
//            int k = divide(i, j);
//            System.out.println(k);      
//        }
//
//        public static int divide(int i, int j){
//            if(j == 0){
//                System.out.println("2��° �Ű������� 0�̸� �ȵ˴ϴ�.");
//                return 0;
//            }
//            int k = i / j;
//            return k;
//        }
//    }
//j�� 0�� ��� �ȵȴٴ� �޽����� ��µǵ��� �����ϰ� 0�� ����.
//�̷��� �� ��� main�޼ҵ��� k������ 0���� ������ �ǰ� 0�� ����ϰ� �ȴ�.
//0���� ���� ����� 0�� �ƴϴ�. 0���� ��ȯ�ϸ� �� ū ������ �߻��Ҽ��� �ִ�.
//������ �߻����� �ʰ�, �ùٸ��� ���� ����� �������� �ʵ��� ����
//    public class ExceptionExam3 {
//        public static void main(String[] args) {
//            int i = 10;
//            int j = 0;
//            int k = divide(i, j);
//            System.out.println(k);
//
//        }       
//        public static int divide(int i, int j) throws IllegalArgumentException{
//            if(j == 0){
//                throw new IllegalArgumentException("0���� ���� �� �����.");
//            }
//            int k = i / j;
//            return k;
//        }   
//    }
//j�� 0�� ��쿡 new�����ڸ� ���Ͽ� IllegalArgumentException ��ü�� ����� ����.
//new �տ� throw �� �ش� ���ο��� �ͼ����� �߻��Ѵٴ� �ǹ��̴�.
//�� �� �ٿ��� ������ �߻��ߴٴ� ���̴�. 0���� ������ �����ϴ�. ��� ������ �߻��Ѱ��̴�.
//ExceptionŬ���� �̸��� ���� �ƱԸ�Ʈ�� �߸��Ǿ��� ������ �߻��� ������� ���� �� �� �ִ�.
//divide �޼ҵ带 ȣ�� �� �ʿ����� ���� ó��
//divide �޼ҵ� �ڿ� throws IllegalArgumentException �� �ش� ������ divide�� ȣ���� �ʿ��� ó���� �ؾ��Ѵٴ� ���� �ǹ��Ѵ�.
//    public class ExceptionExam3 {   
//        public static void main(String[] args) {
//            int i = 10;
//            int j = 0;
//            try{
//                int k = divide(i, j);
//                System.out.println(k);
//            }catch(IllegalArgumentException e){
//                System.out.println("0���� ������ �ȵ˴ϴ�.");
//            }           
//        }
//
//        public static int divide(int i, int j) throws IllegalArgumentException{
//            if(j == 0){
//                throw new IllegalArgumentException("0���� ���� �� �����.");
//            }
//            int k = i / j;
//            return k;
//        }   
//    }

public class ExceptionExam3 {

  public static void main(String[] args) {
  int i = 10;
  int j = 0;
  try{
      int k = divide(i, j);
      System.out.println(k);
  }catch(IllegalArgumentException e){
      System.out.println("0���� ������ �ȵ˴ϴ�.");
  }           
}

public static int divide(int i, int j) throws IllegalArgumentException{
  if(j == 0){
      throw new IllegalArgumentException("0���� ���� �� �����.");
  }
  int k = i / j;
  return k;
}   

}
