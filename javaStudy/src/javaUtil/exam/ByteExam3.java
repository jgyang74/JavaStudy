package javaUtil.exam;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

//try-with-resources �� ����
//java io��ü�� �ν��Ͻ��� �����, ��� ����ϸ� close()�޼ҵ带 ȣ���ؾ� �Ѵ�.
//close()�޼ҵ带 ����ڰ� ȣ������ �ʴ���, Exception�� �߻����� �ʾҴٸ� �ڵ����� close()�� �ǰ� �� �� �ִ� ���
//        try(
//                //io��ü ����
//        ){
//                //io��ü ���
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//�پ��� Ÿ������ ���� �� �� �ִ� DataOutputStream
//wirteInt() - ���������� ����
//wirteBoolean() - boolean������ ����
//writeDouble() - double ������ ����
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
			out.writeInt(100); //���������� ���� 4 byte
			out.writeBoolean(true);  //boolean Ÿ������ ���� 1 byte
			out.writeDouble(50.5);   //double Ÿ������ ���� 8 byte
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
