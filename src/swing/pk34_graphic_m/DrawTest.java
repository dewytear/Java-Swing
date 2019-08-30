package swing.pk34_graphic_m;

import java.awt.*;
import javax.swing.*;

public class DrawTest extends JFrame {

	public  DrawTest(){
    	setLocation(500,200);
     	setSize(400,400); //프레임 크기 설정
      	setVisible(true); 
	}	
	public void paint(Graphics g){
		g.setColor(new Color(249,128,250));
		g.drawOval(10,40,90,50);
		g.fillOval(100,40,90,50);
		
		g.setColor(Color.blue);
		g.drawArc(100,150,80,80,0,180);
		g.fillArc(200,150,160,80,0,270);
		
		int x1[]={250,250,150,300,250,300,290};
		int y1[]={330,300,340,380,350,330,320};
	
		g.setColor(Color.green);
		g.fillPolygon(x1,y1,7);
		
		int x2[]={90,120,65,190};
		int y2[]={330,230,250,320};
		g.setColor(Color.gray);
		g.drawPolyline(x2,y2,4);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawTest obj=new DrawTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE); 
	}

}
