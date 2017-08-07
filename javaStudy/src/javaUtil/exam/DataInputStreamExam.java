package javaUtil.exam;

import java.io.DataInputStream;
import java.io.FileInputStream;

//data.txt에는 int형의 숫자가 3개 연속으로 들어있습니다. DataInputStream을 이용해 값을 읽어들인 다음 sum에 저장하세요.

public class DataInputStreamExam {

	public static int read3(){
	    int sum = 0;
	    //data.txt로부터 int값 3개를 읽어들여서 sum에 더하세요.
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
	    //아래는 테스트를 위한 코드입니다. 수정하지 마세요.     
	    return sum;
	  }
}
