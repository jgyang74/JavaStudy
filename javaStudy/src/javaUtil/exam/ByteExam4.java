package javaUtil.exam;

//data.dat�κ��� ���� �о�鿩 ȭ�鿡 ����ϴ� Ŭ����
//
//�پ��� Ÿ���� �����͸� �о �� �ִ� DataInputStream
//
//readInt() -������ �о���̴� �޼ҵ�
//readBoolean() - boolean ���� �о���̴� �޼ҵ�
//readDouble() - douboe ���� �о���̴� �޼ҵ�

//���Ͽ� ����� ������� �о� �鿩���Ѵ�.
//int, boolean, double������� �����Ͽ��� ������ �о���� ���� ���� ������ �о�� �Ѵ�.

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteExam4 {
	public static void main(String[] args) {
		
		try(
				DataInputStream in = new DataInputStream(new FileInputStream("data2.txt"));
		) {
			int i = in.readInt();
			boolean b = in.readBoolean();
			double d = in.readDouble();
			
			System.out.println(i);
			System.out.println(b);
			System.out.println(d);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
