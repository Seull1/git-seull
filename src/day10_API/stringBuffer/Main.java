package day10_API.stringBuffer;

public class Main {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); //초기용량 = 16
		
		System.out.println(sb.hashCode());
		System.out.println("============");
		
		System.out.println("lenght       /        capacity");
		System.out.println(sb.length() +"    /    "+sb.capacity());
		System.out.println("============");
		
		sb.append("korea"); 
		///자바에서 용량은 늘어날떄 X2배로 늘어나고 그후 null문자 2바이트 추가로 늘어난다
		System.out.println(sb.length() +"    /    "+sb.capacity());
		System.out.println("============");
		sb.append("1237712345623277");
		System.out.println(sb.length() +"    /    "+sb.capacity());
		System.out.println("============");
		
		sb.append("1237712345623277  34567898765456");
		System.out.println(sb.length() +"    /    "+sb.capacity());
		System.out.println("============");
		
		sb.trimToSize(); // 메모리 공간 사이즈에 맞게 재조정
		System.out.println(sb.length() +"    /    "+sb.capacity());
		System.out.println("============");
		System.out.println(sb.hashCode());
	}

}
