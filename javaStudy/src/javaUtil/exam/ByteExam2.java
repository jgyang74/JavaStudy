package javaUtil.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Byte���� ����� Ŭ������ Ŭ������ �̸��� InputStream�̳� OutputStream���� �����ϴ�.
//
//���Ϸ� ���� 1byte�� �о�鿩 ���Ͽ� 1byte�� �����ϴ� ���α׷��� �ۼ�
//���Ϸ� ���� �о���� ���� ��ü - FileInputStream
//���Ͽ� ���� �ְ� ���ִ� ��ü - FileOutputStream .
//read()�޼ҵ尡
//byte�� �����Ѵٸ� ���� ��Ÿ���� ���� ǥ���� ���� ���� ������, byte�� �ƴ� int�� �����Ѵ�.
//������ ��� �� ���� ��Ʈ�� 1�� �ȴ�. �о���� ���� �ִٸ� �׻� ����� �����Ѵٰ� �� �ִ�. .
//FileInputStream�� FileOutputStream�� �̿��Ͽ�, 1����Ʈ�� �о�鿩 1����Ʈ�� ����
//read()�޼ҵ尡 �����ϴ� Ÿ���� �����ε�, ���� 4����Ʈ�� ������ ����Ʈ�� �о���� 1����Ʈ�� �����Ѵ�.
//read()�޼ҵ�� ���̻� �о���� ���� ������ -1�� �����Ѵ�.

//OS ���ؿ� ���� �ٸ��� ������ 1 byte�� �д� ��� OS���� 512byte�� �а� ���⼭ 1 byte�ϰ� ������ 511byte�� ����.
//���� 512byte�� �д°��� ������ ���̴� �����.

public class ByteExam2 {
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
        FileInputStream fis = null; 
        FileOutputStream fos = null;      
        
        try {
            fis = new FileInputStream("src/javaUtil/exam/ByteExam1.java");
            fos = new FileOutputStream("byte.txt");

            int readCount = -1;
            byte[] buffer = new byte[512];
            while((readCount = fis.read(buffer))!= -1){
                fos.write(buffer,0,readCount);
            }
            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                fos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
