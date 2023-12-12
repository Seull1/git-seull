package day11_collection.set;

import java.util.HashSet;
import java.util.Set;

class Person {// extends Object
	 String name;
	 int age;
	 
	 public Person(String name , int age) {
		 this.name =  name;
		 this.age = age;
	 }
	 
	 



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + age;
	}





	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Person) {
			Person temp = (Person) obj;
			return name.equals(temp.name) && (age == temp.age);
		}
		return false;
	}




	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}





	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}





	public String toString() {
		return "  Person [ name = " + name + " , age = "+ age + "]\n ";
		 
	 }
	
}// Person class end

public class HashSet2 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		
		
		Person ps = new Person("aaa",10);
		set.add(ps);
		set.add(new Person("seull",10));
		set.add(new Person("seull",33));
		set.add(new Person("seull",10));
		set.add(new Person("seull",102));
		System.out.println(set);
		
//		A a = new A();
//		B b = new B();
//		A bb = new B();
//		
//		// instanceof = 비교해서 맞으면 true 틀리면 false
//		// 앞에있는것이 뒤에있는것으로 변환이 되는지
//		System.out.println(b instanceof A);
//		System.out.println(b instanceof B);
//		System.out.println(a instanceof A);
//		System.out.println(a instanceof B);
//		
	}

}


class A{
	String name;
}

class B extends A{
	
}