package file.pk36;

import java.io.*;

public class ReaderTest {

	public static void main(String[] args) {
		
		int dat=0;
		Reader I=null;
		System.out.println("���ڸ� �Է��ϼ���~");
		
		try{
			I=new InputStreamReader(System.in);
			dat = I.read();
			while(dat != -1){		//�Է¹��ڰ�   CTRL+Z Ű���ƴϸ�
				System.out.print((char)dat);
			    dat = I.read();
			}//while			
		}catch(IOException e){
			e.printStackTrace();
		}
	}//main

}//class
