package javaBasic;

//�ڹٴ� ����Ÿ���� �̿��Ͽ� ������ ������ �� ����Ÿ������ ����� �� �ִ�.
//�������� JDK5���� �߰��Ǿ���.
//JDK5 �������� ����� ������ ��� ���
//
//����� �̿��ϴ� ���
//public class EnumExam {
//    public static final String MALE = "MALE";
//    public static final String FEMALE = "FEMALE";
//
//    public static void main(String[] args) {
//        String gender1;
//
//        gender1 = EnumExam.MALE;
//        gender1 = EnumExam.FEMALE;                  
//    }
//}
//
//����� ����߶��� ������
//String���� ����� gender1 ���� MALE,FEMALE �� �� �Ѱ��� ���� ���� ���ϴµ�, gender1�� type�� String �̱� ������ gender1 = "�ҳ�"; �̷��� ���� �Ǿ ���� ������ ���� �ʴ´�.
//
//�����Ҷ� ���ߴ� ���� MALE,FEMALE �� �ƴ� �ٸ� ���� ������ �ǹǷ� ������ �߻���ų �� �ִ�.
//�ذ� ���
//�̷� ������ �߻���Ű�� �ʰ� �ϱ� ���ؼ� �������� ����Ͻø� �˴ϴ�.
//
//������ ���� ���
//
//    enum Gender{
//        MALE, FEMALE;
//    }
//������ ��� ���
//    Gender gender2;
//
//    gender2 = Gender.MALE;
//    gender2 = Gender.FEMALE;
//
//    //GenderŸ���� �������� MALE�̳� FEMALE�� ������ ����. �ٸ� ���� ������ ���� ����.  
//Ư�� ���� ������ �Ѵٸ� �������� ����ϴ� ���� ����.

public class EnumExam {
	public static void main(String[] args) {
		String gender1;
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		//gender2 = "boy";
	}
}

enum Gender {
	MALE, FEMALE
}
