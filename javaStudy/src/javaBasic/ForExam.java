package javaBasic;

//for ��
//for�ݺ����� �����ʱ�ȭ, ���ǽ�, �������� ���ٿ� ��� �ִ�.
//�ʱ�ȭ���� ���� �� ���� �����մϴ�.
//���ǽ��� �����ؼ� �������� false��� for �ݺ����� ���� �����ϴ�.
//���� ����� true��� ���๮�� �����Ѵ�.
//�������� �����Ѵ�.
//2������ 4������ �ݺ������� �����Ѵ�.
//    for(�ʱ�ȭ��; ���ǽ�; ������){
//        ���๮;
//        ���๮;
//    }
//for���� �̿��Ͽ� 1���� 100������ ���� ���ϴ� ���α׷�
//    int total = 0; //1���� 100���� ���� ������� ������� ���� ���� 
//
//    for(int i = 1; i <= 100; i++){ //1���� 100���� �ݺ��ϱ� ���� for �ݺ��� 
//
//        total = total + i; // 1���� 100���� �ݺ��ؼ� total ������ ���� ����  
//    }
//    System.out.println(total);  //����� ��� 
//for���� �̿��Ͽ� 1���� 100������ ¦���� ���� ���ϴ� ���α׷�
//    public class ForExam {
//
//        public static void main(String[] args) {
//            int total = 0;
//            for(int i = 1; i <= 100; i++){
//                if(i % 2 != 0){  // 2�� ���� �������� 0�� �ƴ϶�°��� Ȧ���� �ǹ��Ѵ�.  
//                    continue; // Ȧ���� ��� total = total + i; ������ ������� �����Ƿ�, ��������� ¦���� �����ش�. 
//                }
//                total = total + i;
//            }
//            System.out.println(total);
//        }
//
//    }

public class ForExam {

	public static void main(String[] args) {

		int total = 0;
		for(int i=1;i <= 100; i++) {
			if(i % 2 ==0) { 
				continue;
			}
			total = total + i;
		}
		System.out.println(total);
	}

}
