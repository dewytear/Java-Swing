package swing.pk28_components;

import java.awt.*;
import javax.swing.*;

public class ComboListTest extends JFrame {

    private static final long serialVersionUID=1L;
	
	public ComboListTest(){
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		String season[] = {"봄","여름","가을","겨울"};
		JComboBox combo=new JComboBox(season);
		con.add(combo); 
		
		String season2[] = {"spring","summer","fall","winter"};
		JList  li=new JList(season2);
		
		JScrollPane scr=new JScrollPane(li); // ScrollBar가 필요한 컴포넌트
		li.setVisibleRowCount(4);
		li.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);	// 선택모드설정
		con.add(li); 

        setLocation(800,200);
        setSize(200,200); //프레임 크기 설정
        setVisible(true);        	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComboListTest obj=new ComboListTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}
}
