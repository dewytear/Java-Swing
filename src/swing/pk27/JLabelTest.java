package swing.pk27;
import java.awt.*;
import javax.swing.*;

public class JLabelTest extends JFrame {
	//Java5 �������� ����ȭ�� JFrame�� ����ϸ� �ڽ��� 
	//serialVersionUID�� ����� �����ؾ���.
	private static final long serialVersionUID=1L;
		
	public JLabelTest(){
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		ImageIcon i=new ImageIcon("C:/label.jpg");
		JLabel lab=new JLabel("��   ��");	
		JLabel lab2=new JLabel(i);
        con.add(lab);
        con.add(lab2);
        
        setLocation(800,200);
        setSize(300,300); //������ ũ�� ����
        setVisible(true);        	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JLabelTest obj=new JLabelTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}
}
