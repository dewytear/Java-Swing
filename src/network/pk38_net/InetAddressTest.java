package network.pk38_net;

import java.net.*;
import javax.swing.JOptionPane;

public class InetAddressTest {

	public static void main(String[] args) {

		String str="";
		str=JOptionPane.showInputDialog("주소를 입력하세요~");
		try{
			while(str != "stop"){
				InetAddress obj=InetAddress.getByName(str);
				
				System.out.println(obj.getHostName());
				System.out.println(obj.getHostAddress());
				str=JOptionPane.showInputDialog("주소를 입력하세요~");
			}//while
		}catch(Exception e){
		}
		
	}//main

}//class