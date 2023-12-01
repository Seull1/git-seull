package day09_Quiz_abstract;

public class Bus extends Trans {

	@Override
	public String start(String name) {
		result = "출발 합니다.";
		return result;
	}

	@Override
	public String stop(String name) {
		result2 = "정지 합니다.";
		return result;
	}

	@Override
	public void show(String name) {
		start(name);
		System.out.println(name+"는 지금 "+ result);
	}

}
