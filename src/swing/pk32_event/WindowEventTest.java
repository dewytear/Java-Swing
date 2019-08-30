package swing.pk32_event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

class WindowTest extends Frame {

    public WindowTest(){
 	  this.addWindowListener(
		new WindowAdapter(){
		      public void windowClosing(WindowEvent e){
			    JOptionPane.showMessageDialog(null, "Bye~~");	
			  System.exit(0);
		     }
		}
	);
  }

}

public class WindowEventTest {

    public static void main(String[] args) {
	Frame f=new WindowTest();
	f.setLocation(600,200);
	f.setSize(250,200);;
	f.setTitle("윈도우어댑터");
	f.setVisible(true);
 }


}
