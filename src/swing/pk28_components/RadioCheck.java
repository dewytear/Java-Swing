package swing.pk28_components;

import java.awt.*;
import javax.swing.*;

public class RadioCheck extends JFrame {

    private static final long serialVersionUID=1L;
	
	public RadioCheck(){
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		JCheckBox chk1 =new JCheckBox("���");
		JCheckBox chk2 =new JCheckBox("�ٳ���");
		JCheckBox chk3 =new JCheckBox("������");
		con.add(chk1); con.add(chk2); con.add(chk3);
		
		JRadioButton rdo1 = new JRadioButton("����",true);  
		JRadioButton rdo2 = new JRadioButton("����",false);
		con.add(rdo1); 	con.add(rdo2);
		
		ButtonGroup gr=new ButtonGroup();	// radio button�� �׷����� �����ش�.
		gr.add(rdo1); 		gr.add(rdo2);       
                
        setLocation(800,200);
        setSize(250,200); //������ ũ�� ����
        setVisible(true);        	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioCheck obj=new RadioCheck();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}
}
