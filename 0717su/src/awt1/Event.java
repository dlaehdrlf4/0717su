package awt1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Event extends Frame {
	public Event() {
		//�������� ���� ��ǥ�� ũ�⸦ ����
		setBounds(500,500,500,500);
		//�������� ������ ����
		setTitle("�̺�Ʈ ó��");
		//���� ���� ������Ʈ���� ���� �� �г� ����
		Panel p = new Panel();
		//��ư�� ����
		Button btn = new Button();
		//�гο� ��ư�� �߰�
		p.add(btn);
		//�г��� �����쿡 �߰�
		add(p);
		//�����츦 ȭ�鿡 ���
		setVisible(true);
		
		//��ư�� ���� �� �̺�Ʈ ó���� ActionListner
		//�������̽��� ó���մϴ�.
		
		ActionListener list = new ActionListener() {
			
		};
		
		/*ActionListener list = new ActionListener() {
			@ovrride
			//��ư�� �������� ȣ��Ǵ� �޼ҵ�
			public void actionPerformed()
			//���α׷� ����
			System.exit(0);
			
		};*/
		
		//��ư�� ������ ����
		//btn1�� ActionEvent�� �߻��ϸ�
		//listener1�� �޼ҵ带 ȣ���ϵ��� ����
		btn.addActionListener(list);
	}

	private ActionListner ActionListner() {
		// TODO Auto-generated method stub
		return null;
	}
}
