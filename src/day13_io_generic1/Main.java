package day13_io_generic1;

import java.util.Date;

class Point{}

public class Main {
public static void main(String[] args) {
	Generic1<String> t1 = new Generic1<String>();
	String[] str = {"Abc", "asd", "ddd"};
	t1.set(str);
	t1.print();
	System.out.println("-----------------");
	
	
	Generic1<Integer> t2 = new Generic1<Integer>();
	Integer[] num = {1,2,3,5};
	t2.set(num);
	t2.print();
	System.out.println("-----------------");
	
	
	Generic1<Double> t3 = new Generic1<Double>();
	Double[] d= {1.2,2.3,3.0,0.145};
	t3.set(d);
	t3.print();
	System.out.println("-----------------");
	
	Generic1<Object> t4 = new Generic1<Object>();
	Object[] obj= {1.2,"seull",new Date(),3.0,new Point(),0.145};
	t4.set(obj);
	t4.print();
	System.out.println("-----------------");
}


}
