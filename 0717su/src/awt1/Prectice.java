package awt1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Prectice extends Frame {
	public Prectice() {
		setBounds(500,500,500,500);
		setTitle("�̺�Ʈ ����");
		
		Panel p = new Panel();
		
		Button btn1 = new Button("����");
		Button btn2 = new Button("�浿");
		Button btn3 = new Button("���̾�");
		
		Label l1 = new Label();
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		
		add("South",l1);
		
		add("center",p);
		
		setVisible(true);
		
	}
}
