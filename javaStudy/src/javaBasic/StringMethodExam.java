package javaBasic;

public class StringMethodExam {

	public static void main(String[] args) {

		String str = "hello";
		System.out.println(str.length());  //str
		
		System.out.println(str.concat(" world"));  //��°���� hello world 
	    System.out.println(str);  //��°���� hello 
	 
	    System.out.println(str.substring(1, 3)); //��°��  el
	    System.out.println(str.substring(2));   //��°�� llo world
	}

}
