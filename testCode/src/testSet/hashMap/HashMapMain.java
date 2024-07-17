package testSet.hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("십", 10);
		hm.put("이십", 20);
		hm.put("십", 30);
		hm.replace("삼십", 30);
		hm.remove("삼십");
		System.out.println(hm.keySet());
		System.out.println("=================");
		
		Iterator<String> keys = hm.keySet().iterator();
		do{
			String key = keys.next();
			System.out.println(key + " : " + hm.get(key));
		}while(keys.hasNext());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
