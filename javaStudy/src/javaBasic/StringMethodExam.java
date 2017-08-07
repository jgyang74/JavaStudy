package javaBasic;

public class StringMethodExam {

	public static void main(String[] args) {

		String str = "hello";
		System.out.println(str.length());  //str
		
		System.out.println(str.concat(" world"));  //출력결과는 hello world 
	    System.out.println(str);  //출력결과는 hello 
	 
	    System.out.println(str.substring(1, 3)); //출력결과  el
	    System.out.println(str.substring(2));   //출력결과 llo world
	}

}
