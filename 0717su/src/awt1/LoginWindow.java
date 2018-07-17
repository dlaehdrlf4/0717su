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
	//생성자 - 인스턴스를 만들때 호출하는 메소드
	public LoginWindow() {
		//크기와 위치 및 타이틀 설정
		setSize(600,600);
		setLocation(300,300);
		setTitle("로그인");
		
		//패널을 생성
		Panel p = new Panel();
		Label label = new Label("아이디");
		TextField tx = new TextField(20);
		p.add(label);
		p.add(tx);
		
		Label labae1 = new Label("비밀번호");
		//컬럼의 크기를 줄이고 늘리고 한다. // 20자를 쓸수 있다
		TextField tx1 = new TextField(20);
		tx1.setEchoChar('*');
		//tx1.setEchoChar((char)97);
		p.add(labae1);
		p.add(tx1);
		
		//여러 줄 입력할 수 있는 텍스트 영역 만들기
		TextArea ta = new TextArea(20,30);
		p.add(ta);
	
		
		//패널을 프레임에 부착
		add(p);
		
		//메뉴 바 만들기
		MenuBar menuBar = new MenuBar();
		
		//메뉴 생성
		Menu file = new Menu("파일(F)");
		
		//메뉴를 메뉴 바에 부착
		menuBar.add(file);
		
		MenuItem newFile = new MenuItem("새로만들기");
		file.add(newFile);
		MenuItem newFile1 = new MenuItem("복사");
		file.add(newFile1);
		
		
		//메뉴 바를 윈도우에 배치
		setMenuBar(menuBar);
		
		
		//화면 출력
		setVisible(true);
	}
}
