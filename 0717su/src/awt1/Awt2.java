package awt1;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class Awt2 extends Frame {
	public Awt2() {
		setBounds(200,200, 500,500); // ũ�⳪ ��ġ�� ���� �����ϴ°�
		setTitle("���� ��ȭ ����");
		
		//���� ��ȭ���� �����
		FileDialog f1 = new FileDialog(this,"�Ļ�");
		
		//���丮 ����
		//f1.setDirectory(dir);
		
		//���� ��ȭ���ڸ� ȭ�鿡 ���
		f1.setVisible(true);
		
		//������ ���� ��� ��������
		String filePath = f1.getDirectory() + f1.getFile();
		//System.out.pritnln(filePath);
		Label label = new Label(filepath);
		add(label);
		
		setVisible(true);
	}
}
