package swing.pk34_graphic_m;

import java.awt.*;
import javax.swing.*;

public class RectTest extends JFrame {

	public RectTest(){
    	setLocation(500,200);
     	setSize(350,300); //프레임 크기 설정
      	setVisible(true); 
	}
	
	public void paint(Graphics g){
		g.setColor(new Color(249,128,250));
		g.drawLine(50,50,100,250);
		g.drawRoundRect(100,40,90,55,50,50);
		g.fillRoundRect(200,40,90,55,30,30);
		

		g.fill3DRect(100, 150, 90, 55, true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectTest obj=new RectTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE); 
	}

}
