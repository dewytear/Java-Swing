package swing.pk31_event;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ItemEventTest extends JFrame {

    private static final long serialVersionUID=1L;
    JCheckBox ch;    
	public ItemEventTest(){		
		Container con=getContentPane();
		con.setLayout(new FlowLayout());				
		ch= new  JCheckBox("����");
		con.add(ch);
		
		//CheckBoxHandler Ŭ���� ��ü ����
		//CheckBoxHandler Ŭ������ ItemEvent ó���̺�Ʈ�� itemStateChanged()�޼ҵ� ����
		CheckBoxHandler h = new CheckBoxHandler();
		
		//üũ�ڽ���ü�� ������ ���
		ch.addItemListener(h);		
		
		setLocation(600,200);
		setSize(300,300); //������ ũ�� ����
		setVisible(true);       	
	}
	
	private class CheckBoxHandler implements ItemListener{
		public void itemStateChanged(ItemEvent e){
			 JOptionPane.showMessageDialog(null, "�����ϼ̽��ϴ�");			 
		}
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		ItemEventTest obj=new ItemEventTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}

}
