package network.pk38_net;

import java.net.*;
import javax.swing.JOptionPane;

public class InetAddressTest {

	public static void main(String[] args) {

		String str="";
		str=JOptionPane.showInputDialog("�ּҸ� �Է��ϼ���~");
		try{
			while(str != "stop"){
				InetAddress obj=InetAddress.getByName(str);
				
				System.out.println(obj.getHostName());
				System.out.println(obj.getHostAddress());
				str=JOptionPane.showInputDialog("�ּҸ� �Է��ϼ���~");
			}//while
		}catch(Exception e){
		}
		
	}//main

}//class