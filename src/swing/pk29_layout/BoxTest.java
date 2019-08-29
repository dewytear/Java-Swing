package swing.pk29_layout;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BoxTest extends JFrame {

	private static final long serialVersionUID=1L;
	public BoxTest(){
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		Box obj1= Box.createVerticalBox();
		obj1.add(Box.createVerticalStrut(30));
		JRadioButton rab1 = new JRadioButton("����",true);  		
		ButtonGroup gr=new ButtonGroup();			
		gr.add(rab1); obj1.add(rab1);	
		
		obj1.add(Box.createVerticalStrut(30));
		JRadioButton rab2 = new JRadioButton("����",false);
		gr.add(rab2);obj1.add(rab2);
		obj1.add(Box.createGlue());
		
		JPanel left=new JPanel(new BorderLayout());
		left.setBorder(new TitledBorder(new EtchedBorder(),"����"));
		left.add(obj1,BorderLayout.CENTER);		
		
		Box obj2= Box.createVerticalBox();		
		obj2.add(Box.createVerticalStrut(30));
		obj2.add(new JCheckBox("�� ��"));		
		obj2.add(Box.createVerticalStrut(30));
		obj2.add(new JCheckBox("�� ��"));		
		obj2.add(Box.createVerticalStrut(30));
		obj2.add(new JCheckBox("�� ��"));		
		obj2.add(Box.createVerticalStrut(30));
		obj2.add(new JCheckBox("������"));
		obj2.add(Box.createGlue());		
		
		JPanel right=new JPanel(new BorderLayout());
		right.setBorder(new TitledBorder(new EtchedBorder(),"���"));
		right.add(obj2,BorderLayout.CENTER);			
		
		Box obj3= Box.createHorizontalBox();
		obj3.add(left);
		obj3.add(right);
		
		con.add(obj3,BorderLayout.CENTER);
			
        setLocation(800,200);
        setSize(300,300); //������ ũ�� ����
        setVisible(true);        	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxTest obj=new BoxTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}

}
