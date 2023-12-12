package day11_collection.list;

import java.util.Iterator;
import java.util.Vector;

// list = 순서 있고,중복 허용
public class Vector1 {
	public static void main(String[] args) {
		
		Vector<Integer> v= new Vector<Integer>();
		System.out.println("length     /     capacity");
		System.out.println(v.size() + "          /    " +v.capacity());
		
		Vector<Integer> v2= new Vector<Integer>(3,4); //초기용량,증가 용량
		//초기 용량은 3이고 용량넘으면 용량4가 증가한다.
		
		v2.add(20);
		v2.add(12);
		v2.add(55);
		v2.add(99);
		v2.add(55);
		System.out.println(v2.size() + "          /    " +v2.capacity());
		
		System.out.println("------iterator()--------");
		Iterator it = v2.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		
		System.out.println();
		System.out.println("------get method()--------");
		for(int i =0;  i< v2.size(); i++) {
			System.out.print(v2.get(i)+ "\t");
		}
		
		System.out.println("\n------elementAt()--------");
		for (int i = 0; i < v2.size(); i++) { // Vector 에 있는모든 요소에 대해 반복
			Integer num = v2.elementAt(i);
			System.out.print(num + "\t");
			
		}
		System.out.print("\n \n"+v2.size() + "          /    " +v2.capacity());
		v2.trimToSize(); // capacity 재조정하기
		System.out.print("\n \n"+v2.size() + "          /    " +v2.capacity());
		
	}

}





