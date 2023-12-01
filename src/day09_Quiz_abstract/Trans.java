package day09_Quiz_abstract;

public abstract class Trans {
	String result = "null";
	String result2 = "null";
	
	public abstract String start(String name);{
		String name ="출발";
	}
	public abstract String stop(String name);{
		String name ="정지";
	}

	public abstract void show(String name);
}
