package javaBasic;

class ReferenceTypeExam{
	public static void main(String []args){
		ReferenceTypeExam exam = new ReferenceTypeExam();
		
		//�⺻�� ����value1�� addOne�� �����մϴ�.
		int value = 10;
		exam.addOne(value);
		System.out.println("�⺻�� ������ ���� �ٸ� �޼ҵ忡�� ������ ���: "+value);
		
		//������ ����arr�� addOne�� �����մϴ�.
		int []arr = {10};
		exam.addOne(arr);
		System.out.println("������ ������ ���� �ٸ� �޼ҵ忡�� ������ ���: "+arr[0]);
	}
	
	
	public void addOne(int value){
		value++;
	}
	
	public void addOne(int[] arr){
		for(int i = 0; i<arr.length ; i++){
			arr[i] ++;
		}
	}
}
