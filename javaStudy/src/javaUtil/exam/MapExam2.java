package javaUtil.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam2 {

	public Map<String,Integer> makeMap() {
		Map<String,Integer> products = new HashMap<>();
		
		products.put("가위", 2500);
		products.put("크레파스", 5000);
				
		return products;
	}
	
	public static void main(String[] args) {
		
		MapExam2 map = new MapExam2();
		
		Map<String,Integer> map2 = map.makeMap();
		
        Set<String> keys = map2.keySet(); // key값을 가져오기
		
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			int value = map2.get(key);
			System.out.println(key +":"+value);
		}
		
		
		
		

	}

}
