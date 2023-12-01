package day07_oop_quiz;
/*
 ## 생성자함수

-클래스명과 동일하

-리턴타입 없음(void조차 사용하지 않음)
리턴타입 쓰면 일반함수임

-중복정의 가능(overload 가능 - 중복함수)

-default constructor 갖고있음

(단 사용자가 생성자 함수 재정의 하면 디폴트함수 기능 상실함)

-멤버변수의 초기화 담당
 */
public class tv {
	
	
	public tv() {
		color = "gray";
		channel = 11;
	}
	
	public tv(String color){
		this.color=color;
	}
	
	public tv(int ch) {
		this.channel = channel;
		channel = ch;
	}
	
	
// 생성자 함수 끝------------------------------------------------	

	
	
	private int channel; // private 안쓰면 다른거랑 겹치면 에러남
	private String color;
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void display() {
		System.out.println(color + ","+ channel);
	}
	
	

}
