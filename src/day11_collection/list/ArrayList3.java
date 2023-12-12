package day11_collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(5);
		list.add(4);
		list.add(0);
		list.add(2);
		list.add(1);
		list.add(3);
		
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		list2.add(200);
		print(list, list2);
		
		list.sort(null);
		Collections.sort(list2);
		print(list,list2);
		
		// 뒤의 list 앞의 list 가 포함되어있으면 true
		System.out.println("list.containsAll(list2) : " +list.containsAll(list2));
		list2.add("B");
		list2.add("C");   // 추가는 add
		print(list,list2);
		
		list2.set(3, "김연아");   // 데이터 교체는 set , 교체는 get
		print(list,list2);
		
		
	}

	public static void print(ArrayList list, ArrayList list2) {
		System.out.println("list  : "+ list);
		System.out.println("list2 : "+ list2);
		System.out.println();
		
	}

}
