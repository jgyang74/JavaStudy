package javaUtil.exam;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

//try-with-resources 블럭 선언
//java io객체는 인스턴스를 만들고, 모두 사용하면 close()메소드를 호출해야 한다.
//close()메소드를 사용자가 호출하지 않더라도, Exception이 발생하지 않았다면 자동으로 close()가 되게 할 수 있는 방법
//        try(
//                //io객체 선언
//        ){
//                //io객체 사용
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//다양한 타입으로 저장 할 수 있는 DataOutputStream
//wirteInt() - 정수값으로 저장
//wirteBoolean() - boolean값으로 저장
//writeDouble() - double 값으로 저장
//    import java.io.DataOutputStream;
//    import java.io.FileOutputStream;    
//    public class ByteExam3 {    
//        public static void main(String[] args) {
//            try(
//                    DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
//            ){
//                out.writeInt(100);
//                out.writeBoolean(true);
//                out.writeDouble(50.5);
//            }catch (Exception e) {
//                e.printStackTrace();
//            }
//        }   
//    }

public class ByteExam3 {
	public static void main(String[] args) {
		try(
				DataOutputStream out = new DataOutputStream(new FileOutputStream("data2.txt")); 
		   ){
			out.writeInt(100); //정수값으로 저장 4 byte
			out.writeBoolean(true);  //boolean 타입으로 저장 1 byte
			out.writeDouble(50.5);   //double 타입으로 저장 8 byte
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
