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
		//��ġ�� ũ�⸦ ����
				setBounds(200,200,500,500);
				//���� ����
				setTitle("���̾ƿ� ����");
				
				Panel p = new Panel();
				
				//panel�� ���̾ƿ��� ����
				//p.setLayout(new FlowLayout());
				
				
				/*//Button b1 = null;
				//������Ʈ ��ġ
				for(int i =0; i<10; i=i+1) { // �ѹ������� ��Ͼȿ� ������ ��������.
					Button b1 = new Button("��ư" + i);
					p.add(b1);
				}*/
				
				/*
				p.setLayout(new BorderLayout());
				
				Button btn2 = new Button("����");
				p.add("west", btn2);
				Button btn3 = new Button("����");
				p.add("East", btn3);
				Button btn4 = new Button("�߾�");
				p.add("Center", btn4);
				*/
				
				/*p.setLayout(new GridLayout(2,1,10,10));
				for(int i=0;i<6;i=i+1) {
					Button btn = new Button("��ư" + i);
					p.add(btn);
				}
				*/
				
				// ������Ʈ�� ũ��� ��ġ�� ������� ������ �� �ֽ��ϴ�.
				p.setLayout(null);
				Label l =new Label("#");
				l.setBounds(40,30,500,500);
				add(l);
				
				add(p);
				//ȭ�� ũ�� ������ ���ϵ��� ����
				setResizable(false);
				
				//ȭ�� ���
				setVisible(true);
				
			Thread th = new Thread() {
				public void run() {
					//���� �ݺ�
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
