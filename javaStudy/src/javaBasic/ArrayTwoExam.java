package javaBasic;

//2���� �迭
//2���� �迭�̶� �迭�� �迭�̴�.
//2���� �迭 ���� ���
//������ 4���� ���� �� �ִ� �迭�� 3�� �����ȴ�.
//        int[][] array4 = new int[3][4];
//2���� �迭�� ���� �����ϴ� ���
//���� array4[1] = 10 ; �̷��� ����ϸ� ����!!
//array4[1] �� �� �ٸ� 1���� �迭�� ����ų �� �ִ� ������ �����̱� ������ ���� �������� ����.
//     array4[0][0] = 10; 
//2���� �迭�� ���� �����ϴ� ���
//���� array4[1] = 10 ; �̷��� ����ϸ� ����!!
//array4[1] �� �� �ٸ� 1���� �迭�� ����ų �� �ִ� ������ �����̱� ������ ���� �������� ����.
//     array4[0][0] = 10; 
//����ũ���� 2���� �迭�� �����ϴ� ���
//    int[][] array5 = new int[3][];
//    //���� ���� �����ϸ� array5�� 3��¥�� �迭�� �����Ѵ�. 3��¥�� �迭�� ���� �����ϴ� �迭�� ���ٴ� ���� �ǹ�.
//
//    array5[0] = new int[1]; //������ �ϳ� ���� �� �ִ� �迭�� �����ؼ� array5 �� 0 ��° �ε����� �����Ѵ�.  
//    array5[1] = new int[2]; //������ �ΰ� ���� �� �ִ� �迭�� �����ؼ� array5 �� 1 ��° �ε����� �����Ѵ�.  
//    array5[2] = new int[3]; //������ ���� ���� �� �ִ� �迭�� �����ؼ� array5 �� 2 ��° �ε����� �����Ѵ�. 
//����� ���ÿ� �ʱ�ȭ�ϴ� ���
//    int[][] array6 = {{1}, {2,3}, {4,5,6}};
//    //���� ���� ������ ��� array6[0][0] �� 1�̴�. array6[1][0]�� 2�̴�. 

public class ArrayTwoExam {
	public static void main(String[] args) {
		int[][] array4 = new int[3][4];
		array4[0][1] = 10;
		
		int[][] array5 = new int[3][];
		array5[0] = new int[1];
		array5[0][0] = 10;
		
		int[][] array6 = {{1},{1,2},{1,2,3}};
		
		System.out.println(array6[0][0]);
		System.out.println(array6[2][2]);
		
		
		
	
	}
}