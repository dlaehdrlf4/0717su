package awt1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Event extends Frame {
	public Event() {
		//윈도우의 시작 좌표와 크기를 설정
		setBounds(500,500,500,500);
		//윈도우의 제목을 설정
		setTitle("이벤트 처리");
		//여러 개의 컴포넌트들을 묶어 줄 패널 생성
		Panel p = new Panel();
		//버튼을 생성
		Button btn = new Button();
		//패널에 버튼을 추가
		p.add(btn);
		//패널을 윈도우에 추가
		add(p);
		//윈도우를 화면에 출력
		setVisible(true);
		
		//버튼을 누를 때 이벤트 처리는 ActionListner
		//인터페이스가 처리합니다.
		
		ActionListener list = new ActionListener() {
			
		};
		
		/*ActionListener list = new ActionListener() {
			@ovrride
			//버튼이 눌러지면 호출되는 메소드
			public void actionPerformed()
			//프로그램 종료
			System.exit(0);
			
		};*/
		
		//버튼과 리스너 연결
		//btn1에 ActionEvent가 발생하면
		//listener1의 메소드를 호출하도록 설정
		btn.addActionListener(list);
	}

	private ActionListner ActionListner() {
		// TODO Auto-generated method stub
		return null;
	}
}
