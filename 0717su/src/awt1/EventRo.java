package awt1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;


public class EventRo extends Frame {
	public EventRo() {
		setBounds(500,500,500,500);
		setTitle("이벤트 라우딩");
		
		Panel p = new Panel();
		
		Button btn1 = new Button("동길");
		Button btn2 = new Button("길동");
		Button btn3 = new Button("파이어");
		
		Label l1 = new Label();
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		add("center",p);
		
		add("South",l1);
	/*//ActionEvent를 처리할 수있는 
	//	인스턴스 생성
		
		ActionListener listner = new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			
			l1.setText("안녕하세요");
			}
		};
		//컴포넌트와 이벤트를 처리할 수 있는 리스너를 연결
		btn1.addActionListener((java.awt.event.ActionListener) listner);
		*/
		ActionListener listener = new ActionListener() {
			public void actionP
		};
		
		
		setVisible(true);
	}
}
