package javaBasic;

//String Ŭ����
//���ڿ��� ǥ���ϴ� �ڹٿ��� ���� ���� ����ϴ� Ŭ����
//�ڹ� �ν��Ͻ� ���� ���
//new�����ڸ� �̿����� �ʰ� �ν��Ͻ��� ����� ���
//    String str1 = "hello";
//    String str2 = "hello";
//"hello"��� ���ڿ��� �޸� �߿��� ����� ����Ǵ� ������ ����ȴ�. ����� ������ �ʴ� ���� �ǹ�.
//String str2 = "hello"; �� ������ ����� ���� hello ��� ���ڿ� ����� �̹� ������� �����Ƿ� str1�� �����ϴ� �ν��Ͻ��� str2�� �����Ѵ�.
//2.new�����ڸ� �̿��ؼ� �ν��Ͻ��� ����� ���
//
//    String str3 = new String("hello");
//    String str4 = new String("hello");
//new�����ڸ� �̿��Ͽ� �ν��Ͻ��� ����� �ν��Ͻ��� ������ ���Ӱ� ���������.
//String str4 = new String("hello"); �� ������ ����ɶ��� ���Ӱ� ����� �ǹǷ�, str3 �� str4�� ���� �ٸ� �ν��Ͻ��� �����Ѵ�.
//    if(str1 == str2){  // ���� �ν��Ͻ��� �����ϹǷ� ����� true 
//        System.out.println("str1�� str2�� ���� ���۷����Դϴ�.");
//    }
//
//    if(str1 == str3){  // str1�� str3�� ���� �ٸ� �ν��Ͻ��� �����ϹǷ� ����� false 
//        System.out.println("str1�� str3�� ���� ���۷����Դϴ�.");
//    }
//
//    if(str3 == str4){  // str3�� str4�� ���� �ٸ� �ν��Ͻ��� �����ϹǷ� ����� false 
//        System.out.println("str3�� str4�� ���� ���۷����Դϴ�.");
//    }
//������������ == �� ���ϸ� ���� ���� ���� �����ϴ��� ���Ѵ�.
//String�� �ٸ� Ŭ������ �ٸ��� new�� ������� �ʰ� ����� �� �ִ�. �޸𸮸� �Ƴ����� String�� new�� ������� �ʰ� ����ϴ� ���� ����.
//String�� �Һ� Ŭ�����̴�. �Һ��̶� String�� �ν��Ͻ��� �ɶ� ������ �ִ� ���� ���߿� ������ �� ����.
//String�� ���ڿ��� ���õ� �پ��� �޼ҵ带 ������ �ִ�. �޼ҵ带 ȣ���Ѵ� �ϴ��� String�� ������ ���� ������ �ʴ´�.
//String�� ������ �ִ� �޼ҵ��� String�� ��ȯ�ϴ� �޼ҵ�� ��� ���ο� String�� �����ؼ� ��ȯ�Ѵ�.
//    String str5 = "hello world";
//    String str6 = str5.substring(3);
//substring�� ���ڿ��� �ڸ� ����� ��ȯ�ϴ� �޼ҵ��̴�. �ش� �ڵ尡 ����Ǿ str5�� ������ �ʴ´�.
//str6�� str5�� ������ �ִ� ���ڿ� �� 3��° ��ġ���� �ڸ� ��� �� ���ο� String�� �����ϰ� �ȴ�.


public class StringExam {

	public static void main(String[] args) {

		String str1 = "hello";
		String str2 = "hello";
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		if(str1 == str2)
			System.out.println("str1 and str2 refer to same address");
		
		if(str1 == str3)
			System.out.println("str1 and str3 refer to same address");
		
		if(str3 == str4)
		System.out.println("str3 and str4 refer to same address");
		
		System.out.println(str1); 
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1);
		
		if( str1.equals(str2) ){
			System.out.println("str1�� str2�� ���� ���� ������ �ֽ��ϴ�.");		
		}
		else{
			System.out.println("str1�� str2�� �ٸ� ���� ������ �ֽ��ϴ�.");
		}
		
			
	}

}
