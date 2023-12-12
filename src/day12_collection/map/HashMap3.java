package day12_collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//key / value 한쌍으로 처리,(set + list)
public class HashMap3 {
	
	static HashMap phoneBook = new HashMap();
	
	
	
	public static void main(String[] args) {
		addPhoneNo("친구","seull","010-9999-6111");
		addPhoneNo("친구","민","010-456-7890");
		addPhoneNo("회사","준","010-1119-6111");
		addPhoneNo("회사","박박","010-444-4444");
		addPhoneNo("세탁","010-000-0000");
		
		printAll();
		
		
	}
	
	//그룹을 추가하는 메소드
	static void addGroup(String groupName){
		
	
	if(!phoneBook.containsKey(groupName)) {
		phoneBook.put(groupName, new HashMap());
	}
	}


//그룹에 전화번호를 추가하는 메소드
	private static void addPhoneNo(String groupName, String name, String tell) {
		addGroup(groupName); //addGroup 메소드의 값을 가져옴
		
		HashMap group = (HashMap)phoneBook.get(groupName); //map 안의 map 만들기
		group.put(tell, name); // 이름은 중복 될수 있으니 전화번호를 key값으로
		
	}
	
	public static void addPhoneNo(String name,String tel) {
		addPhoneNo("기타",name,tel);
	}
	
	//전화번호 전체 출력하는 메소드
	static void printAll() {
		Set set = phoneBook.entrySet(); //System.out.println(set);
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator suIt = subSet.iterator();
			
			System.out.println(" * "+e.getKey()+"["+subSet.size()+"]");
			
			while(suIt.hasNext()) {
				Map.Entry subE = (Map.Entry)suIt.next();
				String telNo =(String)subE.getKey();
				String name =(String)subE.getValue();
				System.out.println(name + " "+telNo);
				
			}
			System.out.println();
		}
	}

}



