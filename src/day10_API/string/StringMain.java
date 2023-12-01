package day10_API.string;

public class StringMain {
	public static void main(String[] args) {
		String s1 = "hungy";
		String s2 = "SEULL";
		
		System.out.println("s1 = "+s1 + "  s2 = "+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		System.out.println(s2.replace("L", "Java"));  // L글자를 JAVA 로 바꿔준다
//		s2 =s2.replace("L", "Java");  //아예 값 바꾸기
		String s3 = new String("     ab     cd     ");
		System.out.println(s3);
		System.out.println("length = "+ s3.length());
		s3 = s3.trim();  //공백 제거
		System.out.println("length = "+ s3.length());
		System.out.println(s3);
		
		int[] arr = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) { //lenght에 ()이없으니 함수아님
			
		} // for end
		
//		String s4 = new String("동해물 과 백두산이 마르고 닳도록?");
		String s4 = new String("동해물/과/백두산이/마르고/닳도록?");
//		String[] s5 = s4.split(" ");  // 스페이스마다 구분하기
		String[] s5 = s4.split("/");  //  /<- 이들어갈때마다 구분하기
		for (int i = 0; i < s5.length; i++) {
			System.out.println("분리된 " + i + " 번째 문자열 : "+ s5[i]);
		}
		
		String s6 ="123-12312-123";
		s5= s6.split("-");
		for (int i = 0; i < s5.length; i++) {
			System.out.println(s5[i]);
		}
		
		String s7 = "1234567890abcdefg 1234567890fasd";
		char ch = s7.charAt(15);
		System.out.println(ch);
		System.out.println(s7.indexOf('f'));  //해당 문자의 자릿수를 찾아준다
		System.out.println(s7.lastIndexOf('f')); // 마지막 자리의 f를 찾아준다
		
		System.out.println(s7.substring(3));  //3번 인덱스부터 끝까지 출력
		System.out.println(s7.substring(5,7));
		
		System.out.println(s2 + " 소문자 출력 toLowerCase() : "+ s2.toLowerCase());
		System.out.println(s1 + " 소문자 출력 toUpperCase() : "+ s1.toUpperCase());
		
		
		
	}// main end
}
