package javaUtil.exam;

//������� ���� �������̽��� Ŭ������
//�ڹ� IO�� ũ�� byte���� ����°� ���� ���� �����Ŭ������ �����ϴ�.
//byte���� �����Ŭ������ ��� InputStream�� OutputStream�̶�� �߻�Ŭ������ ��ӹ޾� ��������ϴ�.
//����(char)���� �����Ŭ������ ��� Reader�� Writer��� �߻�Ŭ������ ��ӹ޾� ��������ϴ�.
//4���� �߻�Ŭ����(InputStream,OutputStreamReader,Reader,Writer)�� �޾Ƶ��̴� �����ڰ� �ִٸ�, �پ��� ����¹���� �����ϴ� Ŭ�����Դϴ�.
//4���� Ŭ������ �޾Ƶ��̴� �����ڰ� ���ٸ�, ���κ��� �Է¹��� ������, ��� ���������� ��Ÿ���� Ŭ�����Դϴ�.
//���Ϸ� ���� �Է¹ް� ���� ���� Ŭ���� : FileInputStream, FileOutputStream, FileReader, FileWriter
//�迭�� ���� �Է¹ް� ���� ���� Ŭ���� : ByteArrayInputStream, ByteArrayOutputStream, CharReader, CharWriter
//�ش� Ŭ�������� ���κ���, ��𿡶�� ����� ������ �� �ִ� IOŬ�����Դϴ�. �̷� Ŭ������ ��Ĵ�� Ŭ������� �մϴ�.
//DataInputStream, DataOutputStream���� Ŭ������ ���� �پ��� ������ ���� �Է¹ް� ����մϴ�.
//PrintWriter�� �پ��ϰ� ���� ����ϴ� pintln()�޼ҵ带 �������ֽ��ϴ�.
//BufferedReader�� ���� �Է¹޴� readLine()�޼ҵ带 �����ϴ�.
//�̷� Ŭ�������� �پ��� ������� �Է��ϰ�, ����ϴ� ����� �����մϴ�. �̷� Ŭ������ ����ϴ� Ŭ������� �մϴ�.

//IO�� Byte ������ ����°� Char ������ ��������� �������ϴ�.�ٽ� ���⼭ Byte Ŭ������ InputStream, OutputStream(�߻�Ŭ����)�� ��ӹް�
//Char Ŭ������  Reader, Writer(�߻�Ŭ����)�� ��ӹ޽��ϴ�.

//InputStream -> FileInputStream -> ByteArrayInputStream
//OutputStream -> OutputStream -> ByteArrayOutputStream
//Reader -> FileReader -> CharReader
//Writer -> FileWriter -> CharReader
//�� Ŭ�������� ��Ĵ�� Ŭ������� ��.
//DataInputStream, DataOutputStream, BufferedReader, PrintWriter => ����ϴ�Ŭ����
//�������, ��������(��Ĵ��)�� ������(����ϴ� Ŭ����)�� ������ ����Ѵ�.
//IO ���� Ŭ�������� Decorator Pattern ���·� ������. -> �ϳ��� Ŭ������ ����ϴ� ��ó�� �����ڿ��� ���μ� ���ο� ����� ��� �߰��� �� �ֵ��� Ŭ������ ����� ���




public class IOExam {
	public static void main(String[] args) {
		
	}
}
