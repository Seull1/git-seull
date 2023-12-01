package day08_inheritance02;

public class Main {
	public static void main(String[] args) {
		
		Grades g = new Grades();
		Student s= new Student();
		s.input();
		s.disp();
		System.out.println();
		if(s.jumsu>90) {System.out.println(g.getGradeA());
	}else if(s.jumsu>80) {System.out.println(g.getGradeB());
	}else if(s.jumsu>70) {System.out.println(g.getGradeC());
	}else if(s.jumsu>60) {System.out.println(g.getGradeD());
	}else {System.out.println("학점 : F 학점은 장학금이 없습니다");
	}
}
}