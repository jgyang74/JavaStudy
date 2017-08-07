package javaUtil.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Byte단위 입출력 클래스는 클래스의 이름이 InputStream이나 OutputStream으로 끝납니다.
//
//파일로 부터 1byte씩 읽어들여 파일에 1byte씩 저장하는 프로그램을 작성
//파일로 부터 읽어오기 위한 객체 - FileInputStream
//파일에 쓸수 있게 해주는 객체 - FileOutputStream .
//read()메소드가
//byte를 리턴한다면 끝을 나타내는 값을 표현할 수가 없기 때문에, byte가 아닌 int를 리턴한다.
//음수의 경우 맨 좌측 비트가 1이 된다. 읽어들일 것이 있다면 항상 양수를 리턴한다고볼 수 있다. .
//FileInputStream과 FileOutputStream을 이용하여, 1바이트씩 읽어들여 1바이트씩 저장
//read()메소드가 리턴하는 타입은 정수인데, 정수 4바이트중 마지막 바이트에 읽어들인 1바이트를 저장한다.
//read()메소드는 더이상 읽어들일 것이 없을때 -1을 리턴한다.

//OS 수준에 따라 다른지 모르지만 1 byte씩 읽는 경우 OS에서 512byte를 읽고 여기서 1 byte일고 나머지 511byte를 버림.
//따라서 512byte씩 읽는것이 성능을 높이는 방법임.

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
