package awt1;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class Common extends Frame {
	// ������ - �ν��Ͻ��� ������ �� ȣ���ϴ� �޼ҵ�
	public Common() {
		//��ġ�� ũ�⸦ ����
		setBounds(200,200,500,500);
		//���� ����
		setTitle("�����ȭ����");
		
		//FileDialog ��ü�� �����ؼ� ȭ�鿡 ����ϰ�
		
		//������ ���� ��θ� ���̺� ���
		//fileDialog�� ������ �� ù��° �Ű������� 
		//Dialog �� Frame�� �ּ��ε�
		//������ ���� this�� �����ϸ�˴ϴ�.
		
		//FileDialog �ν��Ͻ� ����
		FileDialog f1 = new FileDialog(this,"ȣ��");
		//ȭ�� ���
		f1.setVisible(true);
		
		//������ ���丮�� �����̸��� ��������
		String filepath = f1.getDirectory() + f1.getFile();
		
		//���̺� ����
		Label l1 = new Label(filepath);
		//���� �����ӿ� �÷����� �Ǹ� ȭ�鿡 �������� ��
		add(l1);
		
	
		
		
		//ȭ�� ���
		setVisible(true);
	}
}
