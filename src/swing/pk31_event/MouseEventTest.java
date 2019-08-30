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
						JOptionPane.showMessageDialog(null, "Ŭ���ϼ̽��ϴ�");	
		}});
		
		addMouseMotionListener(
				new MouseMotionAdapter(){
					public void mouseMoved(MouseEvent e){
						JOptionPane.showMessageDialog(null, "�̵��ϼ̽��ϴ�");	
		}});
		
		setLocation(600,200);
		setSize(300,300); //������ ũ�� ����
		setVisible(true);       	
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		MouseEventTest obj=new MouseEventTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}

}
