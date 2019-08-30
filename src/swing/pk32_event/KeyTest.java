package swing.pk32_event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyTest extends JFrame implements KeyListener {

	private static final long serialVersionUID=1L;
	private String str;	
	JTextArea area;	
	public  KeyTest(){
	     Container con = getContentPane();
	     con.setLayout(new FlowLayout());
	     area=new JTextArea(10,20);
	     con.add(area);
		
	     area.setText("Ű���带 ��������");;
		
   	     setLocation(500,200);
    	 setSize(300,300); //������ ũ�� ����
     	 setVisible(true);     

	}
	
	public void keyPressed(KeyEvent e){
		str="���� Ű�� "+ e.getKeyChar();
		area.setText(str+"�� "+e.getKeyCode()+"\n");
	}

	public void keyReleased(KeyEvent e){		
	}

	public void keyTyped(KeyEvent e){		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyTest obj=new KeyTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE); 
	}

}
