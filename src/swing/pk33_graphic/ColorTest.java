package swing.pk33_graphic;

import java.awt.*;
import javax.swing.*;

public class ColorTest extends JFrame {

	private static final long serialVersionUID=1L;
	
	public ColorTest(){
    	setLocation(500,200);
     	setSize(300,300); //프레임 크기 설정
      	setVisible(true);   
	}
	
	public void paint(Graphics g){
		g.setColor(Color.green);
		g.fillRect(30,40,175,30);
		Color c=Color.PINK;
//		g.setColor(Color.blue);
		g.setColor(c);
		g.fillRect(30,95,225,30);			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorTest obj=new ColorTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE); 
	}

}
