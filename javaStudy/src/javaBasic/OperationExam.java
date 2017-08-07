package javaBasic;

public class OperationExam {
	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +11;
		int i3 = -11;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3; //i3 = i3+1
		System.out.println(i4);
		System.out.println(i3);
		
		int i5 = i3++; //i3 = i3+1
		System.out.println(i5);
		System.out.println(i3);
		
		int i = 5;
		int j = 2;
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j); //정수값만 return된다.
		
		System.out.println(i/(double)j);
		System.out.println(i%j);
		
		
		
	}
}
