package Quiz.collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Customers {
	private String name,address,tel ;
	Scanner sc = new Scanner(System.in);
	
	public Customers() {
		this.name = "asd";
		this.address ="seoul";
		this.tel="0000-00000";
		
	}
	
	public void Customers(String name,String address,String tel) {
		System.out.println("asdds");
	}
	
	public void Add1() {
		name= sc.next();
		address = sc.next();
		tel=sc.next();
	}
	
	public void Set1() {
		name= sc.next();
		address = sc.next();
		tel=sc.next();
	}
	
	public void Get1() {
	name= sc.next();
	address = sc.next();
	tel=sc.next();
	}

	public Customers(String name, String address, String tel) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Customers [name=" + name + ", address=" + address + ", tel=" + tel + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", getTel()=" + getTel() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
		
		
	}

	