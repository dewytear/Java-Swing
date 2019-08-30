package swing.pk31_event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventTest extends JFrame {

    private static final long serialVersionUID=1L;   
	public MouseEventTest(){		
		Container con=getContentPane();
		con.setLayout(new FlowLayout());
	
		addMouseListener(
				new MouseAdapter(){
					public void mousePressed(MouseEvent e){
						JOptionPane.showMessageDialog(null, "클릭하셨습니다");	
		}});
		
		addMouseMotionListener(
				new MouseMotionAdapter(){
					public void mouseMoved(MouseEvent e){
						JOptionPane.showMessageDialog(null, "이동하셨습니다");	
		}});
		
		setLocation(600,200);
		setSize(300,300); //프레임 크기 설정
		setVisible(true);       	
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		MouseEventTest obj=new MouseEventTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}

}
