package file.pk36;

import java.io.*;

public class InputStreamTest {

	public static void main(String[] args) {
		
		int dat=0;
		System.out.println("���ڸ� �Է��ϼ���~");
		try{
			dat=System.in.read();
			while(dat != -1){		//�Է¹��ڰ�   CTRL+Z Ű���ƴϸ�
				System.out.print((char)dat);
			    dat=System.in.read();
			}//while			
		}catch(IOException e){
			e.printStackTrace();
		}
	}//main

}//class
