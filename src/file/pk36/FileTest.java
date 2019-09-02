package file.pk36;

import java.io.File;
import javax.swing.*;

public class FileTest {

	public static void main(String[] args) {
			
		String  str="";
		String name=JOptionPane.showInputDialog("파일명을 입력하세요~");
		File f=new File(name);
		
		if(f.exists()){			
			System.out.println("입력하신 이름은  "+f.getName()+"입니다");
			
			if(f.isDirectory())
				System.out.println("디렉토리명을 입력하셨습니다!");
			else
				System.out.println("파일명을 입력하셨습니다!");
			
			System.out.println("절대 경로는 "+f.getAbsolutePath()+"입니다");
			System.out.println("파일 크기는 "+f.length()+"바이트 입니다");			
		}else
			System.out.println("파일이 존재하지 않습니다");
			
	}//main

}//class
