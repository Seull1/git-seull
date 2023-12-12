package day12_collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//key / value 한쌍으로 처리,(set + list)
public class HashMap4 {
	public static void main(String[] args) {
		String[] data = {"A","K","C","D","K","SSS","S","K","K"};
		
		HashMap map = new HashMap();  // <TypeParmeter>는 wrapper class 만 들어간다
		
		for (int i = 0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				Integer value =(Integer)map.get(data[i]);
				
				map.put(data[i], new Integer(value.intValue()+1));
			}else {
				map.put(data[i], new Integer(1));
			}
		}
		
		Iterator it = map.entrySet().iterator();
//		System.out.println(it);
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			int value = ((Integer)e.getValue()).intValue();
			System.out.println(e.getKey() + " : "+ printBar('#',value)+ " "+value);
		}
	}

	private static Object printBar(char ch , int value) {
		char[] bar = new char[value];
		
		for (int i = 0; i < bar.length; i++) {
			bar[i]=ch;
			
		}
		return new String(bar);  //String(char[] chArr)
	}
	
}


