package day12_collection.map;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMap01 {
	public static void main(String[] args) {
		
		TreeMap<String,Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("zz",1000);
		tm.put("bb",1000);
		tm.put("aa",9999);
		tm.put("kk",1);
		tm.put("cc",1000);
		
		System.out.println("value : "+ tm.get("aa"));
		System.out.println(tm); //자동정렬됨 - key
		TreeSet set = new TreeSet();
		
		for (int i = 0; i < 6; i++) {
			set.add((int)(Math.random()*50)+1);
			
		}
		
		List list = new LinkedList(set);  // 방금만든 set을 list 타입으로 변환
		
		System.out.println(set);
	}

}
