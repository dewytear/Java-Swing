package swing.pk27;

import java.awt.*;
import javax.swing.*;

public class JbuttonTest extends JFrame {

	private static final long serialVersionUID=1L;
	
	public JbuttonTest(){
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		JLabel lab=new JLabel("���̵�");	
		JTextField obj=new JTextField(10);
		JLabel lab2=new JLabel("�� ��");	
		JPasswordField obj2= new JPasswordField(10);
		JButton bu = new JButton("Ȯ ��");
		
		con.add(lab);
        con.add(obj);
        con.add(lab2);
        con.add(obj2);
        con.add(bu);
        setLocation(800,200);
        setSize(200,200); //������ ũ�� ����
        setVisible(true);        	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JbuttonTest obj=new JbuttonTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}

}
