package javaBasic;

public class ArrayExam2{
	  public int[] makeArray(){
	    //array�� 1���� 5���� ���� ������ ���̰� 5�� int�迭�� �ǵ��� ����� ������.
	    int [] array = new int[]{1,2,3,4,5};

	    //�Ʒ��� ��� �򰡸� ���� �ڵ��Դϴ�. �������� ������.
	    return array;
	  }

	  //�Ʒ��� ������ ���� �ڵ��Դϴ�. �������� ������.
	  public static void main(String[]args){
	  	ArrayExam2 exam = new ArrayExam2();
	  	int [] array = exam.makeArray();
	  	if(array.length==5 &&
	  		array[0] ==1 &&
	  		array[1] ==2 &&
	  		array[2] ==3 &&
	  		array[3] ==4 &&
	  		array[4] ==5){
	  		System.out.println("�����Դϴ�. [����]�� ��������.");
	  	}
	  	else{
	  		System.out.println("Ʋ�Ƚ��ϴ�.");
	  	}
	  }
	}