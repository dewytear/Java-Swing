package swing.pk29;
import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;

public class BorderTest extends JFrame {
	private static final long serialVersionUID=1L;
	
	public BorderTest(){
		Container con = getContentPane();
		
		JButton b1= new JButton("1");
		JButton b2= new JButton("2");  
		JButton b3= new JButton("3");  
		JButton b4= new JButton("4"); 
		JButton b5= new JButton("Center"); 
		con.add(b1,BorderLayout.NORTH);
		con.add(b2,BorderLayout.EAST);
		con.add(b3,BorderLayout.WEST);
		con.add(b4,BorderLayout.SOUTH);
		con.add(b5,BorderLayout.CENTER);
		
        setLocation(800,200);
        setSize(300,200); //프레임 크기 설정
        setVisible(true);        	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorderTest obj=new BorderTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}
}
