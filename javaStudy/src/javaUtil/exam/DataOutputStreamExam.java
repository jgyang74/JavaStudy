package javaUtil.exam;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamExam {

	public static void main(String[] args) {
		try(
				DataOutputStream out = new DataOutputStream(new FileOutputStream("data3.txt"));
		) {
			out.writeInt(100); //���������� ����
			out.writeDouble(3.14);   //double Ÿ������ ���� 8 byte
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
