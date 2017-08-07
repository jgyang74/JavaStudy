package javaUtil.exam;
import java.util.*;

public class ListExam2 {

	  public List<String> addArray(String[]arr1, String[]arr2){
	    List<String> list = new ArrayList<String>();

//	    for(String str : arr1){
//	      System.out.println(str);     
//	    }
//
//	    for(String str : arr2){
//	      System.out.println(str);
//	    }
	    for(int i=0 ; i<arr1.length; i++) list.add(arr1[i]);
	    
	    for(int j=0; j<arr2.length; j++) list.add(arr2[j]);
	    
	    return list;
	  }

	  public static void main(String[] args){
		  String[] arr1 = {"kim","kang","lee"};
		  String[] arr2 = {"kim1","kang1","lee1"};
		  
		  ListExam2 list2 = new ListExam2();		  
		  
		  List<String> list = list2.addArray(arr1,arr2);
		  
		  Iterator<String> iter = list.iterator();
		  while(iter.hasNext()) {
			  String str = iter.next();  // next()메소드는 하나를 꺼낸다. 하나를 꺼내면 자동으로 다음것을 참조한다.
				System.out.println(str);
		  }
		  
	  }
	
}
