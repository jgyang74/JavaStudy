package javaBasic;

//������ ������
//���α׷��󿡼� ���Ǵ� �������� ��� ������ ������ ������. �� ������ ������ ��������� �Ѵ�.
//������ ����� ���� �� ������ �������̴�.
//
//Ŭ������ �Ӽ����� ����� ���� globalScope �� ��� ������ Ŭ���� ��ü �̴�.
//�Ű������� ����� int value �� �� �ٱ��� �����ϱ�� ������, �޼��� ����ο� �����ϹǷ� �������� �ش� �޼ҵ� �����̴�.
//�޼ҵ� �������� ����� localScope ������ �������� �޼ҵ� �����̴�.

//main�޼ҵ忡�� ����ϱ�
//���� Ŭ���� �ȿ� �ִµ� globalScope ������ ��� �� �� ����.
//main�� static�� �޼ҵ��̴�. static�� �޼��忡���� static ���� ���� �ʵ带 ��� �� �� ����.

//static
//���� Ŭ���� ���� �������� �ش� �������� ����� �� ����.
//main �޼ҵ�� static �̶�� Ű����� �޼ҵ尡 ���ǵǾ� �ִ�. �̷� �޼��带 static �� �޼ҵ� ��� �Ѵ�.
//static�� �ʵ�(�ʵ� �տ� static Ű���带 ����)��, static�� �޼ҵ�� Class�� �ν��Ͻ�ȭ ���� �ʾƵ� ����� �� �ִ�.

//static�� ������ �����ȴ�.
//static�ϰ� ����� ������ ���� ������ �� �ִ� ������ �ϳ��� �����ȴ�. �׷��Ƿ�, �ν��Ͻ��� ������ �����ǵ� static�� ������ �ϳ���.

//golbalScope���� ����(�ʵ�)�� �ν��Ͻ��� �����ɶ� �����Ǳ⶧���� �ν��Ͻ� ������� �Ѵ�.
//staticVal���� static�� �ʵ带 Ŭ���� ������� �Ѵ�.
//Ŭ���� ������ ���۷���.������ �ϰ� ����ϱ� ���ٴ� Ŭ������.������ ���� ����ϴ°��� �� �ٶ����ϴٰ� �ϴ�.
//VariableScopeExam.staticVal


public class VariableScopeExam {
	
	int globalScope = 10;  //Ŭ���� ���� 
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
		//System.out.println(localScope);
		//System.out.println(value);
		System.out.println(value2);
	}
	
	public static void main(String[] args) {
		System.out.println(staticVal);
		
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);
		System.out.println(VariableScopeExam.staticVal);
	}
}


