package day12.Quiz.video;

public class Customer {
	protected String title;
	protected String category;
	protected char lend;
	protected String name;
	protected String date;
	
	
	public Customer() {
		
	}
	
	public Customer(String title,String category,char lend) {
		this.name=name;
		this.title=title;
		this.lend = lend;
	}
	
	
	public void Vdisplay() {
		System.out.println("비디오 제목 : " +title);
		System.out.println("장르 : "+category);
		System.out.println("고객 이름 : "+name);
		System.out.println("대여여부 : "+lend);
		System.out.println("대여 일자 : "+date);
		
	}
	

}
