package swing.pk27_components;

import java.awt.*;
import javax.swing.*;

public class TextPasswordTest extends JFrame {
	private static final long serialVersionUID=1L;
	
	public TextPasswordTest(){
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		JLabel lab=new JLabel("아이디");	
		JTextField obj=new JTextField(10);
		JLabel lab2=new JLabel("비 번");	
		JPasswordField obj2= new JPasswordField(10);
		con.add(lab);
        con.add(obj);
        con.add(lab2);
        con.add(obj2);
        setLocation(800,200);
        setSize(200,200); //프레임 크기 설정
        setVisible(true);        	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextPasswordTest obj=new TextPasswordTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}
}
