package javaBasic;

//���� �����ڶ� Ŭ���� ������ ����� ������ �����ϴ� ������ �Ѵ�.
//������������ ����
//public
//� Ŭ������ ������ �� �ִٴ� ���� �ǹ�
//protected
//�ڱ� �ڽ�, ���� ��Ű��, ���� �ٸ� ��Ű���� �ϴ��� ��ӹ��� �ڽ� Ŭ���������� �����Ҽ� �ִٴ� ���� �ǹ�
//private
//�ڱ� �ڽŸ� ������ �� �ִٴ� ���� �ǹ�
//���������ڸ� ���� ������ default���� ������
//�ڱ��ڽŰ� ���� ��Ű�������� ������ �� �ִٴ� ���� �ǹ�
//    public class AccessObj{
//        private int i = 1;
//        int k = 2; // default���� ������
//        public int p = 3;
//        protected int p2 = 4;
//    }
//AccessObj�� ����ϴ� AccessObjExam
//AccessObj�� �ʵ� i �� ���� �����ڴ� private�̹Ƿ� �ٸ� Ŭ������ AccessObjExam���� ������ �� ����.
//    public class AccessObjExam{
//        public static void main(String args[]){
//            AccessObj po = new AccessObj();
//
//            System.out.println(po.i); // ������ ������ �߻��մϴ�.
//            System.out.println(po.k);
//            System.out.println(po.p);
//            System.out.println(po.p2);
//        }
//    }
//AccessObj �� �ٸ� ��Ű������ ����غ���
//��Ű���� �޶����⶧���� default���������ڷ� ������ �ʵ� k �� protected ���������ڷ� ������ �ʵ� p2 �� ������ ����.
//    public class AccessObjExam{
//        public static void main(String args[]){
//            AccessObj po = new AccessObj();
//
//            System.out.println(po.i); // ������ ������ �߻��մϴ�.
//            System.lout.println(po.k);// ������ ������ �߻��մϴ�.
//            System.lout.println(po.p);
//            System.lout.println(po.p2);// ������ ������ �߻��մϴ�.
//        }
//    }
//AccessObjExam�� AccesObj�� ���� ��ӹ޵��� ������ �� ����� ����
//��Ű���� �ٸ����� ��Ӱ��迡 �����Ƿ� protected ���������ڷ� ������ �ʵ� p2�� ������ �� �ִ�.
//    public class AccessObjExam extends AccessObj{
//        public static void main(String[] args) {
//            AccessObjExam obj = new AccessObjExam();
//            System.out.println(obj.p);
//            System.out.println(obj.p2);
//            System.out.println(obj.k);// ������ ������ �߻��մϴ�.
//            System.out.println(obj.i);// ������ ������ �߻��մϴ�.
//        }
//    }


public class AccessObj {
	public int p = 3;       //� Ŭ������ ������ �� �ִٴ� ���� �ǹ�
	protected int p2 = 4;  //�ڱ� �ڽ�, ���� ��Ű��, ���� �ٸ� ��Ű���� �ϴ��� ��ӹ��� �ڽ� Ŭ���������� �����Ҽ� �ִٴ� ���� �ǹ�
	private int i = 1;     //�ڱ� �ڽŸ� ������ �� �ִٴ� ���� �ǹ�
	int k = 2;             //�ڱ��ڽŰ� ���� ��Ű�������� ������ �� �ִٴ� ���� �ǹ�
	
}
