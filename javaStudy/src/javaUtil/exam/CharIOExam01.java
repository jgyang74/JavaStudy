package javaUtil.exam;

//char���� ����� Ŭ������ Ŭ���� �̸��� Reader�� Writer�� ���� ���ϴ�.
//
//char���� ����� Ŭ������ �̿��ؼ� Ű����� ���� ���� �Է� �޾Ƽ� �ֿܼ� ���
//System.in - Ű���带 �ǹ� (InputStream )
//BufferedReader - ���پ� �Է� �ޱ����� Ŭ����
//BufferedReader Ŭ������ �����ڴ� InputStream�� �Է¹޴� �����ڰ� ����.
//System.in�� InputStream Ÿ���̹Ƿ� BufferedReader�� �����ڿ� �ٷ� �� �� �����Ƿ� InputStreamReader Ŭ������ �̿��ؾ���.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam01 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Decoration Pattern.
		//Ű����� �Է¹��� ���ڿ��� �����ϱ� ���� line������ ����    
		String line = null;
		try {
			line = br.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(line);
		

	}

}
