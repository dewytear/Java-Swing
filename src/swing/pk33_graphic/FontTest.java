package swing.pk33_graphic;

import java.awt.*;
import javax.swing.*;

public class FontTest extends JFrame {

	private static final long serialVersionUID=1L;
	
	public FontTest(){
    	setLocation(500,200);
     	setSize(400,300); //프레임 크기 설정
      	setVisible(true); 
	}

	public void paint(Graphics g){
		g.setFont(new Font("궁서",Font.BOLD,20));
		g.drawString("안녕하세요? 자바강좌입니다~",30,100);
		
		g.setColor(Color.red);
		g.setFont(new Font("바탕",Font.BOLD,25));
		g.drawString("안녕하세요? 자바강좌입니다~",30,150);
		
		g.setColor(Color.blue);
		g.setFont(new Font("고딕",Font.BOLD,15));
		g.drawString("안녕하세요? 자바강좌입니다~",30,200);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FontTest obj=new FontTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE); 
	}

}
