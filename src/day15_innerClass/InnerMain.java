

/*
package day15_innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class InnerMain { //Outer clss
	
	class EventHandler implements ActionListener{ //inner class

	@Override
	public void actionPerformed(ActionEvent e) {  //버튼에 대한 모든 이벤트가 있슴action
		System.out.println("ActionEvent 발생했습니다");
		System.out.println(e.getActionCommand());
		System.out.println(e.getSource());
		
	}
			}// 버튼에 액션이벤트 추가
	public static void main(String[] args) {
		
		Frame frame = new Frame("이벤트처리 - 이너클래스"); //프레임(화면)
		Button btn = new Button("~~Button~~");
		
		//111111111111111
		EventHandler handler = new InnerMain().new EventHandler();
		btn.addActionListener(handler);
		
		frame.add(btn); //프레임에 버튼 추가
		frame.setVisible(true);
		frame.setSize(200,300);
		frame.setLocation(300, 150);	
		
	}

}
*/


/*
package day15_innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class InnerMain { //Outer clss
	
	
	public static void main(String[] args) {
		
		Frame frame = new Frame("이벤트처리 - 이너클래스"); //프레임(화면)
		Button btn = new Button("~~Button~~");
		
		//2222222222.
		btn.addActionListener(new ActionListener() { //익명(무명) 클래스
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
					System.out.println("ActionEvent 발생했습니다");
					System.out.println(e.getActionCommand());
					System.out.println(e.getSource());
					System.out.println("이것은 지금 만든 익명 클래스 이벤트 처리");
				
			}
		}); // 버튼에 액션이벤트 추가
		
		frame.add(btn); //프레임에 버튼 추가
		frame.setVisible(true);
		frame.setSize(200,300);
		frame.setLocation(300, 150);
		
	}

}
*/



package day15_innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class InnerMain { //Outer clss
	
	
	public static void main(String[] args) {
		
		Frame frame = new Frame("이벤트처리 - 이너클래스"); //프레임(화면)
		Button btn = new Button("~~Button~~");
		
		//333333333333.
		btn.addActionListener(new ActionListener() { //익명(무명) 클래스
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
					System.out.println("ActionEvent 발생했습니다");
					System.out.println(e.getActionCommand());
					System.out.println(e.getSource());
					System.out.println("이것은 지금 만든 익명 클래스 이벤트 처리");
				
					btn.setSize(50,50);

			}
		});
		
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.add(btn); //프레임에 버튼 추가
		frame.setVisible(true);
		frame.setSize(200,300);
		frame.setLocation(300, 150);
		
	}

}