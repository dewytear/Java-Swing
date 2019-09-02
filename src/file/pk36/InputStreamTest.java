package file.pk36;

import java.io.*;

public class InputStreamTest {

	public static void main(String[] args) {
		
		int dat=0;
		System.out.println("문자를 입력하세요~");
		try{
			dat=System.in.read();
			while(dat != -1){		//입력문자가   CTRL+Z 키가아니면
				System.out.print((char)dat);
			    dat=System.in.read();
			}//while			
		}catch(IOException e){
			e.printStackTrace();
		}
	}//main

}//class
