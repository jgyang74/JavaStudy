package javaBasic;

//�ݺ���
//�ݺ����� ���๮�� �ݺ������� �����ؾ� �� �� ��� �Ѵ�.
//�ݺ����� ������ while��, do-while��, for�� �� �ִ�.
//while��
//���ǹ��� ���� ����� true�� ������ �ݺ��ؼ� �����Ѵ�.
//    while(���ǹ�){
//        ���๮; 
//    }
//10�� �ݺ��ϸ鼭 0���� 9���� ����ϴ� �ݺ���
//    int i = 0;  //while���� ����� ������ ����
//
//    while(i < 10){
//        System.out.println(i);
//        i++; //���ǹ��� ���ϴ� ��ŭ�� �ݺ��ϰ� ���������� ���� �κ� 
//    }
//1���� 100������ ���� while���� �̿��Ͽ� ������ ������ �ϰڽ��ϴ�.
//    public class WhileExam2 {
//        public static void main(String[] args) {
//            int total = 0; // i�� ���� ������ ������ �����մϴ�.
//            int i = 1;
//            while(i <= 100){
//                total = total + i;
//                i++;
//            }
//        }
//    }

public class WhileExam {

	public static void main(String[] args) {
	   int total = 0; // i�� ���� ������ ������ �����մϴ�.
       int i = 1;
       while(i <= 100){
           total = total + i;
           System.out.println(total);
           i++;
       }
   }



}
