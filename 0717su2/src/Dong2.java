import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Dong2 extends Frame {
	public Dong2() {
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
		add("Center", p);
		
		add("South",l1);
	/*//ActionEvent를 처리할 수있는 
	//	인스턴스 생성
		
		ActionListener listner = new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			
			l1.setText("안녕하세요");
			}
		};
		//컴포넌트와 이벤트를 처리할 수 있는 리스너를 연결
		btn1.addActionListener((java.awt.event.ActionListener) listner);
		*/
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 이벤트가 밸생한 컴포넌트의 문자열을 가지고
				//분기
				switch(e.getActionCommand()) { //문자열이 들어간다.
				case "동길":
					l1.setText("안녕하세요");
					break;
				case "길동":
					l1.setText("df");
					break;
				case "파이어":
					System.exit(0);
					break;
			}}
				};
				//3개 버튼의 액션 이벤트를 listener가 모두 처리
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);
		
		setVisible(true);
	

	}
}
