package javaBasic;

//�޼ҵ�
//�ʵ尡 ��ü�� ���¶��, ��ü�� �ൿ�� �ش��ϴ°� �޼ҵ��. car�� �̸��� ��ȣ�� �ֱ⵵ ������, car�� ������ �����Ҽ��� �ְ� �����ϴ� �ൿ�� �� �� �ִ�.
//�޼ҵ�� �Է°��� �ְ�, �� �Է°��� �޾Ƽ� ���� �� ���� ����� ������ ���� ������ �Լ��� ����� �����̴�.
//�̶� �Է°��� �Ű�������� �ϰ�,������� ���ϰ��̶�� �մϴ�.
//����( Argument ) �� � �Լ��� ȣ��ÿ� ���޵Ǵ� ���� �ǹ��Ѵ�.
//�Ű� ����( Parameter ) �� �� ���޵� ���ڸ� �޾Ƶ��̴� ������ �ǹ��Ѵ�.
//�޼ҵ�� Ŭ������ ������ �ִ� ����̴�. Ŭ���� �ȿ� ����˴ϴ�.

//�پ��� ������ �޼ҵ�
//�Ű������� ���� �����ϴ� �͵� ���� ������ �޼ҵ�
//�����ϴ� ���� ���� ��� void��� �ۼ��մϴ�.
//    public class MyClass{
//        public void method1(){
//            System.out.println("method1�� ����˴ϴ�.");
//        }
//    }
//������ �޾Ƶ��� ��, �������� �ʴ� �޼ҵ�
//�޾Ƶ��̴� ���� � Ÿ���̶� �������.
//�޾� ���̴� ���� ���� ������ �� �� �ִ�. �������� ��� �޸�(,)�� �����Ѵ�.
//    public class MyClass{       
//        public void method2(int x){
//            System.out.println(x + " �� �̿��ϴ� method2�Դϴ�.");
//        }
//    }
//�̹��� ������ �޾Ƶ��� ��, �������� �ʴ� �޼ҵ��Դϴ�. �̰��� Ŭ�������� �ۼ��ϸ� ������ �����ϴ�.
//
//�ƹ��͵� �޾Ƶ����� �ʰ�, ������ ��ȯ�ϴ� �޼ҵ�
//�����ϴ� �� �տ� return �̶�� Ű���带 ����Ѵ�.
//�޼ҵ� �̸� �տ��� �����ϴ� Ÿ���� �����ش�.
//����Ÿ���� �ϳ��� ����� �� �ִ�. �����ϴ� Ÿ���� � Ÿ���̶� �������.
//    public int method3(){
//        System.out.println("method3�� ����˴ϴ�.");
//
//        return 10;
//    }
//    //�� �޼ҵ尡 ����Ǹ�, �ֿܼ� 'method3�� ����˴ϴ�.' �� ����ϰ�, �� �޼ҵ带 ȣ���� �ʿ� 10�� �����Ѵ�.
//������ 2�� �Ű������� �ް�, �ƹ��͵� ��ȯ���� �ʴ� �޼ҵ�
//    public void method4(int x, int y){
//        System.out.println(x + "," + y + " �� �̿��ϴ� method4�Դϴ�.");
//    }
//������ �Ѱ� �޾Ƶ��� ��, ������ ��ȯ�ϴ� �޼ҵ�
//public class MyClass{
//    public void method(){
//        System.out.println("method1�� ����˴ϴ�.");
//    }
//
//    public void method2(int x){
//        System.out.println(x + " �� �̿��ϴ� method2�Դϴ�.");
//    }
//
//    public int method3(){
//        System.out.println("method3�� ����˴ϴ�.");
//
//        return 10;
//    }
//
//    public void method4(int x, int y){
//        System.out.println(x + "," + y + " �� �̿��ϴ� method4�Դϴ�.");
//    }
//
//    public int method5(int y){
//        System.out.println(y + " �� �̿��ϴ� method5�Դϴ�.");
//        return 5;
//    }
//}

public class MyClass {

	  public void method1(){
	  System.out.println("method1�� ����˴ϴ�.");
	}
	
	public void method2(int x){
	  System.out.println(x + " �� �̿��ϴ� method2�Դϴ�.");
	}
	
	public int method3(){
	  System.out.println("method3�� ����˴ϴ�.");
	
	  return 10;
	}
	
	public void method4(int x, int y){
	  System.out.println(x + "," + y + " �� �̿��ϴ� method4�Դϴ�.");
	}
	
	public int method5(int y){
	  System.out.println(y + " �� �̿��ϴ� method5�Դϴ�.");
	  return y*5;
	}
	
	
	public static void main(String args[]){
        MyClass my1 = new MyClass(); //�޼ҵ尡 ���ǵ� Ŭ���� ���� 

        my1.method1();   //MyClass���� ������ ���� �޼ҵ� method1() �� ȣ���Ѵ�.       

        my1.method2(10);

        int x = my1.method3();

        System.out.println("method3 �� ������ " + x + " �Դϴ�.");

        my1.method4(10,100);

        int x2 = my1.method5(50);

        System.out.println("method5 �� ������ " + x2 + " �Դϴ�.");

    }
}
