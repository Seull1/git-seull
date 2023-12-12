package day12_collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//key / value 한쌍으로 처리,(set + list)
public class HashMap2 {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap();  //타입 값 지정 key,value
		map.put("연아", new Integer( 90));
		map.put("민", new Integer( 10));
		map.put("seull", new Integer( 100));
		map.put("심심", new Integer( 50));
		map.put("코코", new Integer(1));
//		System.out.println(map);
		
		Set set = map.entrySet(); System.out.println(set);  //set이 배열로 나옴
		Iterator it = set.iterator(); System.out.println(it.next());
		
//		Set set =(Set)map.entrySet().iterator();
		
		
		while(it.hasNext()) {
		Map.Entry e= (Map.Entry)it.next();  //key 랑 velue값 나누기
			System.out.println("이름 : " +e.getKey() + " , 점수 : "+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {  //다음요소가 있는지
			Integer i =(Integer)it.next();  //next()는 요소를 가져온다
			total += i.intValue();
		}
		
		System.out.println("===================");
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+(float)(total/set.size()));
		System.out.println("최고점수 : "+ Collections.max(values));
		System.out.println("최하점수 : "+ Collections.min(values));
	}

}
