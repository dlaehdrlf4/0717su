import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Dong2 extends Frame {
	public Dong2() {
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
		add("Center", p);
		
		add("South",l1);
	/*//ActionEvent�� ó���� ���ִ� 
	//	�ν��Ͻ� ����
		
		ActionListener listner = new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			
			l1.setText("�ȳ��ϼ���");
			}
		};
		//������Ʈ�� �̺�Ʈ�� ó���� �� �ִ� �����ʸ� ����
		btn1.addActionListener((java.awt.event.ActionListener) listner);
		*/
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// �̺�Ʈ�� ����� ������Ʈ�� ���ڿ��� ������
				//�б�
				switch(e.getActionCommand()) { //���ڿ��� ����.
				case "����":
					l1.setText("�ȳ��ϼ���");
					break;
				case "�浿":
					l1.setText("df");
					break;
				case "���̾�":
					System.exit(0);
					break;
			}}
				};
				//3�� ��ư�� �׼� �̺�Ʈ�� listener�� ��� ó��
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);
		
		setVisible(true);
	

	}
}
