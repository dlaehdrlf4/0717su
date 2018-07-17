import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemWindow extends Frame {
	public ItemWindow() {
		setBounds(500,500,500,500);
		setTitle("�̺�Ʈ ��鸵");
		
		Panel panel = new Panel();
		
		Checkbox con = new Checkbox("LA");
		Checkbox con1 = new Checkbox("MYAMI");
		Checkbox con2 = new Checkbox("CL");
		Checkbox con3 = new Checkbox("SICAGO");
		Checkbox con4 = new Checkbox("STATE");
		Checkbox con5 = new Checkbox("BOSTON");
	
		panel.add(con); 
		panel.add(con1);
		panel.add(con2);
		panel.add(con3);
		panel.add(con4);
		panel.add(con5);
		
		add("North",panel); // �������� ������ ��ġ�ϱ����ؼ�
		
		//�߾ӿ� TextArea ��ġ
		TextArea ta = new TextArea(20,70);
		add("Center", ta);
		
		// �޺��ڽ� 2�� ��ġ
		// �޺��ڽ��� ��ġ�� ������ �����
		String [] player = { "james","jordan","curry","Love","handen"};
		String [][] position ={ {"sf","fg"},{"pg","sg","sf"},{"sg","pg"},
				{"sf","c"},{"sg","sf","pf"}};
												
		Choice cb = new Choice();
		for(String ismi : player) {
			cb.add(ismi);
		}
		Choice cb1 = new Choice();
		for(String ismi : position[0]) {
			cb1.add(ismi);
		}
		Button btnSelect = new Button("����") ;
		Button btnExit = new Button("����") ;
		
		
		Panel southPanel = new Panel();
		southPanel.add(cb);
		southPanel.add(cb1);
		southPanel.add(btnSelect);
		southPanel.add(btnExit);
		
		add("South", southPanel);
		
		//üũ �ڽ��� ������ �� ȣ��� �޼ҵ�
		ItemListener handler = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				//ta.append(e.getSource().toString() + "�� �������ϴ�." + "\n");
				//tostring ���ڿ�
				//�̺�Ʈ�� �߻��� �ν��Ͻ��� ������ �ڷ�����
				//Checkbox�� ��ȯ
				// �̺�Ʈ ó�� �޼ҵ忡��
				//e.getSource()�� �̺�Ʈ�� �߻���
				//�ν��Ͻ��� �ּҸ� �����մϴ�.
				Checkbox cb = (Checkbox)(e.getSource());
				//üũ�ڽ��� �Էµ� �ؽ�Ʈ ��������
				String label = cb.getLabel();
				//üũ �ڽ� ���� ���� ��������
				boolean b= cb.getState();
				ta.append(label + " " + b + "�� ����\n"); // �ָ������� ���´�.
			}
		};
		//üũ�ڽ��� ������ �� ȣ��� �ν��Ͻ� ����
		con.addItemListener(handler);
		con1.addItemListener(handler);
		con2.addItemListener(handler);
		con3.addItemListener(handler);
		con4.addItemListener(handler);
		con5.addItemListener(handler);
		
		
		/*ActionListener listner = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch(e.getActionCommand()) {
				case "����" :
					System.exit(0);
					break;
				case "����" :
					System.exit(0);
					break;
					
				}
				
			}
			
		};
		btnExit.addActionListener(listner);*/
		
		//ī�װ� �޺� �ڽ��� ������ ����Ǿ��� ��
		//ȣ��� �޼ҵ带 ���� Listener
		//ItemListener�� ó��
		ItemListener handelr2 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				//cbcategory�� ���õ� �� ��ȣ ��������
				int row = cb.getSelectedIndex();
				//cb1�� ������ ���� ����
				cb1.removeAll();
				//���ȣ�� �ش��ϴ� ���� ������ cb1�� �߰�
				for(String temp : position[row]) {
					cb1.add(temp);
				}
			}
			
		};
		cb.addItemListener(handelr2);
		
		ActionListener listner = new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int caNum = cb.getSelectedIndex();
			int coNum = cb1.getSelectedIndex();
			String text = player[caNum];
			String text1 = position[caNum][coNum];
			ta.setText(text + ":" + text1);
			
			if(e.getActionCommand().equals("����")) {
				System.exit(0);
			}
			
		}
		
	};
	btnSelect.addActionListener(listner);
		// setText�� ������
	btnExit.addActionListener(listner);
	
		
		setVisible(true);
	}
}
