package swing.pk27;
import java.awt.*;
import javax.swing.*;

public class JLabelTest extends JFrame {
	//Java5 버전부터 직렬화된 JFrame을 상속하면 자식의 
	//serialVersionUID를 상수로 정의해야함.
	private static final long serialVersionUID=1L;
		
	public JLabelTest(){
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		ImageIcon i=new ImageIcon("C:/label.jpg");
		JLabel lab=new JLabel("연   습");	
		JLabel lab2=new JLabel(i);
        con.add(lab);
        con.add(lab2);
        
        setLocation(800,200);
        setSize(300,300); //프레임 크기 설정
        setVisible(true);        	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JLabelTest obj=new JLabelTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}
}
