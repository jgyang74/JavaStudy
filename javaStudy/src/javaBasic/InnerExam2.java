package javaBasic;

//���� Ŭ������ Ŭ���� �ȿ� ����� Ŭ����
//��� ��ġ�� �����ϴ��Ŀ� ���� 4���� ���°� ���� �� �ִ�.
//ù��°�� Ŭ���� �ȿ� �ν��Ͻ� ����, �� �ʵ带 �����ϴ� ��ġ�� ����Ǵ� ���. ���� ��øŬ���� Ȥ�� �ν��Ͻ� Ŭ������� �Ѵ�.
//���ο� �ִ� Cal��ü�� �����ϱ� ���ؼ���, �ۿ��� InnerExam1�� ��ü�� ���� �Ŀ� InnerExam1.Cal cal = t.new Cal();�� ���� ������� Cal��ü�� ������ �� ����Ѵ�.
//    public class InnerExam1{
//        class Cal{
//            int value = 0;
//            public void plus(){
//                value++;
//            }
//        }
//
//        public static void main(String args[]){
//            InnerExam1 t = new InnerExam1();
//            InnerExam1.Cal cal = t.new Cal();
//            cal.plus();
//            System.out.println(cal.value);
//
//        }
//    }
//�ι�°�� ���� Ŭ������ static���� ���ǵ� ���, ���� ��ø Ŭ���� �Ǵ� static Ŭ������� �Ѵ�.
//�ʵ� ������ �� ����ƽ�� �ʵ�� ������ �Ͱ� ����. �� ��쿡�� InnerExam2��ü�� ������ �ʿ���� new InnerExam2.Cal() �� ��ü�� ������ �� �ִ�.
//    public class InnerExam2{
//        static class Cal{
//            int value = 0;
//            public void plus(){
//                value++;
//            }
//        }
//
//        public static void main(String args[]){
//            InnerExam2.Cal cal = new InnerExam2.Cal();
//            cal.plus();
//            System.out.println(cal.value);
//
//        }
//    }
//����°�δ� �޼ҵ� �ȿ� Ŭ������ ������ ���, ���� ��ø Ŭ���� �Ǵ� ���� Ŭ������� �Ѵ�.
//�޼ҵ� �ȿ��� �ش� Ŭ������ �̿��� �� �ִ�.
//    public class InnerExam3{
//        public void exec(){
//            class Cal{
//                int value = 0;
//                public void plus(){
//                    value++;
//                }
//            }
//            Cal cal = new Cal();
//            cal.plus();
//            System.out.println(cal.value);
//        }
//
//
//        public static void main(String args[]){
//            InnerExam3 t = new InnerExam3();
//            t.exec();
//        }
//    }
//�׹���δ� �͸�Ŭ������ �ִ�.


import javaBasic.InnerExam1.Cal;

public class InnerExam2 {
	
	static	class Cal {
			int value = 0;
			public void plus(){
				value++;
			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);
	}
	
	}
}


