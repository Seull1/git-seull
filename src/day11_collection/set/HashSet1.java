package day11_collection.set;

import java.util.HashSet;
import java.util.Set;

/*
public class HashSet1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();  // new HashSet<>();
		hs.add("키보드");
		hs.add("컵");
		hs.add("마우스");
		
		System.out.println("요소 개수 : "+ hs.size());
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		HashSet<Integer> hs2 = new HashSet<>();
		hs2.add(200);
		hs2.add(3);
		hs2.add(1000);
		hs2.add(30);
		
		System.out.println("=================");
		for(String item : hs) {
			System.err.println(item);
		}
		
		System.out.println("=================");
		for(String item : hs) {
			System.err.println(item);
		}
		
		System.out.println("----------------");
		it=hs2.iterator();
		while(it.hasNext()) {  //다음 요소가 있다면..
			System.out.println(it.next());  // 요소를 꺼내와서 출력
		}
		
	}

}
*/


//Set : 순서 없고 , 중복 허용허지 않음
public class HashSet1 {
	public static void main(String[] args) {
		
	
	Object[] objArr = {"1", new Integer(1), "2","3","4","4","4"};
	
	Set set = new HashSet();
	
	for(int i=0; i<objArr.length; i++) {
		set.add(objArr[i]);
	}
	System.out.println(set);
	}
}




