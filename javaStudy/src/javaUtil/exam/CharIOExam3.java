package javaUtil.exam;

import java.io.FileWriter;
import java.io.PrintWriter;

public class CharIOExam3 {
	public static void main(String[] args) {
		PrintWriter pw = null;
		
		try{
			String line = null;
			
			//br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(new FileWriter("data5.txt"));
			
			//System.out.println("�ȳ��ϼ���. PrintWriter�Դϴ�.");
			
			//while((line = br.readLine()) != null) {
			line="�ȳ��ϼ���. PrintWriter�Դϴ�.";	
			pw.println(line);
				//System.out.println(line);
			//} 

		}catch(Exception e) {
			e.printStackTrace();	
		}finally {
			pw.close();
		}
	}

}
