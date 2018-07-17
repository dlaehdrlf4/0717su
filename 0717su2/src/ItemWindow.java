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
		setTitle("이벤트 헨들링");
		
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
		
		add("North",panel); // 윈도우의 북쪽의 배치하기위해서
		
		//중앙에 TextArea 배치
		TextArea ta = new TextArea(20,70);
		add("Center", ta);
		
		// 콤보박스 2개 배치
		// 콤보박스에 배치할 데이터 만들기
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
		Button btnSelect = new Button("선택") ;
		Button btnExit = new Button("종료") ;
		
		
		Panel southPanel = new Panel();
		southPanel.add(cb);
		southPanel.add(cb1);
		southPanel.add(btnSelect);
		southPanel.add(btnExit);
		
		add("South", southPanel);
		
		//체크 박스를 눌렀을 때 호출될 메소드
		ItemListener handler = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				//ta.append(e.getSource().toString() + "을 눌렀습니다." + "\n");
				//tostring 문자열
				//이벤트가 발생한 인스턴스를 원래의 자료형인
				//Checkbox로 변환
				// 이벤트 처리 메소드에서
				//e.getSource()는 이벤트가 발생한
				//인스턴스의 주소를 리턴합니다.
				Checkbox cb = (Checkbox)(e.getSource());
				//체크박스에 입력된 텍스트 가져오기
				String label = cb.getLabel();
				//체크 박스 선택 여부 가져오기
				boolean b= cb.getState();
				ta.append(label + " " + b + "로 변경\n"); // 주르르르륵 나온다.
			}
		};
		//체크박스를 눌렀을 때 호출될 인스턴스 설정
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
				case "선택" :
					System.exit(0);
					break;
				case "종료" :
					System.exit(0);
					break;
					
				}
				
			}
			
		};
		btnExit.addActionListener(listner);*/
		
		//카테고리 콤보 박스의 선택이 변경되었을 때
		//호출될 메소드를 가진 Listener
		//ItemListener가 처리
		ItemListener handelr2 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				//cbcategory의 선택된 행 번호 가져오기
				int row = cb.getSelectedIndex();
				//cb1의 내용을 전부 삭제
				cb1.removeAll();
				//행번호에 해당하는 세부 내용을 cb1에 추가
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
			
			if(e.getActionCommand().equals("종료")) {
				System.exit(0);
			}
			
		}
		
	};
	btnSelect.addActionListener(listner);
		// setText는 덮어씌우기
	btnExit.addActionListener(listner);
	
		
		setVisible(true);
	}
}
