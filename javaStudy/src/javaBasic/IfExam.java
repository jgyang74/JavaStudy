package javaBasic;

//if ���ǹ�
//���ǽ��� ���� ����� ���� ��� ���� ������ ���� ���θ� ���� �� �� �ִ�.
//if ��
//���ǽ��� true �� ��쿡�� ���๮�� ����ȴ�.
//if(���ǽ�) ������ { } �� ������ �� �ִ�. ������, ������ ��� if���� ���ԵǴ� ���๮�� �� �� �ٸ� ���Եȴ�.
//        if(���ǽ�){
//            ���๮;
//            ���๮;
//        }
//if - else ��
//���ǽ��� true�� ��� if ����� ���๮�� ����ǰ�, flase �� ��� else ����� ���๮�� ����ȴ�.
//        if(���ǽ�){
//            ���๮;
//            ���๮;
//        }else{
//            ���๮;
//        }
//if - else if - else��
//ó�� if���� ���ǽ��� ���ǹ��� true�� ��� ó�� if���� ����� ����ǰ�, false�� ��� ���� ���ǽ��� ����� ���� ���� ����� �޶�����.
//else if ���� ���� ������ ����. �׷��� �ʹ� ���� else if ���� ���� �ӵ��� ������ �Ѵ�.
//������ else ����� �����ǵ� �������.
//        if(���ǽ�){
//            ���๮;
//            ���๮;
//        }else if(���ǽ�){
//            ���๮;
//        }else{
//            ���๮;
//        }

public class IfExam {

	public static void main(String[] args) {
	
		int x = 50;
		int y = 60;
		
		if(x < y){
			System.out.println("x is less than y");
			System.out.println("test");
		}
		
		if(x < y)
			System.out.println("x is equal to y");
		System.out.println("test");
		
		if(x == y) {
			System.out.println("x is equal to y");
		} else if(x < y){
			System.out.println("x is not equal to y");
		} else {
			System.out.println("x is less than y");
		}
	}

}
