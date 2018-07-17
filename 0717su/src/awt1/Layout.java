package awt1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.util.Random;

public class Layout extends Frame {
	public Layout() {
		//위치와 크기를 설정
				setBounds(200,200,500,500);
				//제목 설정
				setTitle("레이아웃 연습");
				
				Panel p = new Panel();
				
				//panel의 레이아웃을 설정
				//p.setLayout(new FlowLayout());
				
				
				/*//Button b1 = null;
				//컴포넌트 배치
				for(int i =0; i<10; i=i+1) { // 한번돌고나면 블록안에 내용은 없어진다.
					Button b1 = new Button("버튼" + i);
					p.add(b1);
				}*/
				
				/*
				p.setLayout(new BorderLayout());
				
				Button btn2 = new Button("서쪽");
				p.add("west", btn2);
				Button btn3 = new Button("동쪽");
				p.add("East", btn3);
				Button btn4 = new Button("중앙");
				p.add("Center", btn4);
				*/
				
				/*p.setLayout(new GridLayout(2,1,10,10));
				for(int i=0;i<6;i=i+1) {
					Button btn = new Button("버튼" + i);
					p.add(btn);
				}
				*/
				
				// 컴포넌트의 크기와 위치를 마음대로 변경할 수 있습니다.
				p.setLayout(null);
				Label l =new Label("#");
				l.setBounds(40,30,500,500);
				add(l);
				
				add(p);
				//화면 크기 조절을 못하도록 설정
				setResizable(false);
				
				//화면 출력
				setVisible(true);
				
			Thread th = new Thread() {
				public void run() {
					//무한 반복
					while(true) {
						int x = l.getLocation().x;
						int y = l.getLocation().y;
						//l.setLocation(x,y+10);
						Random r = new Random();
						l.setLocation(r.nextInt(200),r.nextInt(200));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
			th.start();
	}
}
