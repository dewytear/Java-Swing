package stream.pk37_io;

import java.io.*;
import javax.swing.JOptionPane;

public class DataStreamTest {

	public static void main(String[] args) {
		
		DataOutputStream Do=null;
		DataInputStream Di=null;
		
		String fname=JOptionPane.showInputDialog("파일명을 입력하세요~");
		
	    try{
			Do=new DataOutputStream(new FileOutputStream(fname));
			Do.writeInt(100);
			Do.writeChar('A');
			Do.writeBoolean(true);
			Do.writeDouble(12.3);
			Di=new DataInputStream(new FileInputStream(fname));
			System.out.println(Di.readInt());
			System.out.println(Di.readChar());
			System.out.println(Di.readBoolean());
			System.out.println(Di.readDouble());
			Do.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}//main

}//class
