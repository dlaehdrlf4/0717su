package awt1;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class Common extends Frame {
	// 생성자 - 인스턴스를 생성할 때 호출하는 메소드
	public Common() {
		//위치와 크기를 설정
		setBounds(200,200,500,500);
		//제목 설정
		setTitle("공통대화상자");
		
		//FileDialog 객체를 생성해서 화면에 출력하고
		
		//선택한 파일 경로를 레이블에 출력
		//fileDialog를 생성할 때 첫번째 매개변수가 
		//Dialog 나 Frame의 주소인데
		//지금의 경우는 this를 대입하면됩니다.
		
		//FileDialog 인스턴스 생성
		FileDialog f1 = new FileDialog(this,"호우");
		//화면 출력
		f1.setVisible(true);
		
		//선택한 디렉토리와 파일이름을 가져오기
		String filepath = f1.getDirectory() + f1.getFile();
		
		//레이블 생성
		Label l1 = new Label(filepath);
		//현재 프레임에 올려지게 되면 화면에 보여지게 됨
		add(l1);
		
	
		
		
		//화면 출력
		setVisible(true);
	}
}
