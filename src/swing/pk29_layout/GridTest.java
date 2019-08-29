package swing.pk29_layout;

import java.awt.*;
import javax.swing.*;

public class GridTest extends JFrame {

	private static final long serialVersionUID=1L;
	public GridTest(){
		Container con = getContentPane();
		con.setLayout(new GridLayout(4,3));
				
		con.add(new JButton("1"));
		con.add(new JButton("2"));
		con.add(new JButton("3"));
		con.add(new JButton("4"));
		con.add(new JButton("5"));
		con.add(new JButton("6"));
		con.add(new JButton("7"));
		con.add(new JButton("8"));
		con.add(new JButton("9"));
		con.add(new JButton("*"));
		con.add(new JButton("0"));
		con.add(new JButton("#"));
		
        setLocation(800,200);
        setSize(200,200); //프레임 크기 설정
        setVisible(true);        	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridTest obj=new GridTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}

}
