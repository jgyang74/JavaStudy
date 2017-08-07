package javaBasic;

//접근 제한자란 클래스 내에서 멤버의 접근을 제한하는 역할을 한다.
//접근제한자의 종류
//public
//어떤 클래스든 접근할 수 있다는 것을 의미
//protected
//자기 자신, 같은 패키지, 서로 다른 패키지다 하더라도 상속받은 자식 클래스에서는 접근할수 있다는 것을 의미
//private
//자기 자신만 접근할 수 있다는 것을 의미
//접근제한자를 적지 않으면 default접근 지정자
//자기자신과 같은 패키지에서만 접근할 수 있다는 것을 의미
//    public class AccessObj{
//        private int i = 1;
//        int k = 2; // default접근 제한자
//        public int p = 3;
//        protected int p2 = 4;
//    }
//AccessObj를 사용하는 AccessObjExam
//AccessObj의 필드 i 의 접근 제한자는 private이므로 다른 클래스인 AccessObjExam에서 접근할 수 없다.
//    public class AccessObjExam{
//        public static void main(String args[]){
//            AccessObj po = new AccessObj();
//
//            System.out.println(po.i); // 컴파일 오류가 발생합니다.
//            System.out.println(po.k);
//            System.out.println(po.p);
//            System.out.println(po.p2);
//        }
//    }
//AccessObj 와 다른 패키지에서 사용해보기
//패키지가 달라졌기때문에 default접근제한자로 지정된 필드 k 와 protected 접근제한자로 지정된 필드 p2 도 접근할 없다.
//    public class AccessObjExam{
//        public static void main(String args[]){
//            AccessObj po = new AccessObj();
//
//            System.out.println(po.i); // 컴파일 오류가 발생합니다.
//            System.lout.println(po.k);// 컴파일 오류가 발생합니다.
//            System.lout.println(po.p);
//            System.lout.println(po.p2);// 컴파일 오류가 발생합니다.
//        }
//    }
//AccessObjExam을 AccesObj로 부터 상속받도록 수정한 후 사용해 보기
//패키지는 다르지만 상속관계에 있으므로 protected 접근제한자로 지정된 필드 p2에 접근할 수 있다.
//    public class AccessObjExam extends AccessObj{
//        public static void main(String[] args) {
//            AccessObjExam obj = new AccessObjExam();
//            System.out.println(obj.p);
//            System.out.println(obj.p2);
//            System.out.println(obj.k);// 컴파일 오류가 발생합니다.
//            System.out.println(obj.i);// 컴파일 오류가 발생합니다.
//        }
//    }


public class AccessObj {
	public int p = 3;       //어떤 클래스든 접근할 수 있다는 것을 의미
	protected int p2 = 4;  //자기 자신, 같은 패키지, 서로 다른 패키지다 하더라도 상속받은 자식 클래스에서는 접근할수 있다는 것을 의미
	private int i = 1;     //자기 자신만 접근할 수 있다는 것을 의미
	int k = 2;             //자기자신과 같은 패키지에서만 접근할 수 있다는 것을 의미
	
}
