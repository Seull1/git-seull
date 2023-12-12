package day14_io_Quiz;

public class BMI {
	
	protected String name;
	protected double kg;
	protected double cm;
	protected String jud = "정상";
	protected double bmi;
	
	
	BMI(){
		
	}

	 BMI(String name ,double kg, double cm) {
		this.name = name;
		this.kg = kg;
		this.cm = cm;
	}
	
	 public void display() {
		 
		 bmi=kg/(( cm /100.0) * (cm/100.0));
		 
		 System.out.println("이름 : " + name);
		 System.out.println("몸무게 : " + kg);
		 System.out.println("키 : "+cm);
		 System.out.println("bmi : "+bmi);
		 
		 if(bmi >=25.0) System.out.println("비만입니다. 돼지...");
		 else if(bmi >23) System.out.println("과체중 입니다..");
		 else if(bmi >18.5) System.out.println("정상입니다.. ^^");
		 else System.out.println("저체중(멸치)입니다.. ");
	
		 
		 
	 }
}
