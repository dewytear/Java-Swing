package swing.pk33_graphic;

import java.awt.*;
import javax.swing.*;

public class FontTest extends JFrame {

	private static final long serialVersionUID=1L;
	
	public FontTest(){
    	setLocation(500,200);
     	setSize(400,300); //������ ũ�� ����
      	setVisible(true); 
	}

	public void paint(Graphics g){
		g.setFont(new Font("�ü�",Font.BOLD,20));
		g.drawString("�ȳ��ϼ���? �ڹٰ����Դϴ�~",30,100);
		
		g.setColor(Color.red);
		g.setFont(new Font("����",Font.BOLD,25));
		g.drawString("�ȳ��ϼ���? �ڹٰ����Դϴ�~",30,150);
		
		g.setColor(Color.blue);
		g.setFont(new Font("���",Font.BOLD,15));
		g.drawString("�ȳ��ϼ���? �ڹٰ����Դϴ�~",30,200);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FontTest obj=new FontTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE); 
	}

}
