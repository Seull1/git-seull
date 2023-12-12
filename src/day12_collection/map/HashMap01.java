package day12_collection.map;

import java.util.HashMap;
import java.util.Scanner;

//key / value 한쌍으로 처리,(set + list)
public class HashMap01 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("encore", "1234");  // id,pwd
		map.put("kosa", "1111");
		map.put("seull", "1234");
		map.put("encore", "1004");
		
		System.out.println(map);
		System.out.println("요소개수 : "+ map.size()); //key 중복 X
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id와 password 를 입력해 주세요. ");
			System.out.println("id : ");
			String id =sc.nextLine().trim();
			System.out.println("pwd : ");
			String pwd =sc.nextLine().trim();
			System.out.println();
		
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다.");
				continue;  //조건으로 다시 돌아가기
			}else {
				if(!(map.get(id).equals(pwd))) {
					System.out.println("비밀번호가 일치하지 않습니다");
				}else {
					//System.out.println("id와 pwd가 일치합니다.");
					System.out.println(id+"님 반갑습니다.");
					break;
				}
			}
			
		}// while end
		
	}

}
