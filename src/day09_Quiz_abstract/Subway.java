package day09_Quiz_abstract;

public class Subway extends Trans {

	public String start(String name) {
		result = "출발 합니다.";
		return result;
	}

	@Override
	public String stop(String name) {
		result = "정지 합니다.";
		return result;
	}
	
	public void show(String name) {
		start(name);
		System.out.println(name+"은 지금 "+ result);
	}

}
