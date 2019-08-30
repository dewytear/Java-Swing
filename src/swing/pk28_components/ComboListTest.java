package swing.pk28_components;

import java.awt.*;
import javax.swing.*;

public class ComboListTest extends JFrame {

    private static final long serialVersionUID=1L;
	
	public ComboListTest(){
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		String season[] = {"��","����","����","�ܿ�"};
		JComboBox combo=new JComboBox(season);
		con.add(combo); 
		
		String season2[] = {"spring","summer","fall","winter"};
		JList  li=new JList(season2);
		
		JScrollPane scr=new JScrollPane(li); // ScrollBar�� �ʿ��� ������Ʈ
		li.setVisibleRowCount(4);
		li.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);	// ���ø�弳��
		con.add(li); 

        setLocation(800,200);
        setSize(200,200); //������ ũ�� ����
        setVisible(true);        	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComboListTest obj=new ComboListTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}
}
