package day06.task.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		// key : value
		// map 컬렉션 클래스
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		hs.put("홍길동", 7518);
		hs.put("김길동", 1324);
		hs.put("고길동", 9567);
		hs.put("이길동", 1234);
		System.out.println(hs);
		Set<String> keys = hs.keySet();
		System.out.println(keys);
		
		ArrayList<Integer> ph = new ArrayList<Integer>();
		for (String key : keys) {
			ph.add(hs.get(key));
		}
		// ===========================
		// .json
		/*
		 * {
		 * 		key: {
		 * 			key1: value1,
		 * 			key2: value2
		 * 		},
		 * 		key3: {
		 * 			
		 * 		}
		 * }
		 */
		
		
		
		
		

	}

}
