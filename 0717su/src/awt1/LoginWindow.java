package awt1;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;





public class LoginWindow extends Frame {
	//������ - �ν��Ͻ��� ���鶧 ȣ���ϴ� �޼ҵ�
	public LoginWindow() {
		//ũ��� ��ġ �� Ÿ��Ʋ ����
		setSize(600,600);
		setLocation(300,300);
		setTitle("�α���");
		
		//�г��� ����
		Panel p = new Panel();
		Label label = new Label("���̵�");
		TextField tx = new TextField(20);
		p.add(label);
		p.add(tx);
		
		Label labae1 = new Label("��й�ȣ");
		//�÷��� ũ�⸦ ���̰� �ø��� �Ѵ�. // 20�ڸ� ���� �ִ�
		TextField tx1 = new TextField(20);
		tx1.setEchoChar('*');
		//tx1.setEchoChar((char)97);
		p.add(labae1);
		p.add(tx1);
		
		//���� �� �Է��� �� �ִ� �ؽ�Ʈ ���� �����
		TextArea ta = new TextArea(20,30);
		p.add(ta);
	
		
		//�г��� �����ӿ� ����
		add(p);
		
		//�޴� �� �����
		MenuBar menuBar = new MenuBar();
		
		//�޴� ����
		Menu file = new Menu("����(F)");
		
		//�޴��� �޴� �ٿ� ����
		menuBar.add(file);
		
		MenuItem newFile = new MenuItem("���θ����");
		file.add(newFile);
		MenuItem newFile1 = new MenuItem("����");
		file.add(newFile1);
		
		
		//�޴� �ٸ� �����쿡 ��ġ
		setMenuBar(menuBar);
		
		
		//ȭ�� ���
		setVisible(true);
	}
}
