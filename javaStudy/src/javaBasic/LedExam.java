package javaBasic;

//�������̽� ����ϴ� ���
//�������̽��� ����Ҷ� �ش� �������̽��� �����ϴ� Ŭ�������� implements Ű���带 �̿��Ѵ�.
//  public class LedTV implements TV{
//      public void on(){
//          System.out.println("�Ѵ�");
//      }
//      public void off(){
//          System.out.println("����");   
//      }
//      public void volume(int value){
//          System.out.println(value + "�� ���������ϴ�.");  
//      }
//      public void channel(int number){
//          System.out.println(number + "�� ä�������ϴ�.");         
//      }
//  }
//�������̽��� ������ �ִ� �޼ҵ带 �ϳ��� �������� �ʴ´ٸ� �ش� Ŭ������ �߻�Ŭ������ �ȴ�.(�߻�Ŭ������ �ν��Ͻ��� ���� �� ����)
//  public class LedTVExam{
//      public static void main(String args[]){
//          TV tv = new LedTV();
//          tv.on();
//          tv.volume(50);
//          tv.channel(6);
//          tv.off();
//      }
//  }
//���������� Ÿ������ �������̽��� ����� �� �ִ�. �� ��� �������̽��� ������ �ִ� �޼ҵ常 ����� �� �ִ�.
//���� TV�������̽��� �����ϴ� LcdTV�� ������ٸ� ���� �ڵ忡�� new LedTV�κи� new LcdTV�� �����ص� �Ȱ��� ���α׷��� ������ �ʹ�. ������ �������̽��� �����Ѵٴ� ���� Ŭ���� ������ ���ٴ� ���� �ǹ��Ѵ�.
//Ŭ������ �̷��� �������̽��� ������ ������ �� �ִ�.
public class LedExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new LedTV();
		tv.trunOn();
		tv.changeVolume(1);
		tv.changeChannel(9);
		tv.trunOff();
	}

}
