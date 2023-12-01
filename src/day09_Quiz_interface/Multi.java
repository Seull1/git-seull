package day09_Quiz_interface;

public class Multi implements Bus, Trans , Air {

	@Override
	public void start() {
		System.out.println("출발시 : ");
		System.out.println("버스는 "+Bus.name1);
		System.out.println("비행기는 "+Air.name1);
		
	}

	@Override
	public void stop() {
		System.out.println("도착시 : ");
		System.out.println("버스는 "+ Bus.name2);
		System.out.println("비행기는 "+Air.name1);
		
	}



}
