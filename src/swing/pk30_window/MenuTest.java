package swing.pk30_window;

import java.awt.*;
import javax.swing.*;

public class MenuTest extends JFrame {

    private static final long serialVersionUID=1L;
	public MenuTest(){
		JMenuBar bar=new JMenuBar();//1�ܰ�
		setJMenuBar(bar);//2�ܰ�
		
		//[File]�޴�����
		JMenu fileM=new JMenu("File");//3�ܰ�
		fileM.setMnemonic('F');//����Ű Alt+F ����
		
		//[New]�޴�����
		JMenuItem newI=new JMenuItem("New");//4�ܰ�
		newI.setMnemonic('N');
		fileM.add(newI);
		
		//[Open]�޴�����
		JMenuItem openI=new JMenuItem("Open");//4�ܰ�
		openI.setMnemonic('O');
		fileM.add(openI);
		
		bar.add(fileM);	
				
		//[Edit]�޴�����
		JMenu editM=new JMenu("Edit");//3�ܰ�
		editM.setMnemonic('E');//����Ű Alt+F ����
				
		//[Copy]�޴�����
		JMenuItem copyI=new JMenuItem("Copy");//4�ܰ�
		copyI.setMnemonic('C');
		editM.add(copyI);
				
		//[Paste]�޴�����
		JMenuItem pasteI=new JMenuItem("Paste");//4�ܰ�
		pasteI.setMnemonic('V');
		editM.add(pasteI);
				
		bar.add(editM);			
			
		setLocation(800,200);
		setSize(200,200); //������ ũ�� ����
		setVisible(true);        	
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		MenuTest obj=new MenuTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}

}
