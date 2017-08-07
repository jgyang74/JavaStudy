package javaBasic;

//1차원 배열
//배열은 같은 데이터 타입을 가진 연속된 메모리 공간으로 이루어진 자료구조이다.
//같은 데이터 타입을 가진 여러개의 변수가 필요할 때 사용한다.
//배열 생성 방법
//정수를 4개 저장 할 수 있는 배열을 생성 하는 방법
//        int[] array1 = new int[4];
//배열에 값을 저장하는 방법
//    array1[0] = 1;
//    array1[1] = 2;
//    array1[2] = 3;
//    array1[3] = 4;
//    //자바에서 배열의 인덱스는 0번 부터 사용한다. 4개짜리 배열은 0부터 3까지의 인덱스를 가지게 된다.
//    //배열인덱스 0번부터 3번까지 차례로 1,2,3,4 값을 저장한다. 
//배열에 저장된 값을 꺼내서 사용하는 방법
//    int value = array1[2]; 
//    //array1 이 참조하는 배열의 2번 인덱스에 해당하는 값 3을 꺼내서 int형 변수 value에 담는다. 
//    System.out.println(array1[1]); 
//    //array1 이 참조하는 배열의 1번 인덱스에 해당하는 값 2가 콘솔에 출력된다. 
//선언과 동시에 초기화하는 방법
//    int[] array2 = new int[]{1,2,3,4,5};
//    //int 값을 5개저장 할 수 있는 배열이며, 해당 배열에는 1,2,3,4,5가 순서대로 저장되게 된다.

public class ArrayExam {

	public static void main(String[] args) {

		int[] array1 = new int[100];
		
		array1[0] = 50;
		array1[10] = 100;
		
		int[] array2 = new int[]{1,2,3,4};
		
		int[] array3 = {1,2,3,4};
		
		System.out.println(array3[3]);
		
		int value = array3[0];
		System.out.println(array3[3]);
		
	}

}
