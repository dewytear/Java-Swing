package stream.pk37_io;

import java.io.*;

public class BufferTest {

	public static void main(String[] args) {
		
		String str="";
		BufferedReader  r=null;
		System.out.println("���ڸ� �Է��ϼ���~");
		
		try{
			
			while(true){
				r= new BufferedReader(new InputStreamReader(System.in));
				str=r.readLine();
				if(str.equals("stop"))break;
				System.out.println(str);
			}//while			
		}catch(IOException e){
			e.printStackTrace();
		}
	}//main

}//class
