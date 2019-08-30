package swing.pk28_components;

import java.awt.*;
import javax.swing.*;

public class JTextAreaTest extends JFrame {

    private static final long serialVersionUID=1L;
	
	public JTextAreaTest(){
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		JTextArea ta=new JTextArea(3,20);
		JScrollPane scr=new JScrollPane(ta);	// ScrollBar가 필요한 컴포넌트
		
        con.add(scr);
                
        setLocation(800,200);
        setSize(300,200); //프레임 크기 설정
        setVisible(true);        	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTextAreaTest obj=new JTextAreaTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}

}
