package swing.pk30_window;

import java.awt.event.*;
import javax.swing.*;

public class PopupTest extends JFrame {

    private static final long serialVersionUID=1L;
	public PopupTest(){
		
		final JPopupMenu pop=new JPopupMenu();
		
		pop.add(new JMenuItem("���θ����"));
		pop.add(new JMenuItem("�����ϱ�"));
		pop.add(new JMenuItem("�ٿ��ֱ�"));
		pop.add(new JMenuItem("�߶󳻱�"));
				
		addMouseListener(
		   new MouseAdapter(){
			   public void mousePressed(MouseEvent e){
			      checkForTriggerEvent(e);
			   }
			       
		       public void mouseReleased(MouseEvent e){	       
			      checkForTriggerEvent(e);
		       }
			    
			   private void checkForTriggerEvent(MouseEvent e){
			      if(e.isPopupTrigger())
			    	  pop.show(e.getComponent(),e.getX(),e.getY());
		       }
		   }
	     );
			
		setLocation(600,200);
		setSize(300,300); //������ ũ�� ����
		setVisible(true);        	
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		PopupTest obj=new PopupTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}

}
