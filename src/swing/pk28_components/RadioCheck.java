package swing.pk28_components;

import java.awt.*;
import javax.swing.*;

public class RadioCheck extends JFrame {

    private static final long serialVersionUID=1L;
	
	public RadioCheck(){
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		JCheckBox chk1 =new JCheckBox("사과");
		JCheckBox chk2 =new JCheckBox("바나나");
		JCheckBox chk3 =new JCheckBox("오렌지");
		con.add(chk1); con.add(chk2); con.add(chk3);
		
		JRadioButton rdo1 = new JRadioButton("남성",true);  
		JRadioButton rdo2 = new JRadioButton("여성",false);
		con.add(rdo1); 	con.add(rdo2);
		
		ButtonGroup gr=new ButtonGroup();	// radio button은 그룹으로 묶어준다.
		gr.add(rdo1); 		gr.add(rdo2);       
                
        setLocation(800,200);
        setSize(250,200); //프레임 크기 설정
        setVisible(true);        	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioCheck obj=new RadioCheck();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}
}
