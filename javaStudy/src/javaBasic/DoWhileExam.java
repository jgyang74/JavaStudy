package javaBasic;

import java.util.Scanner;

//do-while��
//while���� ��� ������ �������� �ʴ´ٸ� �ѹ��� �ݺ����� ���� �� �ִ�.������, do while���� ���� ������ �ѹ��� ����Ǵ� �ݺ����̴�.
//    do{
//        ���๮;
//    }while(���ǹ�);
//do-while �ǽ�
//    import java.util.Scanner;
//
//    public class DoWhileExam {
//
//        public static void main(String[] args) {
//            int value = 0;
//
//            // Scanner�� java.util ��Ű���� �ִ� Ŭ�����ν� Ű����� ���� ���� �Է¹޴´ٴ��� �� �� �����ϰ� ����� �� �ִ� Ŭ�����Դϴ�.
//            Scanner scan = new Scanner(System.in);
//            //�� ó�� �ۼ��Ͻø� Ű����κ��� ���� �Է¹��� �� �ִ� Scanner��ü�� �����˴ϴ�. 
//
//            do{
//                value = scan.nextInt(); // ScannerŬ������ �̿��Ͽ� Ű����� ���� ���ڰ��� �Է¹޽��ϴ�.
//                System.out.println("�Է¹��� �� : " + value);  
//            }while(value != 10);  // �Է¹��� ���� 10�� �ƴ� ��쿡�� ��� �ݺ��մϴ�.
//
//            System.out.println("�ݺ��� ����");
//        }
//    }
    
public class DoWhileExam {

	public static void main(String[] args) {
		 int value = 0;
 
    // Scanner�� java.util ��Ű���� �ִ� Ŭ�����ν� Ű����� ���� ���� �Է¹޴´ٴ��� �� �� �����ϰ� ����� �� �ִ� Ŭ�����Դϴ�.
     Scanner scan = new Scanner(System.in);
     //�� ó�� �ۼ��Ͻø� Ű����κ��� ���� �Է¹��� �� �ִ� Scanner��ü�� �����˴ϴ�. 
             do{
                 value = scan.nextInt(); // ScannerŬ������ �̿��Ͽ� Ű����� ���� ���ڰ��� �Է¹޽��ϴ�.
                 System.out.println("�Է¹��� �� : " + value);  
             }while(value != 10);  // �Է¹��� ���� 10�� �ƴ� ��쿡�� ��� �ݺ��մϴ�.
 
             System.out.println("�ݺ��� ����");

	}

}
