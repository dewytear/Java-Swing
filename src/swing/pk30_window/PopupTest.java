package swing.pk30_window;

import java.awt.event.*;
import javax.swing.*;

public class PopupTest extends JFrame {

    private static final long serialVersionUID=1L;
	public PopupTest(){
		
		final JPopupMenu pop=new JPopupMenu();
		
		pop.add(new JMenuItem("새로만들기"));
		pop.add(new JMenuItem("복사하기"));
		pop.add(new JMenuItem("붙여넣기"));
		pop.add(new JMenuItem("잘라내기"));
				
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
		setSize(300,300); //프레임 크기 설정
		setVisible(true);        	
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		PopupTest obj=new PopupTest();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}

}
