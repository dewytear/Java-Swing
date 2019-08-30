package swing.pk31_event;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ItemEventTest extends JFrame {

    private static final long serialVersionUID=1L;
    JCheckBox ch;    
	public ItemEventTest(){		
		Container con=getContentPane();
		con.setLayout(new FlowLayout());				
		ch= new  JCheckBox("동의");
		con.add(ch);
		
		//CheckBoxHandler 클래스 객체 생성
		//CheckBoxHandler 클래스는 ItemEvent 처리이벤트인 itemStateChanged()메소드 지님
		CheckBoxHandler h = new CheckBoxHandler();
		
		//체크박스객체에 리스너 등록
		ch.addItemListener(h);		
		
		setLocation(600,200);
		setSize(300,300); //프레임 크기 설정
		setVisible(true);       	
	}
	
	private class CheckBoxHandler implements ItemListener{
		public void itemStateChanged(ItemEvent e){
			 JOptionPane.showMessageDialog(null, "동의하셨습니다");			 
		}
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		ItemEventTest obj=new ItemEventTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}

}
