package awt1;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class Awt2 extends Frame {
	public Awt2() {
		setBounds(200,200, 500,500); // 크기나 위치를 같이 저장하는거
		setTitle("공통 대화 상자");
		
		//파일 대화상자 만들기
		FileDialog f1 = new FileDialog(this,"파상");
		
		//디렉토리 설정
		//f1.setDirectory(dir);
		
		//파일 대화상자를 화면에 출력
		f1.setVisible(true);
		
		//선택한 파일 경로 가져오기
		String filePath = f1.getDirectory() + f1.getFile();
		//System.out.pritnln(filePath);
		Label label = new Label(filepath);
		add(label);
		
		setVisible(true);
	}
}
