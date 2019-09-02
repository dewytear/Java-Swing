package stream.pk37_io;

import java.io.*;

public class ObjectOutputStreamTest {

	public static void main(String[] args) {
		
		int num=37;
		String subject="Java programming";
		String title="ObjectOutputStream 클래스";
		String str="열심히 하세요^^";
		
		try{
			FileOutputStream f=new FileOutputStream("FOS.dat");
			ObjectOutputStream obj = new ObjectOutputStream(f);
			
			obj.writeObject(new Integer(num));
			obj.writeObject(subject);
			obj.writeObject(title);
			obj.writeObject(str);
			f.close();
			obj.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}//main

}//class
