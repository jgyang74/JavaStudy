package javaBasic;

//switch ��
//switch���� � ������ ���� ���� ������ ������ �� �ֵ��� �ϴ� ����̴�.
//switch������ ����ϴ� Ű����� switch, case, default, break �̴�.
//
//switch��
//
//    switch(����){
//        case ��1 : 
//            ���๮; 
//            break;
//        case ��2 : 
//            ���๮; 
//            break;  
//        default;    
//    }
//    int value = 1;
//
//    switch(value){
//        case 1: 
//            System.out.println("1");
//            break;
//        case 2:
//            System.out.println("2");
//            break;
//        case 3 :
//            System.out.println("3");
//            break;
//        default :
//            System.out.println("�� ���� ����");
//    }
//value�� ���� 1�� ��� 1�� ����ϰ�, 2�� ���� 2�� ����ϰ�, 3�� ���� 3�� ����ϰ�, �� �ܿ��� �� ���� ���ڰ� ��µȴ�.
//
//    case 1: 
//        System.out.println("1");
//    case 2:
//        System.out.println("2");
//    case 3 :
//        System.out.println("3");
//    default :
//        System.out.println("�� ���� ����");
//break�� �����ϸ� value�� 1�� ��� 1�� ��µǰ� switch������ ���������� ���� �ƴ϶�
//1,2,3, �׿��Ǽ��ڰ� �����ؼ� ����ȴ�. break������ ���� ���� ���� ��츦 Ȯ���ϰ� ������ �� �־�� �մϴ�.
//
//���� �ϼ���
//JDK7�������� switch���� ��ȣ�ȿ� ����Ÿ���� ������ �� �� �־����ϴ�. �׷��� JDK7���ʹ� switch���� ��ȣ�ȿ� ���ڿ� Ÿ���� ������ �� �� �ֽ��ϴ�.
//
//    String str = "A";
//
//    switch(str){
//        case "A": 
//            System.out.println("1");
//        case "B":
//            System.out.println("2");
//        case "C" :
//            System.out.println("3");
//        default :
//            System.out.println("�� ���� ����");
//    }
//���ڿ��� ���� ���� case����� ������ ��µǴ� ���� �� �� �ֽ��ϴ�.

public class SwitchExam {

	public static void main(String[] args) {
	    int value = 1;
		
		    switch(value){
		        case 1: 
		            System.out.println("1");
		            break;
		        case 2:
		            System.out.println("2");
		            break;
		        case 3 :
		            System.out.println("3");
		            break;
		        default :
		            System.out.println("�� ���� ����");
		    }
		    
		    String str = "A";
		    
		        switch(str){
		            case "A": 
		                System.out.println("1");
		                break;
		            case "B":
		                System.out.println("2");
		                break;
		            case "C" :
		                System.out.println("3");
		                break;
		            default :
		                System.out.println("�� ���� ����");
		        }    

	}

}
