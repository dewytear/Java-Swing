package swing.pk30_window;

import java.awt.*;
import javax.swing.*;

public class MenuTest extends JFrame {

    private static final long serialVersionUID=1L;
	public MenuTest(){
		JMenuBar bar=new JMenuBar();//1단계
		setJMenuBar(bar);//2단계
		
		//[File]메뉴생성
		JMenu fileM=new JMenu("File");//3단계
		fileM.setMnemonic('F');//단축키 Alt+F 지정
		
		//[New]메뉴생성
		JMenuItem newI=new JMenuItem("New");//4단계
		newI.setMnemonic('N');
		fileM.add(newI);
		
		//[Open]메뉴생성
		JMenuItem openI=new JMenuItem("Open");//4단계
		openI.setMnemonic('O');
		fileM.add(openI);
		
		bar.add(fileM);	
				
		//[Edit]메뉴생성
		JMenu editM=new JMenu("Edit");//3단계
		editM.setMnemonic('E');//단축키 Alt+F 지정
				
		//[Copy]메뉴생성
		JMenuItem copyI=new JMenuItem("Copy");//4단계
		copyI.setMnemonic('C');
		editM.add(copyI);
				
		//[Paste]메뉴생성
		JMenuItem pasteI=new JMenuItem("Paste");//4단계
		pasteI.setMnemonic('V');
		editM.add(pasteI);
				
		bar.add(editM);			
			
		setLocation(800,200);
		setSize(200,200); //프레임 크기 설정
		setVisible(true);        	
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		MenuTest obj=new MenuTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}

}
