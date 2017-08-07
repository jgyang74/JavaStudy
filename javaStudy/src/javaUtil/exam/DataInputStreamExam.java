package javaUtil.exam;

import java.io.DataInputStream;
import java.io.FileInputStream;

//data.txt���� int���� ���ڰ� 3�� �������� ����ֽ��ϴ�. DataInputStream�� �̿��� ���� �о���� ���� sum�� �����ϼ���.

public class DataInputStreamExam {

	public static int read3(){
	    int sum = 0;
	    //data.txt�κ��� int�� 3���� �о�鿩�� sum�� ���ϼ���.
	    try(
	    		DataInputStream in = new DataInputStream(new FileInputStream("data4.txt"));
	    ) {
	    	int dt = 0;

	    	while(in.available()>0){
	    		dt = in.readInt();
	    		sum = sum+dt;
	    	}
	    	
	    }
	    catch(Exception e){
	    	e.printStackTrace();
	    }


	    System.out.println(sum);
	    //�Ʒ��� �׽�Ʈ�� ���� �ڵ��Դϴ�. �������� ������.     
	    return sum;
	  }
}
