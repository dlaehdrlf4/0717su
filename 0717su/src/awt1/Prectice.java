package awt1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Prectice extends Frame {
	public Prectice() {
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
		
		add("South",l1);
		
		add("center",p);
		
		setVisible(true);
		
	}
}
