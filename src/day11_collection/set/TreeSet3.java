package day11_collection.set;

import java.util.Set;
import java.util.TreeSet;


public class TreeSet3 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		String from = "a";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("Car");
		set.add("car");
		set.add("dZZZZZ");
		set.add("dzzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		// 영문자/대>소>숫자>한글
		System.out.println(set); //대문자가 우선순위가 높아서 a보다 C가 먼저 나옴
		System.out.println("범위 : from " + from +  " to "+ to );
		System.out.println("결과 : "+set.subSet(from, to));
		System.out.println("결과 : "+set.subSet(from, to + "zz"));
		
	}
	
	
	}