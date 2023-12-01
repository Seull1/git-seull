package day10_API.stringBuffer;

public class StringBufferMain {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		//문자열 추가 append : 무조건 뒤에 문자추가
		sb.append(" is Apple");
		System.out.println(sb);
		
		// 원하는 위치에 문자열 삽입
		sb.insert(7, " my");
		System.out.println(sb);  
		
		//문자열 변경
		sb.replace(8, 10, "your"); 
		System.out.println(sb);
		
	//	System.out.println(sb.reverse()); //문자열 역으로 출력
		System.out.println(sb.length());  //문자열 갯수 출력'
		
		//문자열 길이 조절
		sb.setLength(10);  
		System.out.println(sb);
		System.out.println(sb.capacity()); // 용량 확인
		
		
		
	}// main end

}
