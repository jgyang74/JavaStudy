package javaUtil.exam;

//Compare �������̽��� �̿��ϴ� Ŭ����
//Compara �������̽��� �޾Ƶ��� ��, �ش� �������̽��� �̿��ϴ� exec�޼ҵ�
//compareTo�޼ҵ尡 ��� �����Ǿ� �ִ��Ŀ� ���� ��µǴ� ���� �ٸ�


public class CompareExam {
	
	public static void exec(Compare compare) {
		int k=10;
		int m=20;
		int value = compare.compareTo(k, m);
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		exec((i,j) -> {
			return i-j;
		});
	}
}

//�ڹٴ� �޼ҵ常 ���ڷ� �����Ϸ��� �ݵ�� ��ü�� ���� �����ؾ� �ߴ�. 
//Java8�� ���ٽ��� ����鼭, ��ġ �Լ��� �����ϴ� ��ó�� �����ϰ� ������ ����� �� �ְ� �Ǵ�.