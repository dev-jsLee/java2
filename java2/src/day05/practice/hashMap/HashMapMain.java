package day05.practice.hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapMain {

	public static void main(String[] args) {
		// 해시맵은 키와 값의 한 쌍으로 이루어진 자료구조이다
		// 값에 접근할 때에는 키를 이용해서 접근해야 한다.
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		// 요소의 추가
		// put(K, V)
		hm.put("십이", 12);
		hm.put("십일", 11);
		hm.put("십삼", 13);
		hm.put("십오", 15);
		hm.put("십구", 19);
		
		// 이미 있는 키라면
		// 그 값을 덮어씌운다.
		hm.put("십오", 5); // 15->5
		System.out.println(hm);
		
		// 요소의 추출
		// get(K)
		System.out.println(hm.get("십일")); // 11
		// 요소가 없기 때문에 null값을 반환한다.
		System.out.println(hm.get("일"));
		
		// 키 목록을 Set 클래스 타입으로 반환
		// keySet()
		System.out.println(hm.keySet());
		
		System.out.println("====삭제====");
		// 요소의 삭제
		// remove(K) return V
		System.out.println(hm.remove("십일"));
		System.out.println(hm.get("십일"));
		
		// 요소의 치환/대입
		// replace(K, V)
		System.out.println("=====replace1======");
		System.out.println(hm.replace("십삼", 130));
		System.out.println("=====replace2======");
		System.out.println(hm.replace("십삼", 130, 13));
		System.out.println(hm.get("십삼"));
		
		System.out.println("==========iterator===========");
		Iterator it = hm.keySet().iterator();
		
		// hasNext() boolean
		// 다음 요소가 존재하는지 여부를 반환
		while(it.hasNext()) {
			// next()
			// 다음 요소 값을 들고오는 메서드
			String nextKey = (String) it.next(); // 다운캐스팅
			
			// 키를 이용해 값을 가져온다.
			Integer value = hm.get(nextKey); 
			System.out.print(value + " ");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
