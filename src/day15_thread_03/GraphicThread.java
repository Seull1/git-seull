package day15_thread_03;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class GraphicThread extends JFrame
							implements Runnable {

	
	int num , x ,y;
	Color color ;
	Random random ;
	
	
	
	public GraphicThread(int num)  {  //생성자함수의 역할 - 초기화 담당  
		this.num = num;
		color = Color.blue;
		random = new Random();
		
		setSize(500,400);  //화면 크기
		setVisible(true); //화면 보여주기
		setLocation(500,250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기
				
	}

	


	@Override
	public void paint(Graphics g) {
		g.setColor(color);
//		g.fillRect(x, y, 3, 3);
		g.fillOval(x, y, 30, 30);
	}




	@Override
	public void run() {
		
		java.awt.Rectangle rect = getBounds();
		
		for (int i = 0; i < num; i++) {
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);
			
			repaint();
			
			try {
				Thread.sleep(3);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}
	public static void main(String[] args) {
		//1번
//		GraphicThread gt = new GraphicThread(100);
//		Thread t1 = new Thread(gt);
//		t1.start();
		
		// 2번
		new Thread(new GraphicThread(20000)).start();  //찍을 갯수
	}

}
