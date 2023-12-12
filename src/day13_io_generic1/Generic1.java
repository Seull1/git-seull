package day13_io_generic1;

public class Generic1<T> {
	
	T[] v;  //멤버 변수
	
	public void set( T[] v) {
		this.v= v;
	}

	public void print() {
		for(T item : v)
			System.out.println(item);
	}
}
